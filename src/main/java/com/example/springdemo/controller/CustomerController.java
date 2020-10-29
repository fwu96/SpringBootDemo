//package com.example.springdemo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.springdemo.model.Customer;
//import com.example.springdemo.service.CustomerService;
//
//@RestController
//public class CustomerController {
//
//    @Autowired
//    CustomerService customerService;
//
//    @GetMapping("/customers")
//    public List<Customer> displayCustomer(){
//        return customerService.getAllCustomer();
//    }
//
//    @GetMapping("/customers/{id}")
//    public Customer getCustomer(@PathVariable("id") int id)
//    {
//        return customerService.getCustomerById(id);
//    }
//
//    @PostMapping("/customers")
//    public int  saveCustomer(@RequestBody Customer customer){
//        customerService.saveCustomer(customer);
//        return customer.getId();
//    }
//
//    @DeleteMapping("/customers/{id}")
//    public void updateCustomerInfo(@PathVariable int id)
//    {
//        customerService.deleteCustomer(id);
//    }
//}
