package objects_classes_methods.labs.methods;

import java.util.ArrayList;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        ArrayList<Integer> nums = new ArrayList();

        for(int i = 10000; i >= 0; i--){
            if(i % 3 == 0 && i % 8 == 0){
                nums.add(i);
            }
        }

        for (Integer i : nums) {
            System.out.println(i);
        }
        System.out.println(nums.size());

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b


    // 3) Create a static void method that will print of joke of your choice to the console


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents


    // 5) Create a varargs method that will return the length of the varargs array passed in






}
