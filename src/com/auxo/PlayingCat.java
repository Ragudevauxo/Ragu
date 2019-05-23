import java.util.Scanner;

public class PlayingCat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter whether summer or not");
        boolean isSummer=scanner.nextBoolean();//user input
        System.out.println("enter temperature");
        int temperature=scanner.nextInt();//user input
        System.out.println(isCatPlaying(isSummer,temperature));//check for validating

    }
    public static boolean isCatPlaying(boolean isSummer,int temperature)
    {
        if(isSummer && (temperature>=25 && temperature<=45))
        {
            return true;
        }
        if((temperature>=25 && temperature<=35))
        {
            return true;
        }


        return false;
    }
}
