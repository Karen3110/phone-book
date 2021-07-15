package com.example.demo.service;

import com.example.demo.commons.handler.ResponseException;
import com.example.demo.model.Contact;

import java.util.List;

public interface ContactService {
    Contact create(Contact date) throws ResponseException;

    Contact read(int id);

    List<Contact> read();

    Contact update(Contact contact, int id) throws ResponseException;

    void delete(int id);

}
