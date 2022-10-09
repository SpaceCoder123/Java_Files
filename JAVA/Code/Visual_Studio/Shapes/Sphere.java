package Code.CodeWithMohan;
// import Code.CodeWithMohan.General_Attributes_1;
import Code.CodeWithMohan.Circle;


public class Sphere extends Circle{
    private double height = 0.0d;
    private double area_sphere = 0.0d;
    private double perimeter_sphere = 0.0d;
    private double surface_area_sphere = 0.0d;
    private double volume_sphere = 0.0d;
    public double pi = Math.PI;
    
    public Sphere(double Radii){
        super(Radii);
        setRadius(Radii);
    }
    public void Area(){
        double pi = Math.PI;
        this.area_sphere = getRadius() * getRadius() * pi;
        System.out.println("The Area of the sphere is "+this.area_sphere+" m ");
    }

    public void Perimeter(){
  //      double Perimeter_sphere= 2 * pi * getRadius();
        this.perimeter_sphere = 2 * pi * getRadius();
        System.out.println("The perimeter of the sphere is "+this.perimeter_sphere+" m ");
        
    }

    public void SurfaceArea(){
        this.surface_area_sphere = 4*pi*getRadius()*getRadius();
        System.out.println("The Surface area of the sphere is = "+this.surface_area_sphere+" m^2 ");
    }

    public void Volume(){
        this.volume_sphere = 4/3 * pi * getRadius() * getRadius() * getRadius();
        System.out.println("The Volume of the sphere is = "+this.volume_sphere+" m^3 ");
        
    }
}
