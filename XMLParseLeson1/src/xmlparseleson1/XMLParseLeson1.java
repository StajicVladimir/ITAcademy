/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparseleson1;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Vladimir
 */
public class XMLParseLeson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        // TODO code application logic here
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser sp = spf.newSAXParser();
        
        sp.parse("sweets.xml", new DefaultHandler(){
            
            String currentElement;
            
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
            
                //System.out.println("Start of: " + qName);
                this.currentElement = qName;
            }

            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException {
                super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
                //System.out.println("End of: " + qName);
                this.currentElement = null;
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
                if("naziv".equals(this.currentElement))
                System.out.println(new String(ch, start, length).trim());
            }
            
            
            
            
        });

            
    }
    
}
