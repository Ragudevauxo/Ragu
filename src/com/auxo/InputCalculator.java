package com.auxo;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumandAverage();
    }

    public static void inputThenPrintSumandAverage()
    {
        int num=0,sum=0,totalcount=0;
        System.out.println("Enter the numbers");
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt())
        {
            num=scanner.nextInt();
            sum=sum+num;
            totalcount++;
        }
        System.out.println(sum);
        if(totalcount!=0)
        {
            double avg=sum/totalcount;
            System.out.println("SUM is " +sum+" "+"AVG is " +Math.round(avg));
        }
        else
        {
            System.out.println("SUM is 0"+" "+"AVG is 0");
        }
    }

}