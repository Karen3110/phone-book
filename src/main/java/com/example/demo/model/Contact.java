package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String surname;

    private Date dateOfBirth;

    @OneToOne(cascade = CascadeType.ALL)
    private Phone phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Email email;


}
