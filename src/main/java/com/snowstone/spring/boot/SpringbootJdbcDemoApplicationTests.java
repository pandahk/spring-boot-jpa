package com.snowstone.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;

//@org.junit.runner.RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(SpringbootJdbcDemoApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootJdbcDemoApplicationTests.class)
@WebAppConfiguration
public class SpringbootJdbcDemoApplicationTests {
        @Autowired
        private UserRepository userRepository;

        @org.junit.Test
        public void findAllUsers() {
                List<User> users = userRepository.findAll();
                Assert.assertNotNull(users);
                Assert.assertTrue(!users.isEmpty());
        }

//        @Test
//        public void findUserById() {
//                User user = userRepository.findUserById(1);
//                Assert.assertNotNull(user);
//        }
//
//        @Test
//        public void createUser() {
//                User user = new User(0, "John", "john@gmail.com");
//                User savedUser = userRepository.create(user);
//                User newUser = userRepository.findUserById(savedUser.getId());
//                Assert.assertNotNull(newUser);
//                Assert.assertEquals("John", newUser.getName());
//                Assert.assertEquals("john@gmail.com", newUser.getEmail());
//        }
}
