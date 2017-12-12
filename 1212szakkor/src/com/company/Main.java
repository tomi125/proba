package com.company;

import java.util.Scanner;

public class Main {

    public static int fakt(int a)
    {
        if(a==0) return 1;
        else
        {
            int b=a*fakt(a-1);
            return b;
        }
    }

    public static void main(String[] args)
    {
	    System.out.println("aggya");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(fakt(a));



    }
}
