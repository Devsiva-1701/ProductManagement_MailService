package com.mail_service.mail_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mail_service.mail_service.DAO.entity.MailStructure;

@Service
public class MailService {
    
    @Autowired
    JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    String senderMail;
    public String sendMail( String mail , MailStructure mailStructure )
    {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(senderMail);
        simpleMailMessage.setSubject(mailStructure.getSubject());
        simpleMailMessage.setText(mailStructure.getMessage());
        simpleMailMessage.setTo(mail);

        javaMailSender.send(simpleMailMessage);

        return "Mail send Successfully...";
    }

}
