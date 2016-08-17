/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlassignmentprvi;

import java.io.IOException;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
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
public class XMLAssignmentPrvi {
//    private static Date filterDate=Date.valueOf("01-01-2005");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            Date dateFilter = sdf.parse("2005-01-01");
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("books.xml");

            Element root = doc.getDocumentElement();
            NodeList books = root.getElementsByTagName("book");
            int bookNo = books.getLength();

            for (int i = 0; i < bookNo; i++) {
                Element book = (Element) books.item(i);
                String id = book.getAttribute("id");
                String author = book.getElementsByTagName("author").item(0).getTextContent();
                String title = book.getElementsByTagName("title").item(0).getTextContent();
                String genre = book.getElementsByTagName("genre").item(0).getTextContent();
                String price = book.getElementsByTagName("price").item(0).getTextContent();
                String publishDate = book.getElementsByTagName("publish_date").item(0).getTextContent();
                String description = book.getElementsByTagName("description").item(0).getTextContent();
                
                Double priceDbl = Double.parseDouble(price);

                Date publishDateD = sdf.parse(publishDate);
                
                
               if(priceDbl > 10 && publishDateD.after(dateFilter)){
                    System.out.println("Book id: " + id);
                    System.out.println("Title: " + title +", by: "+author);
                    System.out.println("Genre: "+genre+", publish date: "+publishDate+", price: "+price);
                    System.out.println("Description: "+description);
                }
            }
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XMLAssignmentPrvi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(XMLAssignmentPrvi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XMLAssignmentPrvi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(XMLAssignmentPrvi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
