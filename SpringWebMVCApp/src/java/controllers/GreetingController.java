/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Vladimir
 */
@Controller
public class GreetingController {
    
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String printHello(@RequestParam(value="name", required = false,
                  defaultValue = "User") String name, ModelMap model){
        model.addAttribute("message", name + " Spring Hello World!!!!");
        return "Greeting";
    }
}
