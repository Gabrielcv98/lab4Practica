package com.example.lab4Practica.Controllers;

import com.example.lab4Practica.Repository.DepartmentRepository;
import com.example.lab4Practica.Repository.EmployeeRepository;
import com.example.lab4Practica.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emplooyee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository ;

    @Autowired
    JobRepository jobRepository;

    @Autowired
    DepartmentRepository departmentRepository;



    @GetMapping(value = {"","/"})
    public String listaEmployee(Model model){

        model.addAttribute("listaEmployee", employeeRepository.findAll());
        model.addAttribute("listaJobs", jobRepository.findAll());
        model.addAttribute("listaDepartments", departmentRepository.findAll());


        return "employee/lista" ;
    }



}
