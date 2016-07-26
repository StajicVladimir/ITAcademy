/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Vladimir
 */
public class Movie extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    private String title;
    private String price;
    private String slika;
    private String lPrice;
    private String lBuy;
    
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
           
            String tagBody = "<div class=\"leftbox\">\n" +
"            <h3>"+this.title+"</h3>\n" +
"             <img src=\""+this.slika+"\" width=\"93\" height=\"95\" alt=\"photo 1\" class=\"left\" />\n" +
"             <p><b>Price:</b> <b>$"+this.price+"</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$195</b>.</p>\n" +
"               <p><b>Availability:</b> Usually ships within 24 hours</p>\n" +
"                <p class=\"readmore\"><a href=\"http://www.free-css.com/\">"+this.lBuy+"</a></p>\n" +
"                 <div class=\"clear\"></div>\n" +
"              </div>";
            out.print(tagBody);
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Movie tag", ex);
        }
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the slika
     */
    public String getSlika() {
        return slika;
    }

    /**
     * @param slika the slika to set
     */
    public void setSlika(String slika) {
        this.slika = slika;
    }

    /**
     * @return the lPrice
     */
    public String getlPrice() {
        return lPrice;
    }

    /**
     * @param lPrice the lPrice to set
     */
    public void setlPrice(String lPrice) {
        this.lPrice = lPrice;
    }

    /**
     * @return the lBuy
     */
    public String getlBuy() {
        return lBuy;
    }

    /**
     * @param lBuy the lBuy to set
     */
    public void setlBuy(String lBuy) {
        this.lBuy = lBuy;
    }
    
}
