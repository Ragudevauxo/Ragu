import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("1.Area of circle\n2.Area of rectangle\nEnter your option");
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        if(option==1)//options
        {
            double radius = scanner.nextDouble();
            System.out.println(area(radius));
        }
        else if(option==2) {
            double X = scanner.nextDouble();
            double Y = scanner.nextDouble();
            System.out.println(area(X,Y));
        }
        else
        {
            System.out.println("invalid option");
        }
    }
    public static double area(double radius)
    {
        if(radius<0)
        {
            return -1;
        }
        return radius * radius *Math.PI;
    }
    public static double area(double X,double Y)
    {
        if(X<0 || Y<0)
        {
            return -1;
        }
        return X*Y;
    }
}
