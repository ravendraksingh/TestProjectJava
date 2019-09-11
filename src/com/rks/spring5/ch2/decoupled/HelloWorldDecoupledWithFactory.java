package com.rks.spring5.ch2.decoupled;

public class HelloWorldDecoupledWithFactory {

    public static void main(String[] args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getProvider();

        mr.setMessageProvider(mp);
        mr.render();
    }
}
