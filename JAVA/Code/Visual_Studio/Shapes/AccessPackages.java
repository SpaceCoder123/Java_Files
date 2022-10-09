package Shapes;

import Code.CodeWithMohan.Circle;
import Code.CodeWithMohan.Sphere;
import Code.CodeWithMohan.Rectangle;

public class AccessPackages {
    
    public static void main(String[] args){
        Circle vola = new Circle(5);
        //vola.Volume(); 
        Circle vola2 = new Sphere(5);
        //vola.Volume();
        System.out.println(vola2.getArea()); 
        vola.Area();
        vola.Perimeter();
        vola.SurfaceArea();
        vola2.Area();
        vola2.SurfaceArea();
        vola2.Perimeter();
        vola2.Volume();

        Rectangle vola3 = new Rectangle(5.0,4.00);
        vola3.Area();
        vola3.Perimeter();
        vola3.SurfaceArea();
        vola3.Volume();



        

    }

}
