
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import static javax.swing.RowFilter.ComparisonType.BEFORE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vladimir
 */
public class ConverterInterceptor {
     @AroundInvoke
    public Object intercept(InvocationContext context) throws
Exception {
 
        String before_text = LocalDateTime.now() + 
                ": SimpleInterceptor - Logging BEFORE calling method :" + 
context.getMethod().getName() + "\n";
        String after_text = LocalDateTime.now() +
                ": SimpleInterceptor - Logging AFTER calling method :" + 
context.getMethod().getName();
 
        FileOutputStream fs = new FileOutputStream("d:\\myFile.txt");
        Object result = null;
 
        try {
 
            fs.write(before_text.getBytes());
 
            result = context.proceed();
 
            fs.write(after_text.getBytes());
 
        } catch (Exception exc) {
            fs.write(exc.getMessage().getBytes());
        } finally {
            fs.close();
        }
 
        return result;
    }
}
