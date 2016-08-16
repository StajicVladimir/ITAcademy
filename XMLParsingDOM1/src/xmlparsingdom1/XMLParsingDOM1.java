/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparsingdom1;

/**
 *
 * @author Vladimir
 */
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLParsingDOM1 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerConfigurationException, TransformerException {
         
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse("page.html");
        Element r = doc.getDocumentElement();
        NodeList links = r.getElementsByTagName("a");
        for(int i=0;i<links.getLength();i++)
            {
                String page = links.item(i).getAttributes().getNamedItem("href").getNodeValue();
                FileOutputStream fos = new FileOutputStream(page.replace("http://", "").replace("/", ""));
                URL u = new URL(page);
                InputStream is = u.openStream();
                DataInputStream dis = new DataInputStream(new BufferedInputStream(is));
                int bt;
                while((bt=dis.read())!=-1)
                            fos.write((byte)bt);
                fos.close();
                dis.close();
            }
      }
}
