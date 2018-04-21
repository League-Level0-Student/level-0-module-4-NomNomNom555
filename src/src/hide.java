package src;

public class hide {
	PImage creeper;
	void setup(){
	size (900, 900);
	creeper=loadImage("creep.png");
	creeper.resize(5, 5);
	PImage minecraft = loadImage("hider.jpg");    
	minecraft.resize(width, height);
	background(minecraft);
	}
	void draw(){
	image(creeper, 500, 500);     
	ellipse(mouseX
	}

	boolean isNear(int a, int b) {
	if (abs(a - b) < 10)
	     return true;
	else
	     return false;
	}



}
