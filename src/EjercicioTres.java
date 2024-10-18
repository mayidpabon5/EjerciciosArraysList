import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {

    public static void main(String[] args) {

        int nombre1 = 1;
        int nombre2 = 2;
        int nombre3 = 3;
        int nombre4 = 4;
        int nombre5 = 5;
        int nombre6 = 6;
        int nombre7 = 7;
        int nombre8 = 8;
        int nombre9 = 9;
        int nombre10 = 10;
        List<Integer> Numbers = new ArrayList<>();
        Numbers.add(nombre1);
        Numbers.add(nombre2);
        Numbers.add(nombre3);
        Numbers.add(nombre4);
        Numbers.add(nombre5);
        Numbers.add(nombre6);
        Numbers.add(nombre7);
        Numbers.add(nombre8);
        Numbers.add(nombre9);
        Numbers.add(nombre10);

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer a : Numbers) {
            if (a % 2 == 0) {
                evenNumbers.add(a);
            }
        }
        System.out.println("Lista original: " + Numbers);
        System.out.println("-------------------------------------");
        System.out.println("Números pares: " + evenNumbers);

    }
}
