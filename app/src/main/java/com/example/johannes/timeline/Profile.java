package com.example.johannes.timeline;

public class Profile {

    public int profileId;
    public String name;
    public int resourceIdPost;
    public int resourceIdProfilePicture;
    public String question;
    public String answerOne;
    public String answerTwo;
    public String answerThree;
    public String answerFour;


    public Profile(int profileId, String name, String question, int resourceIdPost, int resourceIdProfilePicture,
                   String answerFour, String answerOne, String answerThree, String answerTwo) {
        this.answerFour = answerFour;
        this.answerOne = answerOne;
        this.answerThree = answerThree;
        this.answerTwo = answerTwo;
        this.name = name;
        this.profileId = profileId;
        this.question = question;
        this.resourceIdPost = resourceIdPost;
        this.resourceIdProfilePicture = resourceIdProfilePicture;
    }
}
