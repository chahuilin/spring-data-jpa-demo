package com.example.springdatajpa.entity.primary;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String number;
    private String name;
    private long type;
    private String enterpriseId;
    private String userId;
    private String outboundLineId;
    private long groupId;
    private long status;
    private String username;
    private String password;
    private long subscriberId;
    private long deleteFlag;
    private java.sql.Timestamp createTime;
    private java.sql.Timestamp modifyTime;
}
