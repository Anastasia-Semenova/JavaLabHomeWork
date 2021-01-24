package ru.itis.javalab.models;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private Long id;
    private String firtName;
    private String lastName;
    private int age;
}
