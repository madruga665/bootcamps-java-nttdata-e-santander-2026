package Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {

  static void main() {
    List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60));

    numbers.forEach(num -> System.out.println("Numero: " + num));

    System.out.println("Tamanho do array");
    System.out.println(numbers.size());

    System.out.println("O array tem o número 10?");
    System.out.println(numbers.contains(10));
  }
}
