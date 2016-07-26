package tagovi;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class Film extends SimpleTagSupport {
    
    private String title;
    private String price;
    private String slika;
    private String lprice;
    private String lbuy;
    
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        
        
        try { 
            
            String tag = "<div class=\"leftbox\">\n" +
"          <h3>"+this.title+"</h3>\n" +
"          <img src=\""+this.slika+"\" width=\"93\" height=\"95\" alt=\"photo 1\" class=\"left\" />\n" +
"          <p><b>"+this.lprice+":</b> <b>$"+this.price+"</b> &amp; eligible for FREE Super Saver Shipping on orders over <b>$195</b>.</p>\n" +
"          <p><b>Availability:</b> Usually ships within 24 hours</p>\n" +
"          <p class=\"readmore\"><a href=\"http://www.free-css.com/\">"+this.lbuy+"</a></p>\n" +
"          <div class=\"clear\"></div>\n" +
"        </div>";
            
            out.print(tag);
            
            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }
            
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Film tag", ex);
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
     * @return the lprice
     */
    public String getLprice() {
        return lprice;
    }

    /**
     * @param lprice the lprice to set
     */
    public void setLprice(String lprice) {
        this.lprice = lprice;
    }

    /**
     * @return the lbuy
     */
    public String getLbuy() {
        return lbuy;
    }

    /**
     * @param lbuy the lbuy to set
     */
    public void setLbuy(String lbuy) {
        this.lbuy = lbuy;
    }
    
}
