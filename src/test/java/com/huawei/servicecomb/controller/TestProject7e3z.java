package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject7e3z {

        Project7e3zDelegate project7e3zDelegate = new Project7e3zDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project7e3zDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}