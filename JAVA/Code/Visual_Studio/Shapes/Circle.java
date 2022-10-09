package Code.CodeWithMohan;
import Code.CodeWithMohan.General_Attributes_1;

public class Circle implements General_Attributes_1{
    private double radius = 0.0d;
    private double Area_circle = 0.0d;
    private double perimeter_circle = 0.0d;
    private double volume_circle = 0.0d;
    
    public Circle(double Radius){
        this.radius = Radius;
    }
    public void Area(){
        double pi = Math.PI;
        this.Area_circle = this.radius * this.radius * pi;
        System.out.println("The area of the circle is = "+this.Area_circle+" m^2 ");

    };

    public void Perimeter(){
        double pi = Math.PI;
        this.perimeter_circle = 2 * this.radius * pi;
        System.out.println("The perimeter of the circle is "+perimeter_circle+" m ");
    }

    public void SurfaceArea(){
        System.out.println("The Surface area of the circle is = "+this.Area_circle+" m^2 ");
    }

    public void Volume(){
        System.out.println("Circle is 2D and therefore there is no Volume,for further information you need to take cylinder case ");
    }

    public void setRadius(double Radius){
        this.radius = Radius;
    }

    public Double getRadius(){
        return this.radius;
    }
    public Double getArea(){
        return this.Area_circle;
    }
}