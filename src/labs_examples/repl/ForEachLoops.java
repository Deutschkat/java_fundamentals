package labs_examples.repl;

import java.util.ArrayList;

public class ForEachLoops {
    public static void main(String[] args) {

        // please declare an array or arraylist below

        // please populate that array or arraylist

        // please use a For Each Loop to print each element
        // in the array or arraylist you declared and populated above

        int[][] newArray = new int[5][5];

        for (int i = 0; i < newArray.length; i++) {
            for (int x = 0; x < newArray[i].length; x++) {
                newArray[i][x] = i * x;
            }
        }
        for (int[] outer : newArray) {
            for (int val : outer) {
                System.out.print(val + " | ");
            }
            System.out.println();
        }
    }


    }
