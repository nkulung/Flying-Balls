import java.awt.Graphics; 
import java.awt.Color;
/**
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public interface DrawableInterface {
   /**
    * Gets the x position
    * @return the x position
    */
   int getX();
   /**
    * Gets the y position
    * @return the y position
    */
   int getY();
   /**
    * Moves the shape instantly to the given x and y positions
    * @param absX
    * @param absY 
    */
   void moveTo(int absX, int absY);
   /**
    * Moves the shape over time by dX and dY
    * @param dX
    * @param dY 
    */
   void moveBy(int dX, int dY);
   /**
    * Moves the shape
    */
   void move();
   /**
    * Gets x the velocity
    * @return the x velocity
    */
   double getVelocityX();
   /**
    * Gets the y velocity
    * @return the y velocity
    */
   double getVelocityY();
   /**
    * Set the velocity
    * @param dvX
    * @param dvY 
    */
   void setVelocity(double dvX, double dvY);
   /**
    * Get the color of the shape
    * @return the color
    */
   Color getColor();
   /**
    * Set the color of the shape
    * @param theColor 
    */
   void setColor(Color theColor);
   /**
    * Draws the shape
    * @param pen 
    */
   void draw(Graphics pen);
}
