package com.example.demo.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Devices.DevicesService;

@Service
public class CompanyService {
	
	@Autowired
    CompanyRepository companyRepository;
    @Autowired
    DevicesService devicesService;
    public String addCompany(Company company)
    {
        companyRepository.save(company);
        return company.getName()+" is added successfully";
    }
    public List<Company> getCompanyById(String name)
    {
        List<Company> company=companyRepository.findByName(name).stream().toList();
        Object devices =devicesService.getDevicesByCompany(name);
        company.get(0).setDevices(devices);
        return company;
    }
    public String deleteCompany(String name)
    {
        companyRepository.deleteById(name);
        return name+" deleted successfully";
    }

}
