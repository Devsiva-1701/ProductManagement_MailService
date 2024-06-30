package com.mail_service.mail_service.DAO.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailStructure {
    
    private String message;
    private String subject;

}
