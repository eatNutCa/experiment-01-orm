package com.experiments.experiment01orm;

import com.experiments.experiment01orm.entity.User;
import com.experiments.experiment01orm.entity.Address;
import com.experiments.experiment01orm.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Experiment01OrmApplicationTests {
 @Autowired
 private UserRepository userRepository;
    @Test
    public void addAddressTest(){
        userRepository.addUserAddress();
    }
}
