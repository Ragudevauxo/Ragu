import java.util.Scanner;

public class BarkingDog {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("True if dog barking else enter false");
        boolean isBarking=scanner.nextBoolean();//user input
        System.out.println("enter the timing in range 0-23");
        int Hour=scanner.nextInt();//user input
        System.out.println(shouldWakeUp(isBarking,Hour));

    }
    public static  boolean shouldWakeUp(boolean barking,int hourOfDay)
    {
        if(barking && validate(hourOfDay) && canWake(hourOfDay))//checks the condition
        {
            return true;
        }

        return false;
    }
    public static boolean canWake(int hourOfDay)
    {
        if((hourOfDay<8 && hourOfDay>=0)||(hourOfDay>22 && hourOfDay<=23))//check is valid time to wake up
        {
            return true;
        }
        return false;
    }
    public static boolean validate(int hourOfDay)
    {
        if(hourOfDay>=0 && hourOfDay<=23 )//check hour range 0-23
        {
            return true;
        }
        return false;
    }
}
