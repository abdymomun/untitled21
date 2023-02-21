import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a planet: ");
            String planetString = scanner.nextLine();
            Planeta.valueOf(planetString);

            Planeta planet = Planeta.valueOf(planetString);

            switch (planet) {
                case Earth:
                    System.out.println("Жер биздин үй планетабыз.");
                    break;
                case Mars:
                    System.out.println("Марс Жер планетасына окшош.");
                    break;
                case Saturn:
                    System.out.println("Юпитер - Күн системасындагы эң чоң планета.");
                    break;
                case Cybertron:
                    System.out.println("Кибертрон - трансформаторлордун мекени болгон планета.");
                    break;
                default:
                    System.out.println("Кечиресиз, менде ал планета тууралуу маалымат жок.");
                    break;
            }
        }
    }
}
