package com.example.demo.service;

import com.example.demo.model.Email;

import java.util.List;

public interface EmailService {
    Email create(Email date);

    Email read(int id);

    Email update(Email date, int id);

    List<Email> updateAll(List<Email> emailList, int personID);

    void delete(int id);
}
