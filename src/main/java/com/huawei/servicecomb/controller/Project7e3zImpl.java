package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-09-19T08:26:05.427Z")

@RestSchema(schemaId = "project7e3z")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project7e3zImpl {

    @Autowired
    private Project7e3zDelegate userProject7e3zDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject7e3zDelegate.helloworld(name);
    }

}
