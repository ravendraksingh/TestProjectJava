package com.rks.spring5.ch2.annotated;

import com.rks.spring5.ch2.decoupled.HelloWorldMessageProvider;
import com.rks.spring5.ch2.decoupled.MessageProvider;
import com.rks.spring5.ch2.decoupled.MessageRenderer;
import com.rks.spring5.ch2.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }
    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
