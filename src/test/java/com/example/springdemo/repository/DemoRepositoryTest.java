//package com.example.springdemo.repository;
//
//import com.example.springdemo.model.Demo;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(SpringRunner.class)
//// has to use if using JpaRepository / Gradle data
//@DataJpaTest
//public class DemoRepositoryTest {
//
//    @Autowired
//    private DemoRepository demoRepository;
//    @Test
//    void testSaveDemo() {
//        Demo demo = new Demo("demo1");
//        demoRepository.save(demo);
//
//        //Demo fetchedDemo = demoRepository.findByName("demo1");
//
//    }
//}
