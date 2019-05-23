import java.util.Scanner;

public class EqualityPrinter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the values");
        int one=scanner.nextInt();
        int two=scanner.nextInt();
        int three=scanner.nextInt();
        printEqual(one,two,three);//function to check equals
    }
    public static void printEqual(int one,int two,int three)
    {
        if(one<0 ||two <0 ||three<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            if(one==two && one==three)
            {
                System.out.println("All numbers are equal");
            }
            else if(one!=two && two !=three && one!=three )
            {
                System.out.println("All numbers are different");
            }
            else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}
