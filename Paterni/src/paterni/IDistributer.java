/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paterni;

/**
 *
 * @author Vladimir
 */
public interface IDistributer {
    void addSubscriber(Subscriber s);
    void cancelSubscriber(Subscriber s);
    void sendUpdate(String msg);
    
    
}
