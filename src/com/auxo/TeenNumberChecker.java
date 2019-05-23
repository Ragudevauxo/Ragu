import java.util.Scanner;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println("1.HasTeen\n2.IsTeen\nEnter your option");
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        if(option==1)//options
        {
            System.out.println("enter the three ages");
            int age1,age2,age3;
            age1=scanner.nextInt();
            age2=scanner.nextInt();
            age3=scanner.nextInt();
            System.out.println(hasTeen(age1,age2,age3));
        }else if(option==2)
        {
            System.out.println("enter the age");
            int age=scanner.nextInt();//user input
            System.out.println(isTeen(age));
        }else//for invalid option
        {
            System.out.println("invalid option");
        }




    }
    public static boolean hasTeen(int one,int two,int three)
    {


        if(isTeen(one)||isTeen(two)||isTeen(three))
        {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int value)
    {
        if(value <=19 && value >=13)//between range
        {
            return true;
        }
        return false;
    }
}
