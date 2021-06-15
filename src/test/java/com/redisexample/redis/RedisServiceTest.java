package com.redisexample.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ZSetOperations;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisServiceTest {

    @Autowired private RedisService redisService;

    @Resource(name = "redisTemplate")
    private ZSetOperations<String, String> zSetOperations;

    private static final String KEY = "player";

    @Test
    public void add() {
        redisService.add();
        assertTrue(zSetOperations.zCard(KEY) > 9_000_000);
    }

    @Test
    public void getPlayers() {
        long start = System.currentTimeMillis();
        List<String> players = redisService.getPlayers();
        long end = System.currentTimeMillis();
        System.out.println("프로그램 수행 시간: " + (double)(end-start)/1000);

        assertTrue(players.size() == 50_000);
    }

}