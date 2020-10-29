//package com.example.springdemo.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.springdemo.model.Customer;
//import com.example.springdemo.repository.CustomerRepository;
//
//@Service
//public class CustomerService {
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//    public void saveCustomer(Customer cust) {
//        customerRepository.save(cust);
//    }
//
//    public List<Customer> getAllCustomer() {
//        List<Customer> customer = new ArrayList<Customer>();
//        customerRepository.findAll().forEach(cust -> customer.add(cust));
//        return customer;
//    }
//
//    public void deleteCustomer(int id) {
//        customerRepository.deleteById(id);
//
//    }
//
//    public Customer getCustomerById(int id) {
//
//        return customerRepository.findById(id).get();
//
//    }
//}