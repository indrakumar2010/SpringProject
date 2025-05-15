package com.ind.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringGitDemoApplicationTests {

    Logger logger = Logger.getLogger("SpringGitDemoApplicationTests");
    @Test
    void contextLoads() {
        logger.info("Hello World Test case executed::::");
        assertEquals(true,true);
    }

}
