package com.kodilla.patterns.strategy.social;


import org.junit.Assert;

import org.junit.Test;



public class UserTestSuite {

@Test
    public void testDefaultSharingStrategies(){

        //Given
        User john = new Millenials("John Smith");
        User william = new YGeneration("William Smith");
        User ann = new ZGeneration("Ann Smith");

        //When
        String johnShared = john.sharePosts();
        System.out.println("John like:" + johnShared);
        String williamShared = william.sharePosts();
        System.out.println("William like:" + williamShared );
        String annShared = ann.sharePosts();
        System.out.println("Ann like:" + annShared);

        //Then
    Assert.assertEquals("Facebook",johnShared);
    Assert.assertEquals("Twitter",williamShared);
    Assert.assertEquals("Snapchat", annShared);

    }
    @Test
    public void testIndividualSharingStrategy(){

        //Given
        User john = new Millenials("John Smith");

        //When
        String johnShared = john.sharePosts();
        System.out.println("John like:" + johnShared);
        john.setSocialPublisher();
        johnShared = john.sharePosts();
        System.out.println("John like:" + johnShared);

        //Then
        Assert.assertEquals("Facebook",johnShared);
    }
}
