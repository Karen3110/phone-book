package com.example.demo.service;

import com.example.demo.model.Phone;

import java.util.List;


public interface PhoneService {

    Phone create(Phone date);

    Phone read(int id);

    Phone update(Phone date, int id);

    List<Phone> updateAll(List<Phone> phones, int personId);

    void delete(int id);


}
