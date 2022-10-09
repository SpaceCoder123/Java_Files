package Code.CodeWithMohan;
import Code.CodeWithMohan.General_Attributes_1;

public class Sqaure implements General_Attributes_1{
    private double length = 0.0d;
    private double Area_sqaure= 0.0d;
    private double perimeter_sqaure= 0.0d;
    private double volume_sqaure= 0.0d;
    
    public Sqaure(double Length){
        this.length = Length;
    }
    public void Area(){
        this.Area_sqaure= this.length * this.length;
        System.out.println("The area of the sqaureis = "+this.Area_sqaure+" m^2 ");

    };

    public void Perimeter(){
        double perimeter_sqaure= 4 * this.length ;
        System.out.println("The perimeter of the sqaureis "+perimeter_sqaure+" m ");
    }

    public void SurfaceArea(){
        this.Area_sqaure= this.length * this.length;
        System.out.println("The Surface area of the sqaureis = "+this.volume_sqaure+" m^2 ");
    }

    public void Volume(){
        System.out.println("Sqaure is 2D and therefore there is no Volume,for further information you need to take cube or cuboid case ");
    }
}