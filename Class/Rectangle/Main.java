package Class.Rectangle;
class Rectangle{
    double length;
    double width;

    double area(){
        return length * width;
    }

    double perimeter(){
        return 2 * (length + width);
    }

}
public class Main {
   public static void main (String [] args){
     Rectangle rect = new Rectangle();

     rect.length = 10;
     rect.width = 4;

     System.out.println("length: "+rect.length);
     System.out.println("Width: "+rect.width);
     System.out.println("Area: "+rect.area());
     System.out.println("perimeter: "+rect.perimeter());
     
   } 
}
