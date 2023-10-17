import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(9);
        numeros.add(3);
        numeros.add(0);

        System.out.println(numeros);

        for (Integer elemento : numeros){
            System.out.println(elemento);
        }

        System.out.println(numeros.contains(3));
    }
}
