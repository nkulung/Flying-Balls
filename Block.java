//Nick Kulungian & Felipe Sanchez
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class Block implements DrawableInterface {
    
    private int xPosition;
    private int yPosition;
    private double xVelocity;
    private double yVelocity;
    private double sideLength;
    private Color blockColor;
    
    
    public Block(){
        Random rand = new Random();
        xPosition = rand.nextInt(100);
        yPosition = rand.nextInt(100);
        xVelocity = rand.nextInt(10)+1;
        yVelocity = rand.nextInt(10)+1;
        sideLength = rand.nextInt(15)+1;
        blockColor = new Color(rand.nextInt(Integer.MAX_VALUE));
        
    }
    
    
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
    public double getSideLength(){
        return sideLength;
    }
    public Color getColor(){
        return blockColor;
    }
    public void setSideLength(double theSideLength){
        sideLength = theSideLength;
        
    }
    
    //Setter methods
    public void setVelocity(double velX, double velY){
        xVelocity = velX;
        yVelocity = velY;
    }
    public void setColor(Color theColor){
        blockColor = theColor;
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
        pen.setColor(blockColor);
        pen.fillRect((int)(xPosition-sideLength), (int)(yPosition-sideLength), (int) (sideLength), (int)(sideLength));
        
    }
    
    
    
}
