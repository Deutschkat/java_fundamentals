package videos_source_code.classes;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Test {

    public static void main(String[] args) {

        char[] letters =
                {'a','b','c','d','e','f','g','h','i','j','k','l',
                        'm','n','o','p','q','r','s','t','u','v',
                        'w','x','y','z', ' ', '!'};

        int[] nums = {15,17,14,16,16,0,12,12,8,13,6,26,8,18,26,
                        18,14,26,2,14,14,11,27};

        for(int i : nums){
            System.out.print(letters[i]);
        }
    }
}

//    1234567891011121314151617181920212223242526 27
//    abcdefghij k l m n o p q r s t u v w x y z  space