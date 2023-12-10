package com.nit;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        String str="ratan";
         System.out.println(str);

         String str1=new String("pinky");
        System.out.println(str1);

        char[] ch={'1','2','3','4'};
        String str2=new String(ch);
        System.out.println(str2);

        byte[] b={11,12,13,14};
        String str3=new String(b);
        System.out.println(str3,);

        long[] lg={20000,30000,40000};
        String str4=new String(Arrays.toString(lg));
        System.out.println(str4);
    }
}
