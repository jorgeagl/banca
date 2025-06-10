package com.bank.lyon.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
/*
    @Transient
    public static final String SEQUENCE_NAME="users_sequence";
*/
    @Id
    private String id;

    private String name;

    private String last_name;

    private String email;

    private String age;

    private String balance;

    public void setName(String name){this.name=name;}

}
