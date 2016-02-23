/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Vladimir
 */
public class FileSystem {

    /**
     * @param args the command line arguments
     */
    //Ako se poziva INFO za folder onda moram da saberem velicine svih fajlova u svim podfolderima
    public static long folderSize(File directory) {
            long length = 0;
            for (File file : directory.listFiles()) {
                if (file.isFile())
                    length += file.length();
                else
                    length += folderSize(file);
            }
            return length;
        }
    
    //vraca putanju koju koristim za File. Proverava da li je zadata apsolutna putanja do fajla i ako jeste vraca to kao string
    //ili je zadato samo ime fajla, sto znaci da treba da dodam putanju do trenutnog foldera
    public static String pathParse(String path, File currentDir){
        String[] parsed = path.split("\\\\");
        
        if(parsed.length>1)
            return path;
        else
            return currentDir.getAbsolutePath()+"\\"+path;             
    }
    //za CD je malo drugacije pa imam posebnu funkciju za njega.
    //prvo string u kome je putanja !bez komande CD! delim po \ pa ako ima vise od 1 clana onda je zadata apsolutna putanja npr. CD C:\ITAcademy\vlada
    //znaci, vracam to nazad
    //ukoliko imam samo jedan argument, 
    //onda je uneto c: npr. onda vraca c:\ (zato sto nekad c: gleda kao fajl a ne kao folder, ne znam tacno zasto)
    //ili trenutna putanja pa \ pa putanja(u ovom slucaju to je samo naziv foldera i onda \ kako bi moglo da
    //se koristi CD ime_foldera ukoliko folder postoji u folderu u kome se trenutno nalazimo a ne da moramo da kucamo punu putanju
    public static String changeDirectoryParse(String path, File currentDir){
        String[] parsed = path.split("\\\\");
        
        if (parsed.length >1){
            return path;
        }else if(!parsed[0].endsWith(":"))
            return currentDir.getAbsolutePath()+"\\"+path+"\\";
        else
            return path + "\\";
        
    }
    
