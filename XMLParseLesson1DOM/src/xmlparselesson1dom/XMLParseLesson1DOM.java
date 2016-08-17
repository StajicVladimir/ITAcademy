/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparselesson1dom;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Vladimir
 */
public class XMLParseLesson1DOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        // TODO code application logic here
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        
        Document doc = db.parse("http://www.blic.rs/rss/IT");
        Element root = doc.getDocumentElement();
        
        NodeList items = root.getElementsByTagName("item");
        
        int itemsNo = items.getLength();
        
       
        for(int i = 0;  i< itemsNo; i++){
            Element item = (Element)items.item(i);
            String title = item.getElementsByTagName("title").item(0).getTextContent();
            String description = item.getElementsByTagName("description").item(0).getTextContent();
            System.out.println("Title: " + title);
            System.out.println("Description: " + description+"\n");
            //System.out.println(title);
            //System.out.println(i);
        }
//        Element root = doc.getDocumentElement();
//        
//        NodeList flowers = root.getElementsByTagName("flower");
//        //System.out.println(flowers.getLength());
//        Element child = (Element)flowers.item(1);
//        NodeList vrsta = child.getElementsByTagName("vrsta");
//        Element vrstaElement = (Element)vrsta.item(0);
//        
//        System.out.println(vrstaElement.getTextContent());
    }
    
}
