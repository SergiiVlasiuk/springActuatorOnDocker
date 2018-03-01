package com.example.controller;

import lombok.extern.java.Log;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;

/**
 * Created by sergii_vlasiuk on 2/27/18.
 */
@RestController
@RequestMapping("/rest/controller")
@Log
public class AnyRestController {

    @GetMapping(value = "/person", produces = {MediaType.APPLICATION_XML_VALUE})
    public Person getPerson() {
        log.info("is used");
        Person person = new Person();
        person.setAge(77);
        person.setName("john");
        return person;
    }

}
