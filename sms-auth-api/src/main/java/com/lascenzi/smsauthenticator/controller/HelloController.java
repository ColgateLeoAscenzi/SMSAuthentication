package com.lascenzi.smsauthenticator;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@RestController
public class HelloController {

    static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String receiveEmail(@RequestParam String name) {

        logger.info("Saying hello to "+name);

        return "Hello "+name;
    }
}