package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averNumberOfPostsPerUser;
    private double averNumberOfCommentsPerUser;
    private double averNumberOfCommentsPerPosts;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averNumberOfPostsPerUser = numberOfPosts/numberOfUsers;
        averNumberOfCommentsPerUser = numberOfComments/numberOfUsers;
        averNumberOfCommentsPerPosts = numberOfComments/numberOfPosts;

    }

    public int getNumberOfUsers() { return numberOfUsers; }

    public int getNumberOfPosts() { return numberOfPosts;}


    public int getNumberOfComments() { return numberOfComments;}


    public double getAverNumberOfPostsPerUser() { return averNumberOfPostsPerUser; }


    public double getAverNumberOfCommentsPerUser() {
        return averNumberOfCommentsPerUser;
    }

    public double getAverNumberOfCommentsPerPosts() {
        return averNumberOfCommentsPerPosts;
    }



}



