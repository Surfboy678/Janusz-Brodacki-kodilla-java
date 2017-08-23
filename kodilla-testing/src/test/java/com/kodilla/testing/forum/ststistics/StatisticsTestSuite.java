package com.kodilla.testing.forum.ststistics;
import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsPostsNumberNoPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("xyz" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        ForumStatistics statisticsCalculator = new ForumStatistics();

        statisticsCalculator.calculateAdvStatistics(statistics);
        int postsNumber = statisticsCalculator.getNumberOfPosts();


        Assert.assertEquals(0, postsNumber);
    }
    @Test
    public void testCalculateAdvStatisticsUserNumber1000() {

        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("xyz" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.usersNames()).thenReturn(usersNames);
        ForumStatistics statisticsCalculator = new ForumStatistics();

        statisticsCalculator.calculateAdvStatistics(statistics);
        int usersNumber = statisticsCalculator. getNumberOfUsers();


        Assert.assertEquals(100, usersNumber);
    }
    @Test
    public void testCalculateAdvStatisticsCommNoCom() {

        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("xyz" + i);
        }
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(usersNames);
        ForumStatistics statisticsCalculator = new ForumStatistics();

        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber = statisticsCalculator. getNumberOfComments();


        Assert.assertEquals(0, commentsNumber ,0);
    }

    @Test
    public void testCalculateAdvStatisticsMorePostsThemNumber() {

        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("xyz" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        ForumStatistics statisticsCalculator = new ForumStatistics();

        statisticsCalculator.calculateAdvStatistics(statistics);
        int commentsNumber = statisticsCalculator.getNumberOfComments();


        Assert.assertEquals(10, commentsNumber);
    }
    @Test
    public void testCalculateAdvStatisticsPostsPerUserMOreCom() {

        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("xyz" + i);
        }
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(usersNames);
        ForumStatistics statisticsCalculator = new ForumStatistics();

        statisticsCalculator.calculateAdvStatistics(statistics);
        double postsPerUser = statisticsCalculator.getAverNumberOfPostsPerUser();


        Assert.assertEquals(0.1, postsPerUser, 0.1);
    }
    @Test
    public void testCalculateAdvStatisticscommentsPerPostNoUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
       ForumStatistics statisticsCalculator = new ForumStatistics();
        //When
        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerPost = statisticsCalculator.getAverNumberOfCommentsPerPosts();
        //Then
        System.out.println("6 gdy gdy liczba użytkowników = 0");
        ;
        Assert.assertEquals(0.1, commentsPerPost, 0);
    }
    @Test
    public void testCalculateAdvStatisticsCommentsPerUser100() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("xyz" + i);
        }
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNames);
        ForumStatistics statisticsCalculator = new ForumStatistics();

        statisticsCalculator.calculateAdvStatistics(statistics);
        double commentsPerUser = statisticsCalculator. getAverNumberOfCommentsPerUser();


        Assert.assertEquals(0.1, commentsPerUser, 0.1);
    }
}