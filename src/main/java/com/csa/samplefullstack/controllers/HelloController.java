
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.csa.samplefullstack.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TiuWobbleZ
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Gumana na si Spring Boot! - Justin Tiu";
    }

}

