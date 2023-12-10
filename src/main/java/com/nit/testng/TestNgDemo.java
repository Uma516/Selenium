package com.nit.testng;

import org.testng.annotations.Test;

public class TestNgDemo {
    @Test(priority = 10)
    public void setup(){
        System.out.println("test1 method");
    }
    @Test(priority = 12)
    public void login(){
        System.out.println("test2 method");
    }
    @Test(priority = 15)
    public void teardown(){
        System.out.println("test3 method");
    }
}
