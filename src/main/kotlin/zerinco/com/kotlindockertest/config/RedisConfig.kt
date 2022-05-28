package zerinco.com.kotlindockertest.config

import org.springframework.boot.autoconfigure.data.redis.RedisProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.core.RedisTemplate

@Configuration
class RedisConfig {

    @Bean
    @Primary
    fun redisProps() = RedisProperties()

    @Bean
    fun factory() = LettuceConnectionFactory(RedisStandaloneConfiguration(redisProps().host))

    @Bean
    fun redisTemp():RedisTemplate<String, Long> {
        val redis = RedisTemplate<String, Long>()
        redis.setConnectionFactory(factory())
        return redis
    }
}