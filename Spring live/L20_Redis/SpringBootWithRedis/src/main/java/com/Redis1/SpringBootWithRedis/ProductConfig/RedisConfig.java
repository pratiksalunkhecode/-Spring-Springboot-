package com.Redis1.SpringBootWithRedis.ProductConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories
public class RedisConfig {


    @Bean
    public JedisConnectionFactory connectionFactory() {
        // Redis Localhost
        //   RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("localhost", 6379);

//    // Redis Cloud
    RedisStandaloneConfiguration configCloud = new RedisStandaloneConfiguration();
//
		configCloud.setHostName("redis-12244.c277.us-east-1-3.ec2.redns.redis-cloud.com");
//
//
		configCloud.setPassword("tbKYiYWW2EBcmEWyKtQNivO3UthcxpS7");
		configCloud.setPort(12244);
		configCloud.setUsername("default");
    //return new JedisConnectionFactory(config);
		return new JedisConnectionFactory(configCloud);
    }
    @Bean
    public RedisTemplate<String, Object>  template(){
        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
        template.setConnectionFactory(connectionFactory());
        return template;
    }

}
