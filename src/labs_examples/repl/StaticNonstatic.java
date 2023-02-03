package labs_examples.repl;

public class StaticNonstatic {
        public static void main(String[] args) {

            Frog frog1 = new Frog("Kermit", "Jim Henson's Pond");
            Frog frog2 = new Frog("African Bullfrog", "Africa");
            Frog frog3 = new Frog("Tree Frog", "Jungle");


            System.out.println(frog1);
            System.out.println(frog2);
            System.out.println(frog3);


            // The number 3 printed for the numFrogs. Because it is a static variable, and it is shared between
            // all instances created by the object.


        }
    }

    class Frog {
        String name;
        String habitat;
        static int numFrogs;

        public Frog(String name, String habitat){
            this.name = name;
            this.habitat = habitat;
            numFrogs++;
        }

        @Override
        public String toString() {
            return "Frog{" +
                    "name='" + name + '\'' +
                    ", habitat='" + habitat + '\'' +
                    ", numFrogs= " + numFrogs + '\'' +
                    '}';
        }
    }


