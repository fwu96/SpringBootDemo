//package com.example.springdemo.controller;
//
//import com.example.springdemo.model.Employee;
//import com.example.springdemo.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.EnumMap;
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class EmployeeController {
//    @Autowired
//    EmployeeRepository service;
//
//    @GetMapping("/employee")
//    public List<Employee> listAllEmployees() {
//        return service.findAll();
//    }
//
//    @PostMapping("/employee")
//    public List<Employee> createEmployee(@RequestBody Employee employee) {
//        service.save(employee);
//        return service.findAll();
//    }
//
//    @GetMapping("/employee/{id}")
//    public Optional<Employee> getEmployee(@PathVariable("id") int id) {
//        return service.findById(id);
//    }
//
//    @PatchMapping("/employee/{id}")
//    public Optional<Employee> updateEmployeeAge(@PathVariable("id") int id, int age) {
//        return service.findById(id)
//                .map(original -> {
//                    original.setAge(age);
//                    return service.save(original);
//                });
//    }
//
//    @PutMapping("/employee/{id}")
//    public Optional<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
//        return service.findById(id)
//                .map(original -> {
//                    original.setName(employee.getName());
//                    original.setAge(employee.getAge());
//                    return service.save(original);
//                });
//    }
//
//    @DeleteMapping("/employee/{id}")
//    public List<Employee> deleteEmployee(@PathVariable("id") int id) {
//        service.deleteById(id);
//        return service.findAll();
//    }
//
//}
//
