package labs_examples.exception_handling.labs;

import java.util.Scanner;

public class Ex6A {
    public static void main(String[] args) {

        try {
            printMethod2();
        }catch(ArithmeticException aex){
            System.out.println("Caught in main method.");
        }

    }

    public static void printMethod2(){
        method2();
    }



    public static void method2()throws ArithmeticException{

        int[] nums = {6, 7, 8, 9, 0};

        try {
            int x = nums[0] / nums[4];
        } catch (ArithmeticException aex) {
            System.out.println("This number not divisible by zero.");
            System.out.println("Throwing back.");
            throw aex;
        }
        }

    }
