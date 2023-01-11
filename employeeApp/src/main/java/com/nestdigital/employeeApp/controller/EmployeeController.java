package com.nestdigital.employeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Page(){
        return "Hi";
    }

    @GetMapping("/home")
    public String Homepage(){
        return "Welcome to my Homepage";
    }


    @GetMapping("/addemployee")
    public String Addemployee(){
        return  "Add Employee";
    }

    @GetMapping("/searchemployee")
    public String Searchemployee(){
        return "Search Employee";
    }


    @GetMapping("/deleteemployee")
    public String Deleteemployee(){
        return "Delete Employee";
    }


    @PostMapping("/read")
    public String ReadPage()
    {
        return "Read Page";
    }

    @GetMapping("/viewall")
    public List Viewall(){
        List<String> myList=new ArrayList<>();
        myList.add("{'name':'anand','age':23}");
        return myList;
    }
}