    //LIST 
    public static void list(String[] arguments, File currentDir){
        File path = new File("");
        
        if (arguments.length >1)
            path = new File(pathParse(arguments[1], currentDir));
        else
           path = currentDir;//Uneto je samo LIST, znaci izlistavam trenutni folder
        
        if(path.exists() && path.isDirectory()){
            
            String[] elements = path.list();
            if (elements.length<1){
                System.out.println("Direktorijum je prazan!");
            }else{
                for (int i=0; i<elements.length; i++){
                    if((new File(currentDir+"\\"+elements[i])).isDirectory())// Ako je dir onda se ispisuje sa < >
                     System.out.println("<"+elements[i]+">");
                    else
                     System.out.println(elements[i]); 
                }
            }
        }
    }
    //INFO
    public static void info(String [] arguments, File currentDir){
        if(arguments.length != 2)// prvo da vidimo da li je zadat i naziv fajla/foldera tj. da li je komanda uneta ispravno
            System.out.println("Nepravilna upotreba komande INFO.\nIspravna upotreba: INFO nazivFajla/foldera");
        else{
            File path = new File(pathParse(arguments[1], currentDir));
            //System.out.println("Javljam se iz info"+currentDir.getAbsolutePath());
            if (path.exists()){//Ako postoji radi
                //String tmp = path.getName();
                System.out.println("============Pocetak Prikaza INFO komande==============");
                System.out.format("%-30s|%-70s\n","|Property", "Vrednost");
                System.out.format("%-30s|%-70s\n","|Naziv:",path.getName());
                System.out.format("%-30s|%-70s\n","|Apsolutna putanja:",path.getAbsolutePath());
                if(path.isFile()){//Ako je fajl samo size
                    String tmp = path.length()+" bytes";
                    System.out.format("%-30s|%-70s\n","|Velicina fajla:",tmp);
                }
                else
                    if (path.isDirectory()){//Ako je folder onda moram da prodjem kroz sve podfoldere 
                                        //                    i da saberem velicine svih fajlova
                        String tmp = folderSize(path) + " bytes";
                        System.out.format("%-30s|%-70s\n","|Velicina foldera:",tmp);
                    }//Kraj za velicinu
                //Last modified
                Instant instant = Instant.ofEpochMilli(path.lastModified());//last modified vraca podatak u milisekundama od 1970... pa zato instant
                LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());//ovde instant formatiram u nesto sto je nama razumljivo
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd. MMMM yyyy. HH:mm:ss");//pattern
             
                System.out.format("%-30s|%-70s\n","|Poslednji put modifikovan: ",dateTime.format(dateTimeFormatter));//i konacno ispis   
                //mora da stoji u try/catch readAttributes baca IOException
                try{
                    BasicFileAttributes attrs = Files.readAttributes(path.toPath(), BasicFileAttributes.class);//ovo je potrebno za date created
                    dateTime = LocalDateTime.ofInstant(attrs.creationTime().toInstant(),ZoneId.systemDefault());//ovde citam kad je kreiran sa attr.creationTime, u instant, i sve konvertujem u datum
                    System.out.format("%-30s|%-70s\n","|Datum kreiranja: ",dateTime.format(dateTimeFormatter));//ispis
                }catch(IOException ex){
                    ex.printStackTrace();
                }
                System.out.println("============Kraj Prikaza INFO komande==============");
            }                
        }
    }//Kraj od info()
    //COPY
    public static void kopiranje(String[] arguments, File currentDir){
        if(arguments.length !=3){
            System.out.println("Pogresna upotreba komande COPY.\nIspravna uptreba: COPY arg1 arg2\narg1: fajl/folder za kopiranje"
                                    + " arg2 odredisni fajl/folder");
        }else{
            File source = new File(pathParse(arguments[1], currentDir));
            File destination = new File(pathParse(arguments[2], currentDir));
            
            if (destination.isDirectory()){
                destination = new File(destination.getAbsoluteFile()+"\\"+source.getName());
            }
            try{
                Files.copy(source.toPath(), destination.toPath());
                System.out.println("Kopiranje uspesno izvrseno!");
            }catch(IOException ex){
                //ex.printStackTrace();
                System.out.println(ex);
            }
        }
        
    }
    //DELETE
    public static void brisanje(String[] arguments, File currentDir){
        if (arguments.length != 2){
            System.out.println("Pogresna upotreba komande DELETE.\n"
                              + "Ispravno je: DELETE fileName\nfileName je ime fajla koji se brise");
        }
        else{
            File path = new File(pathParse(arguments[1], currentDir));
            if(path.delete())
                System.out.println(path.getName() + " Uspesno obrisan!");
        }    
    }
    
    //MOVE je zapravo samo kopiranje i onda brisanje
    public static void premestanje(String[] arguments, File currentDir){
        kopiranje(arguments, currentDir);
        String[] arg = {arguments[0],arguments[1]};
        brisanje(arg, currentDir);
    }
    
    //RENAME
    public static void rename(String[] arguments, File currentDir){
        if (arguments.length !=3){
            System.out.println("Pogresna upotreba komande RENAME.\nIspravno je: RENAME fileName1 fileName2\n"
                                    + "fileName1 je fajl cije ime menjamo; fileName2 je novo ime!");
        }else{
            File oldFile = new File(pathParse(arguments[1], currentDir));
            File newFile = new File(pathParse(arguments[2],currentDir));
            oldFile.renameTo(newFile);
            System.out.println(oldFile.getAbsolutePath()+" je uspesno preimenovan u "+newFile.getAbsolutePath());
        }
    }
    
    //CREATE_DIR
    public static void createDir(String[] arguments, File currentDir){
        if (arguments.length!=2){
            System.out.println("Pogresna upotreba komande CREATE_DIR.\nIspravna upotreba: CREATE_DIR arg1\narg1 je naziv novog direktorijuma");
        }else{
            File path = new File(pathParse(arguments[1],currentDir));
            path.mkdir();                   
        } 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String command = new String(" ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arguments;
        File currentDir = new File(System.getProperty("user.dir"));
        
        System.out.println("***Dobrodosli u File browser MAX XTREME ULTRA PLUS!***");
        System.out.println("Za spisak komandi unesite HELP\n\n");
        while(!command.equalsIgnoreCase("exit")){
             try{
               
                System.out.print("[" +currentDir.getAbsolutePath() +"]"+ " Unesite komandu: ");
                command = in.readLine();
                arguments = command.split(" ");//delim unetu komandu po " " kako bih dobio niz parametara gde je komanda prvi clan niza a argumenti su svi ostali
                
                switch (arguments[0]){
                    case "njanja":
                        System.out.println("Uneto je njanja");
                        break;
                    case "hello":
                        System.out.println("Hello! Have a nice day! :)");
                        if(arguments.length >1){
                            System.out.println(arguments[1]);
                        }
                        break;
                    case "LIST":
                        //if(arguments[1].isEmpty())
                        list(arguments, currentDir);                      
                    break; 
                    case "INFO":
                        info(arguments,currentDir);

                    break;//kraj info!
                    case "CD":
                        if(arguments.length==2){
                            if (arguments[1].contains("..")){
                                if(currentDir.getParent()!= null){
                                    File tmp = new File(currentDir.getParent());
                                    currentDir = tmp;
                                }
                            
                            }else{
                                
                                File tmp = new File(changeDirectoryParse(arguments[1], currentDir));
                                if (tmp.isDirectory())
                                    currentDir=tmp;
                                else
                                    System.out.println("Naveden je naziv fajla!");
                            }
                        }else{
                            System.out.println("Nepravilna upotreba komande CD\n"
                                    + "Ispravno je: CD arg1\narg1 predstavlja putanju do zeljenog foldera\n"
                                    + "takodje moguce je za arg uneti .. (CD ..) kako bi se vratili jedan direktorijum unazad");
                        }
                         
                    break;
                    case "CREATE_DIR":
                        
                        createDir(arguments, currentDir);
                       
                    break;
                    
                    case "RENAME":
                        rename(arguments, currentDir);
                    break;
                     
                    case "DELETE":
                       brisanje(arguments,currentDir);
                    break;
                        
                    case "COPY":
                        kopiranje(arguments, currentDir);
                    break;
                    
                    case "MOVE":
                        premestanje(arguments, currentDir);
                    break;
                    
                    case "PATH":
                        //boolean nja = pathParse(arguments[1]);
                        //System.out.println(nja);
                    break;
                    
                    case "HELP":
                        System.out.println("Dobrodosli u File browser MAX XTREME ULTRA PLUS!\n"
                                + "Lista komandi je:\n"
                                + "INFO -------- Informacija o fajlu/direktorijumu\n"
                                + "COPY -------- Kopiranje\n"
                                + "DELETE ------ Brisanje\n"
                                + "MOVE -------- Premestanje\n"
                                + "LIST -------- Izlistavanje sadrzaja foldera\n"
                                + "RENAME ------ Preimenovanje\n"
                                + "CREATE_DIR -- Kreiranje direktorijuma\n"
                                + "CD ---------- Menjanje trenutnog direktorijuma\n"
                                + "EXIT -------- Izlaz iz programa");
                    break;
                    
                    default:
                        System.out.println("Nepostojeca komanda!\nZa listu komandi ukucajte HELP");
                    break;
                        
                }    
             }catch(IOException ex){
                 System.out.println(ex);
             }
        }
    }
    
}
