/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment;

import java.io.IOException;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Vladimir
 */
public class Assigment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse("dictionary.xml");
            
            Element root = document.getDocumentElement();
            NodeList words = root.getElementsByTagName("word");
            String language="de";
            String targetLanguage = "srb";
            String wordToTranslate="essen";
            String translatedWord ="";
            for(int i =0; i< words.getLength(); i++){
                Element word = (Element)words.item(i);
                
                String currentWord = word.getElementsByTagName(language).item(0).getTextContent();

                if(wordToTranslate.equals(currentWord)){
                    translatedWord= word.getElementsByTagName(targetLanguage).item(0).getTextContent();
                    System.out.println("Word to translate: "+wordToTranslate +", is found!"+
                            "language to be translated to is: "+targetLanguage+ ", and translation is: " +translatedWord);
                }
                
            }
            if(translatedWord.equals("")){
                System.out.println("Word "+ wordToTranslate + " is not in dictionary");
            }
           
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Assigment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Assigment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Assigment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
