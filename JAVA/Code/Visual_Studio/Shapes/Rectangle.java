package Code.CodeWithMohan;
import Code.CodeWithMohan.General_Attributes_1;

public class Rectangle implements General_Attributes_1{
    private double length = 0.0d;
    private double breadth = 0.0d;
    private double Area_Rectangle= 0.0d;
    private double perimeter_Rectangle= 0.0d;
    private double volume_Rectangle= 0.0d;
    
    public Rectangle(double Length, Double Breadth){
        this.length = Length;
        this.breadth = Breadth;
    }
    public void Area(){
        this.Area_Rectangle= this.length * this.breadth;
        System.out.println("The area of the rectangle is = "+this.Area_Rectangle+" m^2 ");

    }

    public void Perimeter(){
        double perimeter_Rectangle= 2 * (this.length+ this.breadth) ;
        System.out.println("The perimeter of the rectangle is "+perimeter_Rectangle+" m ");
    }

    public void SurfaceArea(){
        this.Area_Rectangle= this.length * this.breadth;
        System.out.println("The Surface area of the rectangle is = "+this.Area_Rectangle+" m^2 ");
    }

    public void Volume(){
        System.out.println("rectangle is 2D and therefore there is no Volume,for further information you need to take cube or cuboid case ");
    }
}
