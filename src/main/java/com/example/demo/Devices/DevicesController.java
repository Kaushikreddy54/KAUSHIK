package com.example.demo.Devices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevicesController {
	
	@Autowired
    DevicesService devicesService;

    @PostMapping("/addDevice")
    public String addDevices(@RequestBody Devices devices){return devicesService.addDevice(devices);}

    @GetMapping("/getDevicesByCompany/{name}")
    public List<Devices> getDevicesByCompany(@PathVariable("name") String name){return devicesService.getDevicesByCompany(name);}

    @DeleteMapping("/deleteDeviceByCompany/{name}")
    public String deleteDeviceByCompany(@PathVariable("name") String name){return devicesService.deleteDevicesByCompany(name);}


}
