/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osobe;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Vladimir
 */
public class Person {
    String ime;
    String prezime;
    LocalDate datumRodjenja;
    String mestoRodjenja;
    private DateTimeFormatter dtfOut = DateTimeFormatter.ofPattern("dd.MMM yyyy.");
    private DateTimeFormatter dtfIn = DateTimeFormatter.ofPattern("ddMMyyyy");
    
    //public void Person(){}
    public Person (String ime, String prezime, String datumRodjenja, String mestoRodjenja){
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = LocalDate.parse(datumRodjenja, dtfIn);
        this.mestoRodjenja = mestoRodjenja;
    }
    
    @Override
    public String toString(){
        return "Ime: "+this.ime+", Prezime: "+this.prezime+", Datum rodjenja: "+
                this.datumRodjenja.format(dtfOut)+ ", Mesto rodjenja: " + this.mestoRodjenja;
                
    }
}
