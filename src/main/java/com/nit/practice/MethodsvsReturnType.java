package com.nit.practice;

public class MethodsvsReturnType {
        int v1(int id){
            id=5;
            System.out.println(id);
            return 10;
        }

        String v2(String a,boolean b){
            a="vani";
            b=true;
            System.out.println(a);
            System.out.println(b);
            return "vani";
        }

    public static void main(String[] args) {
        MethodsvsReturnType m=new MethodsvsReturnType();
        m.v1(15);
        m.v2("pinky",true);
    }
    }

