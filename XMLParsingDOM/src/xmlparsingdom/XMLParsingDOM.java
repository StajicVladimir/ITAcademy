/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparsingdom;

import java.io.IOException;
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
public class XMLParsingDOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("books.xml");
            
            Element root = doc.getDocumentElement();
            
            System.out.println(root.getNodeName() + ", "+root.getNodeType());
            Element bookIn = doc.createElement("book");
            Element title = doc.createElement("title");
            Element author = doc.createElement("author");
            
            bookIn.appendChild(title);
            bookIn.appendChild(author);
            root.appendChild(bookIn);
            
            bookIn.setAttribute("id", "_03");
            bookIn.setAttribute("isbn", "122333");
            title.setTextContent("The caves of steel");
            author.setTextContent("Isaac Asimov");
            //System.out.println(root.getFirstChild().getFirstChild().getNextSibling().getTextContent());
            Element book = doc.getElementById("_02");
            System.out.println(book.getTextContent());
            
            //Element root = doc.getDocumentElement();
            NodeList books = root.getElementsByTagName("book");
            System.out.println("All books:");
            for(int i = 0; i<books.getLength();i++){
                //Node bookItem = books.item(i);
//                NodeList author = ((Element)books.item(i)).getElementsByTagName("author");
//                for(int j = 0; j <author.getLength(); j++){
//                    System.out.println(author.item(j).getTextContent());
//                }
                //System.out.println(bookItem.getTextContent());
                System.out.println("Book name: " + books.item(i).getFirstChild().getTextContent());
                System.out.println("Author: " + books.item(i).getLastChild().getTextContent());
                System.out.println("ID: " + books.item(i).getAttributes().item(0).getNodeValue());
                System.out.println("ISBN: " + books.item(i).getAttributes().item(1).getNodeValue());
            }//FOR
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XMLParsingDOM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XMLParsingDOM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XMLParsingDOM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
