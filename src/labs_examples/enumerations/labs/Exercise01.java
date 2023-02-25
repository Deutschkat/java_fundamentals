package labs_examples.enumerations.labs;

public class Exercise01 {
    public static void main(String[] args) {
       // 1st part of lab

        MyClass.TestStatus myTest = MyClass.TestStatus.STARTED;
        System.out.println(myTest);
        MyClass.TestStatus yourTest = MyClass.TestStatus.FINISHED;
        System.out.println(yourTest);

        // Parameterized Enum

        for(EnumPartTwo.Day d : EnumPartTwo.Day.values()){
            System.out.print("Day: " + d + " = ");
            if(d.getPointVal() <= 3){
                System.out.println("Beginning of the week.");
            }else if(d.getPointVal() == 4) {
                System.out.println("Midweek.");
            }else{
                    System.out.println("Later in the week.");
                }
            }

        }

    }

// 1st Part of Lab
class MyClass {
    enum TestStatus{
        STARTED,
        INPROGRESS,
        FINISHED,
        GRADED
    }


}

 // Parameterized Enum
// Assigning days of the week respective points as an example.
class EnumPartTwo {
     public enum Day {
         SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5),
         FRIDAY(6), SATURDAY(7);

         Day(int pointVal) {
             this.pointVal = pointVal;
         }

         private final int pointVal;

         public int getPointVal() {
             return pointVal;
         }


     }
 }
