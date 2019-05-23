import java.util.InputMismatchException;
import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//for getting user input

            System.out.println("enter the distance in km/h");
            try
            {
                double dist=scanner.nextDouble();
                if(toMilesPerHour(dist)<0)//function call
                {
                    System.out.println("invalid value");
                }else
                {
                    System.out.println(dist+" km/h"+" = "+toMilesPerHour(dist)+" mi/h");
                }

            }catch(InputMismatchException e)//when user enters invalid value like string
            {

                System.out.println("Input Mismatch ....Retry with valid value");

            }



    }
    public static long toMilesPerHour(double kilometersPerHour)
    {
        long result=-1;
        if(kilometersPerHour>=0)
        {
            result = Math.round(kilometersPerHour / 1.609);//Round the value and store in result
        }

        return result;

    }
}
