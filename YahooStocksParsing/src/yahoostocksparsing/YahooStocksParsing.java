/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahoostocksparsing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Vladimir
 */
public class YahooStocksParsing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SAXParserFactory spf = SAXParserFactory.newInstance();
        
        try {
            SAXParser sp = spf.newSAXParser();
            sp.parse("http://rss.news.yahoo.com/rss/stocks", new RSSParser());
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(YahooStocksParsing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(YahooStocksParsing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(YahooStocksParsing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
