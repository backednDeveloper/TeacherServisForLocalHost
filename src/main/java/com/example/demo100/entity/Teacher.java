package com.example.demo100.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(nullable = false, unique = true, length = 10, name = "Sciencename")
    private String scienceName;
    @Column(nullable = false, unique = true, length = 10, name = "Name")
    private String name;
    @Column(nullable = false, unique = true, length = 10, name = "Surname")
    private String surname;
    @Column(nullable = false, length = 10, name = "Password")
    private int password;
    @Column(nullable = false, unique = true, name = "Age")
    private int age;
    @Column(nullable = false, unique = true, name = "Salary")
    private int salary;

    public Teacher() {
    }
}
