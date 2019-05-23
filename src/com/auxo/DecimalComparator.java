import java.util.Scanner;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println("Enter the value one");
        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextDouble();//user input
        System.out.println("Enter the value two");
        double value2 = scanner.nextDouble();//user input
        System.out.println(areEqualByThreeDecimalPlaces(value1, value2));//validate
    }

    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
        if ((value1 > 0 && value2 > 0) || (value1 < 0 && value2 < 0)) {//check for both signs
            String one = String.valueOf(value1);
            String two = String.valueOf(value2);
            int apos = one.indexOf(".");
            //System.out.println(apos);
            int bpos = two.indexOf(".");
            // System.out.println(bpos);
            int i = apos + 1, j = bpos + 1;
            int count = 0;
            int flag = 0;
            int condition = i + 2 < one.length() ? 0 : 1;
            int condition1 = j + 2 < two.length() ? 0 : 1;
            String string = "";
            String string1 = "";
            if (condition == 0) {
              //  System.out.println("eyes can havae more than 3");
                string = one.substring(i, i + 3);
            } else {
              //  System.out.println("not have more than 3");
                string = one.substring(i, one.length());
            }
            if (condition1 == 0) {
              //  System.out.println("eyes can havae more than 3");
                string1 = two.substring(i, i + 3);
            } else {
                //System.out.println("not have more than 3");

                string1 = two.substring(i, one.length());
            }
         //   System.out.println(n + "    " + n1);
            if (string.equals(string1)) {//check for equals
                return true;
            } else {
                return false;
            }


        }
        return false;
    }
}
