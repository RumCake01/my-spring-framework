package com.cydeo.tightly_coupled;

public class Mentor {

    // created relationship between class -> Has A relationship instead of extending classes.
    FulltTimeMentor fulltTimeMentor;
    PartTimeMentor partTimeMentor;


    public Mentor(FulltTimeMentor fulltTimeMentor, PartTimeMentor partTimeMentor){
        this.fulltTimeMentor = fulltTimeMentor;
        this.partTimeMentor = partTimeMentor;

    }

    public void manageAccount(){
        fulltTimeMentor.createAccount();
        partTimeMentor.createAccount();
    }



}
