/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Vladimir
 */
public class TranslateService {
    
    public String translate(String wordToTranslate, String language, String targetLanguage){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse("http://localhost:8080/WebApplication4/dictionary.xml");
            
            Element root = document.getDocumentElement();
            NodeList words = root.getElementsByTagName("word");
           
            String translatedWord ="";
            for(int i =0; i< words.getLength(); i++){
                Element word = (Element)words.item(i);
                
                String currentWord = word.getElementsByTagName(language).item(0).getTextContent();

                if(wordToTranslate.equals(currentWord)){
                    translatedWord= word.getElementsByTagName(targetLanguage).item(0).getTextContent();
                   
                }
                
            }
            if(translatedWord.equals("")){
                return "Word not found";
            }else
                return translatedWord;
           
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        } catch (SAXException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "Pozdrav!";
    }
}
