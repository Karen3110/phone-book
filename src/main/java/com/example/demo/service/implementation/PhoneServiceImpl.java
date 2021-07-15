package com.example.demo.service.implementation;

import com.example.demo.model.Phone;
import com.example.demo.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service

public class PhoneServiceImpl implements PhoneService {
    @Override
    public Phone create(Phone date) {
        return null;
    }

    @Override
    public Phone read(int id) {
        return null;
    }

    @Override
    public Phone update(Phone date, int id) {
        return null;
    }

    @Override
    @Transactional
    public List<Phone> updateAll(List<Phone> phones, int personId) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
