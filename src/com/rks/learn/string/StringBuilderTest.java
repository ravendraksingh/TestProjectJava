package com.rks.learn.string;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        sb = sb.append(" ").deleteCharAt(0).replace(0, 1, "H").append("World!");
        System.out.println(sb);

    }
}
