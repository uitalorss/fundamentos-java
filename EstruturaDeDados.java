import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        nomes.add("Uítalo");
        nomes.add("Pietra");
        nomes.add("Uirlan");

        // for(String nome: nomes){
        //     System.out.println(nome);
        // }

        nomes.forEach(nome -> System.out.println("O nome é " + nome));
    }
}