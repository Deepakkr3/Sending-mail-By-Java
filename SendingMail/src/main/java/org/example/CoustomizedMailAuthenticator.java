package org.example;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CoustomizedMailAuthenticator extends Authenticator {


    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
     return new PasswordAuthentication(mailconstant.SENDER,mailconstant.PASWORD);


    }
}
