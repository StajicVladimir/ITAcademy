/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:AddService
 * [/AddService/{a}/{b}]<br>
 * USAGE:
 * <pre>
 *        AddServiceClient client = new AddServiceClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Vladimir
 */
public class AddServiceClient {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/RESTProject/resource";

    public AddServiceClient(String a, String b) {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        String resourcePath = java.text.MessageFormat.format("AddService/{0}/{1}", new Object[]{a, b});
        webTarget = client.target(BASE_URI).path(resourcePath);
    }

    public void setResourcePath(String a, String b) {
        String resourcePath = java.text.MessageFormat.format("AddService/{0}/{1}", new Object[]{a, b});
        webTarget = client.target(BASE_URI).path(resourcePath);
    }

    public String getMessage() throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.get(String.class);
    }

    public void close() {
        client.close();
    }
    
}
