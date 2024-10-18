import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;

        numeros.add(numero1);
        numeros.add(numero2);
        numeros.add(numero3);
        numeros.add(numero4);
        numeros.add(numero5);

        Integer [] numeros2 = new Integer[5];
        numeros2 = numeros.toArray(numeros2);

        for (Integer a : numeros2){
            System.out.println(a);
        }

    }
}
