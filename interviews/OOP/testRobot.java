package interviews.OOP;


class Robot 
{
   int currentX=0;
   int currentY=5;
   int previousX;
   int previousY;
   
  public Robot()
  { super();
    this.currentX=0;
    this.currentY=5; 
      
  } 
   
   
 public Robot(int x, int y)
 {
     super();     
     
     this.currentX = x;
     this.currentY = y;
     
 }
 
 
 void moveX(int dx) 
 {
     this.previousX = currentX;
     this.currentX = this.previousX+dx;
     
 }
 
 void moveY(int dy) 
 {
     this.previousY = currentY;
     this.currentY = this.previousY+dy;
     
 }
 
 void printCurrentCoordinates()
 {
     System.out.println(this.currentX+" "+this.currentY);
     
 }
 
 void printLastCoordinates()
 {
     System.out.println(this.previousX+" "+this.previousY);
 }
 
 void printLastMove()
 {
     
    if (this.currentX!=this.previousX)  {System.out.println("x "+( this.currentX-this.previousX)    );   }    
    if (this.currentY!=this.previousY)   {System.out.println("x "+( this.currentY-this.previousY)    );   }    
    
    
 }
    
    
}

public class testRobot {

}
