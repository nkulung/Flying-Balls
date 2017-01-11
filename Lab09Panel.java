//Nick Kulungian & Felipe Sanchez
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class Lab09Panel extends JPanel{
    //Data Fields
    private DrawableInterface[] Shapes;
    private final int DEFAULT_SHAPES  = 95;
    
    //Default Constructor
    public Lab09Panel()
    {
        //Instantiates Shapes Array
        Shapes = new DrawableInterface[DEFAULT_SHAPES];
        for(int i = 0; i < Shapes.length; i++){
            Random rand = new Random();
            int ran = rand.nextInt(1);
            //Creates either a ball or block and adds to array
            if(ran == 0)
            {
                Ball newBall = new Ball();
                Shapes[i] = newBall;
            }
            else
            {
                Block newBlock = new Block();
                Shapes[i] = newBlock;
            }
        }
        
    }
    
    //Constructor with parameters
    public Lab09Panel(int numShapes)
    {
        Random rand = new Random();
        int ran = rand.nextInt(2);
        if(numShapes > 2 )
        {
            Shapes = new DrawableInterface[numShapes];
        }
        else
        {
            Shapes = new DrawableInterface[DEFAULT_SHAPES];
        }
        for(int i = 0; i < Shapes.length; i++)
        {  
            Random rand2 = new Random();
            int ran2 = rand2.nextInt(2);
            if(ran2 == 1)
            {
                Ball newBall = new Ball();
                Shapes[i] = newBall;
            }
            else
            {
                Block newBlock = new Block();
                Shapes[i] = newBlock;
            }
        }
    }
   //Paint component methods
    public void paintComponent(Graphics pen)
    {
        //Makes sure doesn't leave streak on windows PC's
        super.paintComponent(pen);
        for(DrawableInterface n : Shapes)
        {
            n.draw(pen);
        }
    }
    
    //Animate shape method
    public void animateShapes() throws InterruptedException
    {
        //Counter so loop  runs for 20 seconds
        int counter = 0;
       // *** this loop so that it only runs for 20 seconds ***
       while(counter < 2000)
       {
        for(DrawableInterface n : Shapes)
        {
            n.move();
            checkPosition(n);
        }
        repaint();
         // sleep for n milliseconds so the animation doesn''t pass too fast
        Thread.sleep(10);
        counter ++; 
       }
    }
    
    //Checkposition method
    private void checkPosition(DrawableInterface theShape)
    {
        //Finds bounds
        Rectangle edgeRect = getBounds();
        int panelRight = (int)edgeRect.getMaxX();
        int panelBottom = (int)edgeRect.getMaxY();
        
        //Checks shapes position
       if( ( theShape.getX() >= panelRight && theShape.getVelocityX() >0) || (theShape.getX() <= 0 && theShape.getVelocityX() < 0) ){
            theShape.setVelocity(theShape.getVelocityX()*-1,theShape.getVelocityY()*1);
       }
       if( ( theShape.getY() >= panelBottom && theShape.getVelocityY() >0) || (theShape.getY() <= 0 && theShape.getVelocityY() < 0) ){
           theShape.setVelocity(theShape.getVelocityX()*1, theShape.getVelocityY()*-1);
       }     
    }
}
