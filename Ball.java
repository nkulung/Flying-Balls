//Nick Kulungian & Felipe Sanchez

import javax.swing.JPanel;
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Rectangle;
import java.util.Random;

/**

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Nick Kulungian & 
 */

/**
 *
 * @author Nick
 */
public class Ball implements DrawableInterface {
    //Datafields
    private int xPosition;
    private int yPosition;
    private double xVelocity;
    private double yVelocity;
    private double radius;
    private Color ballColor;
    
    
    //Default ball constructor
    public Ball(){
        Random rand = new Random();
        xPosition = rand.nextInt(100);
        yPosition = rand.nextInt(100);
        xVelocity = rand.nextInt(10)+1;
        yVelocity = rand.nextInt(10)+1;
        radius = rand.nextInt(15)+1;
        ballColor = new Color(rand.nextInt(Integer.MAX_VALUE));
    }
    //Ball constructor with parameters
    public Ball(int posX, int posY, double velX, double velY, double myRadius, Color myColor){
        xPosition = posX;
        yPosition = posY;
        xVelocity = velX;
        yVelocity = velY;
        radius = myRadius;
        ballColor = myColor;
     }
    
    //Getter methods
    public int getX(){
        return xPosition;
    }
    public int getY(){
        return yPosition;
    }
    public double getVelocityX(){
        return xVelocity;
    }
    public double getVelocityY(){
        return yVelocity;
    }
    public double getRadius(){
        return radius;
    }
    public Color getColor(){
        return ballColor;
    }
    
    //Setter methods
    public void setVelocity(double velX, double velY){
        xVelocity = velX;
        yVelocity = velY;
    }
    public void setColor(Color theColor){
        ballColor = theColor;
    }
    
    //Move methods
    public void moveTo(int absoluteX, int absoluteY){
        xPosition = absoluteX;
        yPosition = absoluteY;
    }
    public void moveBy(int dx, int dy){
        xPosition = xPosition + dx;
        yPosition = yPosition + dy;
    }
    public void move (){
       xPosition =(int) (xPosition) +(int) (xVelocity);
       yPosition =(int) (yPosition) +(int) (yVelocity);
    }
    //Draw method
    public void draw (Graphics pen){
        pen.setColor(ballColor);
        pen.fillOval((int)(xPosition-radius), (int)(yPosition-radius), (int) (radius*2), (int)(radius*2));
    }
    //ToString
    @Override
    public String toString(){
        return "xPosition = " + xPosition + "yPosition = " + yPosition + "xVelocity = " + xVelocity + "yVelocity = " + yVelocity + "radius = " + radius; 
        
    }
}
