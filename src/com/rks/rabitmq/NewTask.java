package com.rks.rabitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

public class NewTask {

    private final static String QUEUE_NAME = "task_q";

    public static void main(String[] args) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        boolean durable = true;

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {


            channel.queueDeclare(QUEUE_NAME, durable, false, false, null);
            //String message = "Hello World";
            String message = String.join(" ", args);
            channel.basicPublish("", QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN,
                    message.getBytes("UTF-8"));

            System.out.println(" [x] Sent '" + message + "'");
        }

    }
}
