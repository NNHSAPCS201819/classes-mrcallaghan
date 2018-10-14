import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    // instance variables
    private int x;
    private int y;
    private int floors;
    private int windowsPerFloor;
    private static final int WINDOW_WIDTH = 25;
    private static final int WINDOW_HEIGHT = 50;
    private static final int WINDOW_MARGIN = 10;
    private static final int FLOOR_HEIGHT = 70;


    /**
     * Constructor for objects of class Building
     */
    public Building(int leftX, int topY, int numFloors, int windows)
    {
        // initialise instance variables
        this.x = leftX;
        this.y = topY;
        this.floors = numFloors; 
        this.windowsPerFloor = windows;
    }

    /**
     * draw method - draws the building
     * 
     * @param  g2   graphics object
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(this.x, this.y, (this.windowsPerFloor * Building.WINDOW_WIDTH) 
                             + (this.windowsPerFloor * Building.WINDOW_MARGIN + Building.WINDOW_MARGIN), 
                             (Building.FLOOR_HEIGHT * this.floors));
        Color buildingColor = new Color(20, 20, 20);
        g2.setColor(buildingColor);
        g2.fill(building);
        
        Color windowColor = new Color(249, 249, 199);
        int newY = this.y;
        for (int i = this.floors; i > 0; i--)
        {
            int newX = this.x;
            for (int j = this.windowsPerFloor; j > 0; j--)
            {
                Rectangle window = new Rectangle(newX + Building.WINDOW_MARGIN,
                                                 newY + Building.WINDOW_MARGIN,
                                                 Building.WINDOW_WIDTH,
                                                 Building.WINDOW_HEIGHT);
                g2.setColor(buildingColor);
                g2.draw(window);
                g2.setColor(windowColor);
                g2.fill(window);
                newX += Building.WINDOW_WIDTH + Building.WINDOW_MARGIN;
            }
            newY += Building.FLOOR_HEIGHT;
        }
        
    }
}
