package com.example.demo.Devices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Product.Product;
import com.example.demo.Product.ProductService;

@Service
public class DevicesService {
	
	@Autowired
    DevicesRepository devicesRepository;
    @Autowired
    ProductService productService;
    public String addDevice(Devices devices)
    {
        devicesRepository.save(devices);
        return devices.getCompanyName()+" is added successfully";
    }
    public List<Devices> getDevicesByCompany(String name)
    {
        List<Devices> devices=devicesRepository.findByCompanyName(name).stream().toList();
        Optional<Product> tabs=productService.getProductByCompanyNameAndType(name,"tab");
        Optional<Product> mobiles=productService.getProductByCompanyNameAndType(name,"mobile");
        if(devices.size()>0) {
            devices.get(0).setTabCount(tabs.stream().toList().size());
            devices.get(0).setMobileCount(mobiles.stream().toList().size());
            devices.get(0).setTabs(tabs);
            devices.get(0).setMobiles(mobiles);
        }
        return devices;

    }
    public String deleteDevicesByCompany(String name)
    {
        devicesRepository.deleteById(name);
        return name+" deleted successfully";
    }

}
