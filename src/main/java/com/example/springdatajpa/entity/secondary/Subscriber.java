package com.example.springdatajpa.entity.secondary;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String domain;
    private String password;
    private String emailAddress;
    private String ha1;
    private String ha1B;
    private String rpid;
    private long routeType;
    private String routeDest;

}
