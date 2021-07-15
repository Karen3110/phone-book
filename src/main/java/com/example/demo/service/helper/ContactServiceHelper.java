package com.example.demo.service.helper;

import com.example.demo.model.Contact;
import com.example.demo.repository.EmailRepository;
import com.example.demo.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContactServiceHelper {
    @Autowired
    private final PhoneRepository phoneRepository;

    @Autowired
    private final EmailRepository emailRepository;

    public void updateContact(int id, Contact fromClient, Contact fromDb) {
        fromDb.setId(id);
        fromDb.setName(fromClient.getName());
        fromDb.setSurname(fromClient.getSurname());
        fromDb.setDateOfBirth(fromClient.getDateOfBirth());

        if (fromClient.getPhone() == null) {
            phoneRepository.deleteById(fromDb.getPhone().getId());
            fromDb.setPhone(null);
        } else if (fromDb.getPhone() == null) {
            fromDb.setPhone(fromClient.getPhone());
        } else {
            fromDb.getPhone().setPhone(fromClient.getPhone().getPhone());
        }
        if (fromClient.getEmail() == null) {
            emailRepository.deleteById(fromDb.getEmail().getId());
            fromDb.setEmail(null);
        } else if (fromDb.getEmail() == null) {
            fromDb.setEmail(fromClient.getEmail());
        } else {
            fromDb.getEmail().setEmail(fromClient.getEmail().getEmail());

        }


    }
}
