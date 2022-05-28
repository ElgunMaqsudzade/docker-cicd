package zerinco.com.kotlindockertest.service

import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Service

@Service
class TestService(private val redisTemplate: RedisTemplate<String, Long>) {
    fun testFun(): Long {
        return 5
    }
}