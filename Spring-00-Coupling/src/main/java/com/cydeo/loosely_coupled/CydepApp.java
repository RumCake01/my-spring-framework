package com.cydeo.loosely_coupled;

public class CydepApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);
        MentorAccount mentor2 = new MentorAccount(partTime);




        mentor.manageAcnt();
        mentor2.manageAcnt();

    }
}



