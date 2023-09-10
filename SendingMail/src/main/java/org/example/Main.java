package org.example;


import com.sun.mail.util.logging.MailHandler;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        System.out.print("mail sending....");
       MailHandlerBase base=new MailHandlerBase();
       base.sendMail();


    }
}