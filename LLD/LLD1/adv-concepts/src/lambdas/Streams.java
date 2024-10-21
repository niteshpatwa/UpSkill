package lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        for(Integer num: numbers){
            System.out.print(num + " ");
        }

        System.out.println();
        numbers.stream().forEach(x -> System.out.print(x*x + " "));

        System.out.println();
        // print even numbers.
        numbers.stream().forEach(x -> {
            if(x%2 == 0){
                System.out.print(x + " ");
            }
        });

        System.out.println();
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<String> filtered = names.stream()
                .filter(x -> x.charAt(0) == 'T')
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
