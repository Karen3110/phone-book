package com.example.demo.model;

import com.example.demo.commons.model.Label;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String phone;

    @Enumerated(value = EnumType.STRING)
    private Label label;

}
