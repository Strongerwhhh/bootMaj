package com.wzy.boot.maj;

import com.wzy.boot.maj.domain.User;
import com.wzy.boot.maj.domain.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MajApplicationTests {
    @Autowired
    UserRepository userRepository;
    @Test
    public void contextLoads() {
        Optional<User> byId = userRepository.findById("123123123");

    }

}
