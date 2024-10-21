package inheritanceGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Inheritance<Instructor> instructorInheritance = new Inheritance<>();
        List<Instructor> instructors = new ArrayList<>();
        Instructor instructor = new Instructor("John", 9.5);
        instructorInheritance.addUsers(instructors, instructor);

        // Optional
        Optional<Integer> x = Optional.of(5);
        Optional<String> y = Optional.of("Nitesh");

        if(!y.isEmpty()){
            System.out.println(y.get());
        }

        if(x.isEmpty()){
            System.out.println("x is empty");
        }

        // super... extends...
        // link: https://www.bekk.christmas/post/2019/23/extend-your-super-knowledge-on-generics
        Function<Integer, String> sc = new StringConverter();
        Optional<String> convertedInt = x.map(sc);
        System.out.println(convertedInt.get());
    }
}
