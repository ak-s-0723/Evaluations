package org.example.evaluations.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RedisBeanTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testMyServiceBeanIsPresent() {
        boolean isRedisBeanPresent = applicationContext.containsBean("redisTemplate");

        assertThat(isRedisBeanPresent).isTrue();
    }
}
