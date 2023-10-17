package estruturasDeDados;
import java.util.HashMap;
import java.util.Map;

public class ColecaoHashMap {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Uítalo", 8);
        notas.put("Uitana", 9);
        notas.put("Uirlan", 10);

        for(Map.Entry<String, Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }

        System.out.println(notas.get("Uítalo"));
    }
}
