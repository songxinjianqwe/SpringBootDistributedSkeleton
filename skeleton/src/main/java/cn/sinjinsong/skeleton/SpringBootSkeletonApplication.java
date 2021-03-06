package cn.sinjinsong.skeleton;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan({"cn.sinjinsong"})
@Slf4j
public class SpringBootSkeletonApplication extends SpringBootServletInitializer {

    public static void main(String[] args) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootSkeletonApplication.class, args);
        
//        DefaultMQProducer defaultMQProducer = context.getBean(DefaultMQProducer.class);
//        for (int i = 0; i < 10; i++) {
//            Message msg = new Message("TEST",// topic
//                    "TEST",// tag
//                    "KKK",//key用于标识业务的唯一性
//                    ("Hello RocketMQ "+i).getBytes(CharsetProperties.charset)// body 二进制字节数组
//            );
//            SendResult result = defaultMQProducer.send(msg);
//            log.info("SendResult: {}", result);
//        }
//        DefaultMQPushConsumer consumer = context.getBean(DefaultMQPushConsumer.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootSkeletonApplication.class);
    }
}
