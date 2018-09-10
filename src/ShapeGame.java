/**
* This template can be used as reference or a starting point for the Shape Game 
* for your final summative project
* @author Mangat
**/

//Graphics &GUI imports
import javax.swing.JFrame;

import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
  
//Keyboard imports
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


//Util
import java.util.ArrayList;
import java.util.Arrays;


class ShapeGameTemplate extends JFrame { 

  //class variables
  static JFrame window;
  JPanel gamePanel;
  //comment;
  
  Player player;
  Enemy enemy1;
  boolean[] move = new boolean[4];
  

  
   //Main
   public static void main(String[] args) {
	 System.out.println("The game is running.");
     window = new ShapeGameTemplate(); 

   }
   
   
  
  //Constructor - this runs first
  ShapeGameTemplate() {
    super("AGARIO BATTLE ROYALE!");  
    for (int i = 0; i < 4; i++) {
  	  move[i] = false;
    }
    
    Rectangle rect = new Rectangle();
    
    //create enemies and player
    player = new Player(50, 50, rect, 20);
  
    //spawn 5 eneimies
    enemy1 = new Enemy(1, 1, rect, 1, 1);


    // Set the frame to full screen 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800, 600);
   // this.setUndecorated(true);  //Set to true to remove title bar
   // frame.setResizable(false);


    
    //Set up the game panel (where we put our graphics)
    gamePanel = new GameAreaPanel();
    this.add(new GameAreaPanel());
    
    MyKeyListener keyListener = new MyKeyListener();
    this.addKeyListener(keyListener);

    this.requestFocusInWindow(); //make sure the frame has focus   
    
    this.setVisible(true);
    


   
  } //End of Constructor


  
  /** --------- INNER CLASSES ------------- **/
  
  // Inner class for the the game area - This is where all the drawing of the screen occurs
  private class GameAreaPanel extends JPanel {
    public void paintComponent(Graphics g) {   
       super.paintComponent(g); //required
       setDoubleBuffered(true); 

      
       
       
       
       //move enemies
       //System.out.println(enemy1.getBoundingBox().getCenterX() + " " + enemy1.getBoundingBox().getCenterY());
       //System.out.println(player.getBoundingBox().getCenterX() + " " + player.getBoundingBox().getCenterY());

       if (player.getBoundingBox().intersects(enemy1.getBoundingBox())) {
    	   		player.grow();
       }
       
       //check for collision
       
       
       
       
       //draw all squares
       
       
      
       g.fillRect(400,400,100,100);
       
	       if (move[0]) {
	    	   		player.moveUp();	       
	       } else if (move[1]){
		   		player.moveLeft();
	       } else if (move[2]){
		   		player.moveDown();
	       } else if (move[3]){
		   		player.moveRight();
	       }

       
       
       g.setColor(Color.BLUE);
       g.fillOval((int) player.getX(), (int) player.getY(), (int) player.getRadius(), (int) player.getRadius()); 

       repaint();
    }
  }
  
  // -----------  Inner class for the keyboard listener - this detects key presses and runs the corresponding code
    private class MyKeyListener implements KeyListener {
    	    	
      public void keyTyped(KeyEvent e) {  
      }

      public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
       
        if (KeyEvent.getKeyText(e.getKeyCode()).equals("W")) {  //If 'A' is pressed
        		move[0] = true;	
        	
        } else if (KeyEvent.getKeyText(e.getKeyCode()).equals("A")) {
        		move[1] = true;
        	
        } else if (KeyEvent.getKeyText(e.getKeyCode()).equals("S")) {
        		move[2] = true;
        } else if (KeyEvent.getKeyText(e.getKeyCode()).equals("D")) {
        		move[3] = true;

        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {  //If ESC is pressed
        	
          System.out.println("Quitting!"); //close frame & quit
          window.dispose();
          
        } 
        
        
        
      }   
      
      public void keyReleased(KeyEvent e) {
    	  
      if (KeyEvent.getKeyText(e.getKeyCode()).equals("W")) {  //If 'A' is pressed
      		move[0] = false;	
      	
      } else if (KeyEvent.getKeyText(e.getKeyCode()).equals("A")) {
      		move[1] = false;
      	
      } else if (KeyEvent.getKeyText(e.getKeyCode()).equals("S")) {
      		move[2] = false;
      } else if (KeyEvent.getKeyText(e.getKeyCode()).equals("D")) {
      		move[3] = false;
      }
    	  	
    	  
      }
    } //end of keyboard listener
  
 
    
}