import java.util.InputMismatchException;
import java.util.Scanner;

public class MegaBytesConverter
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input value");
        try
        {
            int value=scanner.nextInt();//user input value
            printMegaBytesAndKiloBytes(value);
        }
        catch(InputMismatchException e)//when user enters invalid value like string
        {

            System.out.println("Input Mismatch ....Retry with valid value");

        }

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int remainingkb=kiloBytes%1024;//remaining kilobytes value
            int remainingmb=kiloBytes/1024;//remaining megabytes value
            System.out.println(kiloBytes+" KB = "+remainingmb+" MB and "+remainingkb+" KB");
        }

    }

}