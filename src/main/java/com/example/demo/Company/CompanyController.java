package com.example.demo.Company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class CompanyController {
	
	@Autowired
    CompanyService companyService;

    @PostMapping("/addCompany")
    public String addCompany(@RequestBody Company company)
    {
    	return companyService.addCompany(company);
    }

    @GetMapping("/getCompanyDetails/{name}")
    public List<Company> getCompanyDetails(@PathVariable("name") String name)
    {
    	return companyService.getCompanyById(name);
    }

    @DeleteMapping("/deleteCompany/{name}")
    public String deleteCompany(@PathVariable("name") String name)
    {
    	return companyService.deleteCompany(name);
    }

}
