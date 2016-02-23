/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author Vladimir
 */
public class Digitron {
    double a;
    double b;
    
    Digitron (double a, double b){
        this.a=a;
        this.b=b;
    }
    
    void setA(double a){
        this.a = a;
    }
    
    void setB(double b){
        this.b=b;
    }
    
    double add(){
        return a+b;
    }
    
    double sub(){
        return a-b;
    }
    double subInv(){
            return b-a;
    }
    double mul(){
        return a*b;
    }
    double div(){
        return a/b;
    }
    double divInv(){
        return b/a;
    }
}
