package com.rks.learn.array;

public class TestScoreGroupingProblem {

    public static void main(String[] args) {

        new TestScoreGroupingProblem().getResult();
    }

    public void getResult() {

        int[] scores = {10,15,29,30,43,98,3,78,31,69,51,50,87,20,76,90,82,22,67,72} ;

        int poor = 0, average = 0, good = 0, excellent = 0;

        for (int i = 0; i < scores.length ; i++) {
            int marks = scores[i];
            if (marks <= 25) {
                poor++;
            } else if (marks > 25 && marks <= 50) {
                average++;
            } else if (marks > 50 && marks <= 75) {
                good++;
            } else if (marks > 75 && marks <= 100) {
                excellent++;
            }
        }
        System.out.println("Group       Range       Student");
        System.out.println("Excellent   76-100      " + excellent);
        System.out.println("Good        51-75       " + good);
        System.out.println("Average     26-50       " + average);
        System.out.println("Poor        0-25        " + poor);
    }
}
