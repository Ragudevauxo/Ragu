package com.auxo;

import java.util.Scanner;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        System.out.println(sumFirstAndLastDigit(number));
    }
    public static int sumFirstAndLastDigit(int number)
    {
        if(number>=0)
        {
            int beforeMod=0,sum=0,count=0;
            while(number!=0)
            {
                if(count==0)
                {
                    sum+=number%10;
                    count=1;
                    number/=10;

                    beforeMod=sum;
                    continue;
                }
                beforeMod=number%10;
                number/=10;


            }
            return sum+beforeMod;
        }
        return -1;
    }
}
