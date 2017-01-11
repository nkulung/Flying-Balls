//Nick Kulungian & Felipe Sanchez
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick
 */
public class CSC211Lab09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        JFrame lab09Window = new JFrame();
        lab09Window.setSize(800, 600); // width x height 
        lab09Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String shape = JOptionPane.showInputDialog(lab09Window, "Enter a number");
        int numShape = Integer.parseInt(shape);
        Lab09Panel shapePanel = new Lab09Panel(numShape);
        lab09Window.add(shapePanel);
        lab09Window.setVisible(true); 

        shapePanel.animateShapes();
        
        
        
        
        
        
    }
    
}
