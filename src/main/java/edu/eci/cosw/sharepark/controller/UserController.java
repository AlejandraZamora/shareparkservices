package edu.eci.cosw.sharepark.controller;

import edu.eci.cosw.sharepark.entities.Request;
import edu.eci.cosw.sharepark.entities.User;
import edu.eci.cosw.sharepark.services.UserServices;
import edu.eci.cosw.sharepark.services.UserServicesImpl1;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Andrés Felipe on 12/09/2016.
 */
@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private UserServices services;

    @RequestMapping(value ="/check", method = RequestMethod.GET)
    public String check(){
        return "REST USUARIOS FUNCIONA!!";
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers(){
        return services.getUsers();
    }

    @RequestMapping(value = "/{iduser}", method = RequestMethod.GET)
    public User getUser(@PathVariable("iduser") Integer iduser){
        return services.getUser(iduser);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postUser(@RequestBody(required = true) User u){
        services.addUser(u);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @RequestMapping(value="/{iduser}/solicitud", method =RequestMethod.POST)
    public ResponseEntity<?> postUserRequest(@RequestBody(required = true) Request r){
        services.addUserRequest(r);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
