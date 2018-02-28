PImage face;
void setup(){
 face =loadImage("face.jpg");
size(800,600);
face.resize(width,height);



}
void draw(){
  background(face);
 fill(240,238,97);
ellipse(180,120,50,70);
ellipse(100,150,40,60);
fill(116,206,44);
ellipse(mouseX+80,mouseY,20,40);
ellipse(mouseX,mouseY+30,15,30);
fill(0,0,0);
ellipse(mouseX+80,mouseY,13,32);
ellipse(mouseX,mouseY+30,8,22);

}
//1. Create a new sketch in Processing and add setup() and draw() methods.
//2. Find an image on the internet and drop it into your sketch. It can be anything ,//
//you want as long as it has eyes!
//3. In your setup() method, import your image using the following code:
//4. Change the code you just entered so that “face.jpg” matches the name of your picture.
//5. Set the size of your sketch and the size of your image to be the same. Enter​ ​the
//following​ ​code​ ​in​ ​between​ ​the​ ​previous​ ​two​ ​lines​ ​you​ ​entered:
//6. In your draw() method, place white ellipses over the eyes in your image.
//7. Now add pupils to your eyes (i.e. the black part).
//8. Use mouseX and mouseY to move the left pupil when the mouse moves.
//9. Now make the right pupil move by using mouseX + [some distance] and mouseY + [3].
//10. Here’s the tricky part: stop the pupils from going outside of the eyes! To do this,
//imagine a rectangle that the pupil should stay within. When mouseX or mouseY goes 
//outside of these bounds, set it back to the boundary. Put this code before​ you draw 
//the ellipses.