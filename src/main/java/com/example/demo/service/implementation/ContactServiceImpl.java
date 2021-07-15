package com.example.demo.service.implementation;

import com.example.demo.commons.Validator;
import com.example.demo.commons.handler.ResponseException;
import com.example.demo.model.Contact;
import com.example.demo.model.Email;
import com.example.demo.model.Phone;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;
import com.example.demo.service.helper.ContactServiceHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private final ContactRepository contactRepository;

    @Autowired
    private final ContactServiceHelper contactServiceHelper;


    @Override
    public Contact create(Contact contact) throws ResponseException {
        Email email = contact.getEmail();
        Phone phone = contact.getPhone();
        if (!Validator.validateEmail(email) || !Validator.validatePhone(phone)) {
            throw new ResponseException(HttpStatus.FORBIDDEN, "email or phone is invalid, please check inputed data!");
        }
        return contactRepository.save(contact);

    }

    // this method return empty object if cant find contact with id
    @Override
    public Contact read(int id) {
        return contactRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
    }

    @Override
    public List<Contact> read() {
        return contactRepository.findAll();
    }

    @Override
    @Transactional
    public Contact update(Contact contact, int id) throws ResponseException {
        Email email = contact.getEmail();
        Phone phone = contact.getPhone();


        if (!Validator.validateEmail(email) || !Validator.validatePhone(phone)) {
            throw new ResponseException(HttpStatus.FORBIDDEN, "email or phone is invalid, please check inputed data!");
        }
        Contact fromDb = contactRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT));
        contactServiceHelper.updateContact(id, contact, fromDb);
        return fromDb;
    }

    @Override
    public void delete(int id) {
        contactRepository.deleteById(id);
    }

}


