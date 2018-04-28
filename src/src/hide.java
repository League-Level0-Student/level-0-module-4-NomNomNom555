package src;

public class hide {
	import javax.swing.JOptionPane;
	PImage creeper;
	int x=500;
	int y=500;
	  void setup(){
	  size (900, 900);
	  creeper=loadImage("creep.png");
	  creeper.resize(6, 6);
	  PImage minecraft = loadImage("hider.jpg");    
	  minecraft.resize(width, height);
	  background(minecraft);
	  }
	  void draw(){
	  image(creeper,x,y);     
	 if (mousePressed) {
	 ellipse(mouseX,mouseY,6,6);
	  fill(252,3,3);
	  
	 if( isNear(mouseX,x)){
	 if (isNear(mouseY,y)){
	 fill(3,252,3);
	 JOptionPane.showMessageDialog(null,"You have found the creeper. Good job.");
	 }
	 }
	 }

	  }
	 
	  boolean isNear(int a, int b) {
	  if (abs(a - b) < 10)
	       return true;
	  else
	       return false;
	     }
	   