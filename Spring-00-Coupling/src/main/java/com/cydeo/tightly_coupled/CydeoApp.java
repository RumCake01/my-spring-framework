package com.cydeo.tightly_coupled;

public class CydeoApp {
    public static void main(String[] args) {

        FulltTimeMentor ft = new FulltTimeMentor();
        PartTimeMentor pt = new PartTimeMentor();

        Mentor mentor = new Mentor(ft, pt );
        mentor.manageAccount();

    }
}
