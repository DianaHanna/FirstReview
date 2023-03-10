package Review9;

// collection of public static final variables and public abstract methods
public interface Drawable {

    String tool="Pencil"; // it cannot be changed by default it's public static final
    void draw(); // by default this method becomes public abstract

    // above is how interface used to be before Java8
    // after Java8 static and default methods were added to the interface

    default void print(){
        System.out.println("We are drawing object using "+tool);
    }
    static void erase(){
        System.out.println("All drawings are erasable");
    }
}

abstract class Shape{
    String color;
    double width, length;

    Shape(String color, double width, double length){
        this.color=color;
        this.length=length;
        this.width=width;
    }
    public abstract double calculateArea();
}
 class Rectangle extends Shape implements Drawable{

     Rectangle(String color, double width, double length) {
         super(color, width, length);
     }

     public void draw(){ // must be public since it's public in the interface
        System.out.println("I am drawing rectangle");
    }

     @Override
     public double calculateArea() {
         return length*width;
     }
 }
class Square implements Drawable{

    @Override
    public void draw() {
        System.out.println("I am drawing square");
    }
}