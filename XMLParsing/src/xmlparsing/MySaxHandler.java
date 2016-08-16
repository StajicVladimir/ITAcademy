/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparsing;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 *
 * @author Vladimir
 */
public class MySaxHandler extends DefaultHandler {
    
    private String actualNodeName;
    @Override
    public void startDocument(){
        System.out.println("Document reading has been started...");
    }
    
    @Override
    public void endDocument(){
        System.out.println("Document reading has ended...");
    }
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes){
        this.actualNodeName = qName;
        System.out.println("Element started: " + qName);
        for(int i=0; i<attributes.getLength(); i++){
            System.out.println("Attribute: " + attributes.getLocalName(i)+", value: " + attributes.getValue(i));
        }
    }
    
    @Override
    public void endElement(String uri, String localName, String qName){
        System.out.println("Element end: "+qName);
    }
    
    @Override
    public void characters(char ch[], int start, int length){
        String nodeValue = new String(ch, start, length);
        
//        if(!actualNodeName.equals("name"))
//            return;
        if (!nodeValue.trim().equals("")){
            System.out.println("Node value: " + nodeValue);
        }
    }
}
