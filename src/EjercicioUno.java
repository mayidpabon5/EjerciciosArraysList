import java.util.ArrayList;
import java.util.List;

public class EjercicioUno {

    public static void main(String[] args) {

        String nombre1 = "Apple";
        String nombre2 = "Banana";
        String nombre3 = "Cherry";
        List<String> Fruits = new ArrayList<>();
        Fruits.add(nombre1);
        Fruits.add(nombre2);
        Fruits.add(nombre3);
        System.out.println(Fruits.size());
        Fruits.remove(1);
        System.out.println(Fruits.size());
        Fruits.remove(1);
        String nombre4 = "orange";
        Fruits.add(nombre4);
        System.out.println(Fruits);

    }

}
