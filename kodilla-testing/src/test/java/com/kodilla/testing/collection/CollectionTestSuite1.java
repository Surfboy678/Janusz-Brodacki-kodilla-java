package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator1;
import org.junit.*;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite1 {
    @Before
    public void showBefore() {
        System.out.println("Test case begin...");
    }

    @After
    public void showAfter() {
        System.out.println("Test case end");
    }

    @BeforeClass
    public static void showBeforeClass() {
        System.out.println("Test Suite: begin...");
    }

    @AfterClass
    public static void showAfterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        OddNumbersExterminator1 exterminator1 = new OddNumbersExterminator1();

        exterminator1.exterminate(emptyList);

        Assert.assertEquals(0, exterminator1.getEvenNumbers().size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random generator = new Random();

        for (int n = 0; n < 50; n++) {
            numbers.add(generator.nextInt(100));
        }
        OddNumbersExterminator1 exterminator2 = new OddNumbersExterminator1();

        exterminator2.exterminate(numbers);

        for (Integer even : exterminator2.getEvenNumbers()) {

            Assert.assertTrue(even % 2 == 0);
        }
    }
}
