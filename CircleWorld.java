import greenfoot.*;  // Import Greenfoot classes

public class MyWorld extends World {
    public MyWorld() {
        super(800, 600, 1); // Create a new world with specified dimensions
        Circle circle = new Circle(); // Create a new Circle actor
        addObject(circle, 300, 200); // Add circle to the world at (300, 200)
    }
}

