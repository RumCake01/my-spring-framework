package com.cydeo.loosely_coupled;

public class MentorAccount {
    Mentor mentor;

    public MentorAccount(Mentor mentor ){ this.mentor= mentor;}

    public void manageAcnt() {
    this.mentor.createAccount();
    }


}
