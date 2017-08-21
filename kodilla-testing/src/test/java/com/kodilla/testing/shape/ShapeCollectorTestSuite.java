package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    private Circle circle;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void addFigure() {
        ShapeCollector collector = new ShapeCollector();

        collector.addFigure(circle);

        Assert.assertEquals(1, collector.getFiguresQuantity());

    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector collector = new ShapeCollector();

        collector.removeFigure(circle);

        boolean result = collector.removeFigure(circle);

        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(circle);

        Shape retrievedFigure = collector.getFigure(0);

        Assert.assertEquals(circle, retrievedFigure);
    }

    @Test
    public void testShowFigures() {

        Square square = new Square(8.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);

        String retrievedString = collector.showFigures();
        String expectedString = "Square";

        Assert.assertEquals(expectedString, retrievedString);
    }
}