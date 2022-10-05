import java.util.Scanner;


// 1. create a class cylinder and use getter and setters to set its radius and height
// 2 .use ➊ to calculate surface and volume of the cylinder
// 3. Use a constructor and repeat
// 4. Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
class Cylinder{
    private float height = 0.0f;
    private float radius = 0.0f;

//    public float getRadius() {
//        return radius;
//    }
//
//    public void setRadius(float radius) {
//        this.radius = radius;
//    }
    float pi = 3.1427f;

//    public float getHeight() {
//        return height;
//    }
//
//    public void setHeight(float height) {
//        this.height = height;
//    }
    public Cylinder(float Radius, float Height){
        this.radius = Radius;
        this.height = Height;
    }

    public float getVolume(){
        float Volume = this.pi * this.radius*this.radius *this.height;
        return Volume;
    }
    public float getSurfaceArea(){
        float Area =( 2 * this.pi * this.radius*this.height)+( 2 * this.pi * this.radius*this.radius);
        return Area;
    }
}

class Rectangle2{
    private float height = 0.0f;
    public Rectangle2(float length, float height){
        this.length = length;
        this.height = height;
    }
    private float length = 0.0f;
    public Rectangle2(){
        this.length = 5.0f;
        this.height = 5.0f;
    }
    public float getHeight() {
        return height;
    }
    public float getLength() {
        return length;
    }
}


public class CWH_36_Exercise_Access_Modifiers {
    public static void main(String[] args) {
        Cylinder jam = new Cylinder(3,4);
        System.out.println(jam.getVolume());
        System.out.println(jam.getSurfaceArea());

        // with initialization
        Rectangle2 cake = new Rectangle2(9,4);
        System.out.println(cake.getLength());
        System.out.println(cake.getHeight());

        // without initialization
        Rectangle2 cake2 = new Rectangle2();
        System.out.println(cake2.getLength());
        System.out.println(cake2.getHeight());
    }
}
