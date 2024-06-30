package com.mail_service.mail_service.rest_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail_service.mail_service.DAO.entity.MailStructure;
import com.mail_service.mail_service.service.MailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("mail")
public class MailController {

    @Autowired
    MailService mailService;

    @PostMapping("sendMail/{mail}")
    public String postMethodName(@PathVariable String mail ,  @RequestBody MailStructure mailStructure) {
        System.out.println("Sending Mail...");
        return mailService.sendMail(mail, mailStructure) ;
    }
    

}
