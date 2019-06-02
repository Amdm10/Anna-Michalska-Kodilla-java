package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userListMock = new ArrayList<String>();
        for(int i=0; i<10; i++) {
            userListMock.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userListMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(120);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumStatistics.getPostsAvgPerUser(),0.01);
        Assert.assertEquals(12.0,forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(0,forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userListMock = new ArrayList<String>();
        for(int i=0; i<10; i++) {
            userListMock.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userListMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(120);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100.0,forumStatistics.getPostsAvgPerUser(),0.01);
        Assert.assertEquals(12.0,forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(0.12,forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userListMock = new ArrayList<String>();
        for(int i=0; i<10; i++) {
            userListMock.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userListMock);
        when(statisticsMock.postsCount()).thenReturn(60);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(6.0,forumStatistics.getPostsAvgPerUser(),0.01);
        Assert.assertEquals(0,forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(0,forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsLessThanPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userListMock = new ArrayList<String>();
        for(int i=0; i<10; i++) {
            userListMock.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userListMock);
        when(statisticsMock.postsCount()).thenReturn(120);
        when(statisticsMock.commentsCount()).thenReturn(60);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(12.0,forumStatistics.getPostsAvgPerUser(),0.01);
        Assert.assertEquals(6.0,forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(0.5,forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsCommentsMoreThanPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userListMock = new ArrayList<String>();
        for(int i=0; i<10; i++) {
            userListMock.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userListMock);
        when(statisticsMock.postsCount()).thenReturn(60);
        when(statisticsMock.commentsCount()).thenReturn(120);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(6.0,forumStatistics.getPostsAvgPerUser(),0.01);
        Assert.assertEquals(12.0,forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(2.0,forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userListMock = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(userListMock);
        when(statisticsMock.postsCount()).thenReturn(60);
        when(statisticsMock.commentsCount()).thenReturn(120);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0,forumStatistics.getPostsAvgPerUser(),0.01);
        Assert.assertEquals(0,forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(2.0,forumStatistics.getCommentsAvgPerPost(),0.01);
    }

    @Test
    public void testCalculateAdvStatisticsThousandUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userListMock = new ArrayList<String>();
        for(int i=0; i<1000; i++) {
            userListMock.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userListMock);
        when(statisticsMock.postsCount()).thenReturn(60);
        when(statisticsMock.commentsCount()).thenReturn(120);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.06,forumStatistics.getPostsAvgPerUser(),0.01);
        Assert.assertEquals(0.12,forumStatistics.getCommentsAvgPerUser(),0.01);
        Assert.assertEquals(2.0,forumStatistics.getCommentsAvgPerPost(),0.01);
    }

}
