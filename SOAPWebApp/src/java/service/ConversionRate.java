/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import business.Exchange;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Vladimir
 */
@WebService(serviceName = "ConversionRate")
public class ConversionRate {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "rate")
    public String rate(@WebParam(name = "c1") String currency1, @WebParam(name = "c2") String currency2) {
        //TODO write your implementation code here:
        Exchange e = new Exchange();
        return e.rate(currency1, currency2);
        
    }
}
