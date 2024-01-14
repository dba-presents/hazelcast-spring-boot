package com.dbapresents.hazelcastspringboot.statistics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StatsServiceTest {

    @Autowired
    private StatsService statsService;

    @Test
    void shouldGetUsersStatsInLoop() throws InterruptedException {
        long timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Loop number " + i);
            statsService.getUserStats(1);
            statsService.getUserStats(2);
            Thread.sleep(1000);
        }
        System.out.println("Duration " + (System.currentTimeMillis() - timeStart) + " ms");
    }

}