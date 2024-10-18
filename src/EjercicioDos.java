import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {

    public static void main(String[] args) {

        int nombre1 = 1;
        int nombre2 = 2;
        int nombre3 = 3;
        int nombre4 = 4;
        int nombre5 = 5;
        List<Integer> Numbers = new ArrayList<>();
        Numbers.add(nombre1);
        Numbers.add(nombre2);
        Numbers.add(nombre3);
        Numbers.add(nombre4);
        Numbers.add(nombre5);
        for (int i = 0; i < 5; i++) {
            System.out.println(Numbers.get(i));
        }
        System.out.println("------------------------");
        for(int i : Numbers){
            System.out.println(i);
        }
        System.out.println("------------------------");
        int b = 4;
        while (b >= 0) {
            System.out.println(Numbers.get(b));
            b--;
        }
    }
}
