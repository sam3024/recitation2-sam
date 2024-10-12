import greenfoot.*;  // Import Greenfoot classes
import java.util.Random; // Import Random class

public class Circle extends Actor {
    private int count = 0; // Counter for pulsating effect
    private Random random; // Random instance for movement

    public Circle() {
        random = new Random();
        setRotation(90); // Initial orientation
    }

    public void act() {
        pulsate(); // Call the pulsate method
        moveIt(); // Call the moveIt method
    }

    // Method to pulsate the circle
    private void pulsate() {
        int radius = Math.abs(count - 30); // Calculate radius
        GreenfootImage image = new GreenfootImage(radius * 2, radius * 2); // Set image size
        image.setColor(Color.BLUE); // Set circle color
        image.fillOval(0, 0, radius * 2, radius * 2); // Draw circle
        setImage(image); // Update the actor's image

        count = (count + 1) % 61; // Update count, cycling from 0 to 60
    }

    // Method to move the circle in a random direction
    private void moveIt() {
        int randomValue = random.nextInt(21) - 10; // Generate random value between -10 and 10
        int currentDirection = getRotation(); // Get current direction
        setRotation(currentDirection + randomValue); // Set new direction
        move(1); // Move one step in the new direction
    }
}
