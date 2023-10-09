package com.example.demo.Devices;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="DEVICE-K")
public class Devices {
	
	@Id
    String id;
    String companyName;
    int tabCount;
    @Transient
    Object tabs;
    int mobileCount;
    @Transient
    Object mobiles;

}
