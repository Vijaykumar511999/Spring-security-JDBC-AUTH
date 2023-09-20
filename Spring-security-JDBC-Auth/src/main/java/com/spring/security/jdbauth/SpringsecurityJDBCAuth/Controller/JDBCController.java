package com.spring.security.jdbauth.SpringsecurityJDBCAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JDBCController {

    @GetMapping("/home")
    public String getHome(){
        String msg = "Welcome to the Spring boot securiy..";
        return msg;
    }

    @GetMapping("/balance")
    public String getBalance(){
        String msg = "Your balance is 450rs..";
        return msg;
    }

    @GetMapping("/statement")
    public String getStatement(){
        String msg = "Statement is downloaded please check..";
        return msg;
    }

    @GetMapping("/myloan")
    public String myLoan(){
        String msg = "My Loan amount is 600000 remaining.. please note";
        return msg;
    }

    @GetMapping("/contact")
    public String getContact(){
        String msg = "Thank you for using our application please wait for 2 minutes our team will get back to you..";
        return msg;
    }

}
