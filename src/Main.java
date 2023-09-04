import java.util.*;

class rectangle
{
    double length,width;
    public rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;

    }
    public double calculatearea()
    {
        double area=length*width;
        return area;
    }
    public double calculatecircumference()
    {
        double circumference=2*(length+width);
        return circumference;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        double rectangleLength = input.nextDouble();
        double rectanglewidth=input.nextDouble();
        rectangle obj=new rectangle(rectangleLength,rectanglewidth);
        System.out.println(obj.calculatearea());
        System.out.println(obj.calculatecircumference());
    }
}