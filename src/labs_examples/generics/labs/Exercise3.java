package labs_examples.generics.labs;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Exercise3 {

   public static void main(String[] args) {

       int T;
       int U;

       Integer[] katArray = {1,2,3,4,5,6,7};
       List<Integer> listOne = Arrays.asList(7,8,450,55,100,200);

       genericMethod(34, 67.75);

       List<String> listTwo = Arrays.asList("one", "punk", "kayak", "deed", "wastebasket");
       System.out.println(countPalindromes(listTwo));

       exchange(katArray,2, 6);
       System.out.println(max(listOne,0,listOne.size()));







    }

    static <T extends Number, U extends Number> double genericMethod(T x, U y){

       double sum = x.byteValue() + y.byteValue();
        System.out.println(sum);
        return sum;
    }


    static <T extends Collection<String>> int countPalindromes(T collection){
       int count = 0;
       for(String s : collection){
           if(isPalindrome(s)){
               count++;
           }
       }
       return count;
    }

    static boolean isPalindrome(String string){
       for(int x = 0; x < string.length() / 2; x++){
           if(string.charAt(x) != string.charAt(string.length() - x - 1)){
               return false;
           }
       }
       return true;
    }

    static <T> void exchange(T[]myArray, int x, int j){
       T count = myArray[x];
       myArray[x] = myArray[j];
       myArray[j] = count;

        System.out.println(Arrays.toString(myArray));
    }

    static <T extends Comparable<T>> T max(List<T> listInput, int begin, int end){
       T max = listInput.get(begin);
       for(int x = begin + 1; x < end; x++){
           if(listInput.get(x).compareTo(max) > 0){
               max = listInput.get(x);
           }
       }
       return max;
    }


}
