package geometric;

import java.util.Scanner;

public class Main {
  private final static Scanner scanner = new Scanner(System.in);

  static void main() {
    var option = -1;
    GeometricForm geometricForm = null;

    do {
      System.out.println("==== Escolha a forma geométrica para calcular a área");
      System.out.println("1 - Quadrado");
      System.out.println("2 - Retângulo");
      System.out.println("3 - Círculo");
      System.out.println("4 - Sair do programa");
      option = scanner.nextInt();

      switch (option) {
        case 1 -> geometricForm = createSquare();
        case 2 -> geometricForm = createRetangle();
        case 3 -> geometricForm = createCircle();
        case 0 -> System.exit(0);
        default -> System.out.println("Opção inválida");
      }
      if (geometricForm != null) {
        System.out.println("O calculo da área é: " + geometricForm.getArea());
      }
    } while (true);

  }

  private static GeometricForm createSquare() {
    System.out.println("Informe os tamanhos dos lados");
    var side = scanner.nextDouble();

    return new Square(side);
  }

  private static GeometricForm createRetangle() {
    System.out.println("Informe a base");
    var base = scanner.nextDouble();

    System.out.println("Informe a altura");
    var height = scanner.nextDouble();

    return new Rectangle(height, base);
  }

  private static GeometricForm createCircle() {
    System.out.println("Informe radius do circulo");
    var radius = scanner.nextDouble();

    return new Circle(radius);
  }
}
