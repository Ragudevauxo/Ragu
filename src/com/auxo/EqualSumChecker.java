import java.util.Scanner;

public class EqualSumChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int one,two,three;
        System.out.println("enter the value1 ");
        one=scanner.nextInt();
        System.out.println("enter the value2 ");
        two=scanner.nextInt();
        System.out.println("enter the value3 ");
        three=scanner.nextInt();

        System.out.println(hasEqualSum(one,two,three));
    }
    public static boolean hasEqualSum(int one,int two,int three)
    {
        return one+two ==three ?true:false;//condition checking
    }
}
