package com.example.demo.service.helper;

import com.example.demo.model.Contact;
import com.example.demo.repository.EmailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailServiceHelper {
    @Autowired
    private final EmailRepository emailRepository;


    /**
     * this method deletes all data from DB and adds new phone data for contact
     * which came from client
     *
     * @param id
     * @param fromClient
     * @param fromDb
     */
    public void updateEmails(int id, Contact fromClient, Contact fromDb) {

    }
}
