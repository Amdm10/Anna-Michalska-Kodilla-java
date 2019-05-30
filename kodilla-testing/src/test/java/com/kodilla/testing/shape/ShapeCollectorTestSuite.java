package com.kodilla.testing.shape;


import org.junit.*;

public class ShapeCollectorTestSuite {

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
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(4.5);
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1,shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(4.5));
        //When
        boolean result = shapeCollector.removeFigure(new Circle(4.5));
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(4.5));
        //When
        boolean result = shapeCollector.removeFigure(new Circle(4.0));
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(4.5));
        //When
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(new Circle(4.5),retrievedFigure);
    }

    @Test
    public void testGetFigureNotExisting() {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(4.5));
        //When
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(2);
        //Then
        Assert.assertNull(null,retrievedFigure);
    }

    @Test
    public void testGetFigureNotExistingNMinus() {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(4.5));
        //When
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(-1);
        //Then
        Assert.assertNull(null,retrievedFigure);
    }

}
