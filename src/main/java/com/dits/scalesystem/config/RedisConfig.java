//package com.dits.scalesystem.config;
//
//
//import com.dits.scalesystem.queue.MessagePublisher;
//import com.dits.scalesystem.queue.RedisMessagePublisher;
//import com.dits.scalesystem.queue.RedisMessageSubscriber;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.listener.ChannelTopic;
//import org.springframework.data.redis.listener.RedisMessageListenerContainer;
//import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
//
///**
// * Created By vaibh on 3/7/2021
// */
//
//@Configuration
//public class RedisConfig {
//    @Bean
//    JedisConnectionFactory jedisConnectionFactory() {
//        JedisConnectionFactory jedisConFactory
//                = new JedisConnectionFactory();
//     return jedisConFactory;
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(jedisConnectionFactory());
//        return template;
//    }
//
//
//    @Bean
//    MessageListenerAdapter messageListener() {
//        return new MessageListenerAdapter(new RedisMessageSubscriber());
//    }
//
//    @Bean
//    RedisMessageListenerContainer redisContainer() {
//        final RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//        container.setConnectionFactory(jedisConnectionFactory());
//        container.addMessageListener(messageListener(), topic());
//        return container;
//    }
//
//    @Bean
//    MessagePublisher redisPublisher() {
//        return new RedisMessagePublisher(redisTemplate(), topic());
//    }
//
//    @Bean
//    ChannelTopic topic() {
//        return new ChannelTopic("pubsub:queue");
//    }
//}
