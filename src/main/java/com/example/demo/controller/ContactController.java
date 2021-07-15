package com.example.demo.controller;

import com.example.demo.commons.handler.ResponseException;
import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

    @Autowired
    private final ContactService contactService;

    // this method adds new contact to phonebook,
    // it does not meter phone, email parameters are null or not
    @PostMapping
    public ResponseEntity<Contact> create(@RequestBody Contact contact) throws ResponseException {
        return ResponseEntity.ok(contactService.create(contact));

    }

    // this method returns all contact list
    @GetMapping
    public ResponseEntity<List<Contact>> read() {
        return ResponseEntity.ok(contactService.read());
    }

    // this method returns  contact by id
    @GetMapping("/{id}")
    public ResponseEntity<Contact> read(@PathVariable int id) {
        return ResponseEntity.ok(contactService.read(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> update(@RequestBody Contact contact, @PathVariable int id) throws ResponseException {
        return ResponseEntity.ok(contactService.update(contact, id));
    }


    @PatchMapping("/{id}")
    public void delete(@PathVariable int id) {
        contactService.delete(id);
    }
}
