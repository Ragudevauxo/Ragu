import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scanner=new Scanner(System.in);
        int Year=scanner.nextInt();//user input
        System.out.println(isLeapYear(Year));
    }
    public static boolean isLeapYear(int year)
    {
        boolean flag=false;
        if(year<1||year>9999) {
            return flag;
        }


        if((year%4==0))
        {
            if(year %100 ==0)
            {
                if(year %400 ==0)
                {
                    flag=true;
                }else
                {
                    flag=false;
                }
            }else
            {
                flag=true;
            }


        }

        return flag;
    }

}
