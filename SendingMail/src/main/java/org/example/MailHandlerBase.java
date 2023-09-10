package org.example;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.net.Authenticator;
import java.util.Properties;

public class MailHandlerBase {
    public void sendMail()
    {
      //1 proprites
        Properties SyspropertiesMap=System.getProperties();
        SyspropertiesMap.put("mail.smtp.host","smtp.gmail.com");   //smtp server

        SyspropertiesMap.put("mail.smtp.port","465");   //port
        SyspropertiesMap.put("mail.smtp.ssl.enable","true");    //ssl secure skt

        SyspropertiesMap.put("mail.smtp.auth","true");   //authontication


        //2 autantication

        CoustomizedMailAuthenticator mailAutenticator= new CoustomizedMailAuthenticator();
        //3 Session
        Session mailSession=Session.getInstance(SyspropertiesMap,mailAutenticator);
        // 4 build text email
        MimeMessage mailMassaage=new MimeMessage(mailSession);
        try {
            mailMassaage.setFrom(mailconstant.SENDER);
            mailMassaage.setRecipient(Message.RecipientType.TO, new InternetAddress("dk438916@gmail.com"));
            mailMassaage.setSubject("geekster is maoling");
            mailMassaage.setText("hyy there haw are you ..??");
            Transport.send(mailMassaage);
            System.out.println("send mail :");
        }
        catch (Exception e)
        {
            System.out.print("Exeption occer in somwhere bodey");
            System.out.println(e.getMessage());
        }

    }
}
