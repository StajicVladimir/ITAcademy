/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmllessons;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

/**
 *
 * @author Vladimir
 */
public class XMLLessons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException, XPathExpressionException {
        // TODO code application logic here
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse("music.xml");
        
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xp = xpf.newXPath();
        XPathExpression xpe = xp.compile("/music/performer[instrument='Guitar']");
        
//        String res = xpe.evaluate(doc);
//        System.out.println(res);
        
        NodeList results = (NodeList)xpe.evaluate(doc,XPathConstants.NODESET);
        for(int i= 0; i<results.getLength(); i++){
//            Element el = (Element) results.item(i); OVO ako je upit .../name
//            System.out.println(el.getTextContent());
            Element el = (Element) results.item(i);
            System.out.println(xp.compile("name").evaluate(el));
            System.out.println(xp.compile("instrument").evaluate(el));
        }
//        NodeList nodes = doc.getElementsByTagName("performer");
//        
//        for (int i = 0; i <nodes.getLength(); i++){
//            Element el = (Element)nodes.item(i);
//            if("20".equals(el.getAttribute("id"))){
//                System.out.println(nodes.item(i).getTextContent());
//                break;
//            }
//        }
    }
    
}
