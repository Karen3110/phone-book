package com.example.demo.service.helper;

import com.example.demo.model.Contact;
import com.example.demo.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PhoneServiceHelper {

    @Autowired
    private final PhoneRepository phoneRepository;

    /*
   this method deletes all data from DB and adds new phone data for contact
   which came from client
   */
    public void updatePhones(int id, Contact fromClient, Contact fromDb) {


    }
}
