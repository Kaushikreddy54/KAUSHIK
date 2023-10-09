package com.example.demo.Devices;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepository extends MongoRepository<Devices,String>{
	
	Optional<Devices> findByCompanyName(String name);

}
