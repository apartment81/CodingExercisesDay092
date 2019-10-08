package ro.mirodone;

import java.util.function.Function;

public class Challenge1 {

    interface Jedi {
        String MASTER = "Yoda";

        default String attack () {
            return  jump(jedi -> String.join(jedi, useSaber(), useForce()));
        }

        private String jump (Function<String, String> function){
            return function.apply("Luke");
        }

        private  static String useSaber () {
            return "S";}

            private String useForce() {
            return "F";
            }
    }

    public static void main(String... starWars) {

        System.out.println(new Jedi() {
            public String useForce() {
                return "X";
            }
        }.attack() + Jedi.useSaber() + Jedi.MASTER);
    }

}
