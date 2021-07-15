package com.example.demo.service.implementation;

import com.example.demo.model.Email;
import com.example.demo.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service

public class EmailServiceImpl implements EmailService {
    @Override
    public Email create(Email date) {
        return null;
    }

    @Override
    public Email read(int id) {
        return null;
    }

    @Override
    public Email update(Email date, int id) {
        return null;
    }

    @Override
    @Transactional
    public List<Email> updateAll(List<Email> emailList, int personId) {

        return null;
    }

    @Override
    public void delete(int id) {

    }
}
