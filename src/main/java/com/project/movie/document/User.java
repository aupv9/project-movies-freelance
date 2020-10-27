package com.project.movie.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Document(collection = "users")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {

    @Id
    private String id;

    private String userName;
    private String firstName;
    private String lastName;
    private LocalDateTime birthDay;
    private LocalDateTime create_At;
    private LocalDateTime modify_At;
    private String email;
    private String phone;

}