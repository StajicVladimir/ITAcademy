/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahoostocksparsing;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Vladimir
 */
public class RSSParser extends DefaultHandler {

    private String activeText = "";
    private boolean itemActive = false;
    private String actualNodeName = "";

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //System.out.println("Element start: " + qName);
        if (qName.equals("item")) {
            itemActive = true;
        }
        this.actualNodeName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (!itemActive) {
            return;
        }
        if (qName.equals("title") && !this.activeText.trim().equals("")) {
            System.out.println("Title: " + this.activeText.trim());
        }
        if (qName.equals("link") && !this.activeText.trim().equals("")) {
            System.out.println("Link: " + this.activeText.trim());
        }
        if (qName.equals("description") && !this.activeText.trim().equals("")) {
            System.out.println("Description: " + this.activeText.trim());
        }
        if (qName.equals("pubDate") && !this.activeText.trim().equals("")) {
            System.out.println("Publishing date: " + this.activeText.trim());
        }
        activeText = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (!itemActive) {
            return;
        }

        String txt = new String(ch, start, length);
        activeText += txt;

    }

}
