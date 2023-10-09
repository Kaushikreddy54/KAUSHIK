package com.example.demo.Company;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="COMPANY-K")
public class Company {
	
	@Id
	String id;
    String name;
    @Transient
    Object devices;

}
