
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vladimir
 */
@Stateless
@Interceptors(ConverterInterceptor.class)
public class ConverterBean implements Converter{

    @Override
    public double calculate(double value, convertType type) {
        if (type == convertType.C2F){
            return value*2 + 30;
        }
        
        return (value - 32) / 1.8;
    }
    
}
