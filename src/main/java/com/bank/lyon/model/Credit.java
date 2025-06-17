package com.bank.lyon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credit {

    @Id
    private String id;
    private String user_id;
    private String name;
    private String type;
    private String description;
    private String status;
}
