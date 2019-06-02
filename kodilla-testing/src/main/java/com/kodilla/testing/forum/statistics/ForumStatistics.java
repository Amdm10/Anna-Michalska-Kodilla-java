package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double postsAvgPerUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getPostsAvgPerUser() {
        return postsAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        postsAvgPerUser = countPostsAvgPerUser();
        commentsAvgPerUser = countCommentsAvgPerUser() ;
        commentsAvgPerPost = countCommentsAvgPerPost();
    }

    private double countPostsAvgPerUser() {
        if(numberOfUsers>0) {
            return (double)numberOfPosts/(double)numberOfUsers;
        } else {
            return 0;
        }
    }

    private double countCommentsAvgPerUser() {
        if(numberOfUsers>0) {
            return (double)numberOfComments/(double)numberOfUsers;
        } else {
            return 0;
        }
    }

    private double countCommentsAvgPerPost() {
        if(numberOfPosts>0) {
            return (double)numberOfComments/(double)numberOfPosts;
        } else {
            return 0;
        }

    }


}
