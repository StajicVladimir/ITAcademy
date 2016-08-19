/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import service.TranslateService;

/**
 * REST Web Service
 *
 * @author Vladimir
 */
@Path("translate")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of rest.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        return "Bla bla";
    }
    
    @GET
    @Path("{word}/{language}/{targetLanguage}")
    @Produces("application/json")
    public String translate(@PathParam("word")String word,
            @PathParam("language")String language, @PathParam("targetLanguage")String targetLanguage) {
        //TODO return proper representation object
        TranslateService ts = new TranslateService();
        return ts.translate(word, language, targetLanguage);
    }
    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
