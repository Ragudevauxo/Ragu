import java.util.Scanner;

public class MinutesToYearsandDaysCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the minutes");
        Scanner scanner=new Scanner(System.in);
        long minutes=scanner.nextLong();
        printYearsAndDays(minutes);
    }
    public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
        {
            System.out.println("Invalid Value");
        }else {
            long years = minutes / 525600;//minutes to years
            long remainingdays = (minutes % 525600) / 1440;//to get remaining
            System.out.println(minutes + " = " + years + " y and " + remainingdays + " d");
        }

    }
}
