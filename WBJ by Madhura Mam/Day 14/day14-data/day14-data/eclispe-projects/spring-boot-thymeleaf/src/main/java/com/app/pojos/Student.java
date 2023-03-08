package com.app.pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="students")
@NoArgsConstructor
@Getter
@Setter
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank(message = "Name is mandatory")
    @Column(length = 20)
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    @Column(length = 40,unique =true)
    private String email;
    @Column(length = 15,unique = true)
    private String phoneNo;
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }   
 	
}