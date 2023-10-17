# fundamentos-java

## Estrutura de classe

```
public class HelloWorld{

}

```

#### Observações

- O nome do arquivo tem que ser o mesmo nome da classe.
- A classe precisa sempre estar com letra inicial maiúscula.

#### Palavras reservadas

- public = modificador de acesso da estrutura
- class = Tipo da estrutura que está sendo criada
- HelloWorld = Nome da classe

#### Inicialização do projeto

```
public static void main(String[] args){

}
```

#### Principais tipos de dados

- Valores

  - int (Representa valores sem quebra (sem vírgula)).

  ```
  int dado = 10;
  ```

  - double (Representa valores com quebra (com vírgula)).

  ```
  int dado = 10.5
  ```

  - float (Representa valores com quebra, assim como o double, porém tem uma precisão menor).
    - Necessário colocar um "f" após o número, pois o java usa como tipo padrão nos casos de valores com ponto flutuante o double.

  ```
  int dado = 10.5f
  ```

  - long (Representa valores sem quebra, assim como int, porém é indicado para valores extremamente grandes, que o int não suporta.).
    - Necessário colocar um "L" após o número, pois o java usa como tipo padrão nos casos de valores sem ponto flutuante o int.

  ```
  int dado = 434242342342432432342342L
  ```

- Texto

  - String (Principal tipo de dado que representa um texto em Java)
    - Necessário colocar a letra inicial maiúscula, pois o java utiliza a própria classe String para tratar os seus dados.

  ```
    String variavel = "banana";
  ```

- Booleano

  - boolean (Recebe um valor para true ou false para indicar se o valor é verdadeiro ou falso).

  ```
    boolean valor = true;

  ```

#### Estrutura de dados

##### Lista

A lista

```
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        nomes.add("Uítalo");
        nomes.add("Pietra");
        nomes.add("Uirlan");


        for(String nome: nomes){
             System.out.println(nome);
        }

        // o forEach pode ser feito da forma abaixo também.
        nomes.forEach(nome -> System.out.println("O nome é " + nome));
    }
}
```

##### HashMap

Map = Coleção onde é possivel adicionar pares de chave/valor na estrutura.

- Trabalha apenas com chaves únicas

- Necessário informar qual o tipo da chave e qual o tipo do valor.
- Necessário também informar uma classe que ele possa gerenciar ao invés do tipo, pois o Map não aceita tipos primitivos (com exceção do String, em que já é usada uma classe).

```
public class Colecoes {
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

```

##### HashSet

Set = Coleçao de elementos únicos

- Não é possível pegar um elemento pelo indice pois o hashSet não foi feito para isso. A ordenação não importa aqui.

```
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

```

#### Programação orientada a objetos

É um paradigma de programação que se baseia na ideia de organizar e modelar o software em torno de objetos.

O que é um objeto?

- É a representação de uma entidade do mundo real, por exemplo: Uma pessoa, um animal, um computador

Os objetos são criados através de classes.

- Todos eles possuem características, que aqui podemos chamar de atributos.
- E todos possuem ações ou comportamentos, que são chamados de métodos.

Programar usando esse paradigma é totalmente diferente de programar usando Javascript, por exemplo, pois para criar algo referente ao objeto é necessário instanciá-lo.

O que é uma instância?

- É uma nova representação do representação do objeto.
- Exemplo: É como se, em uma fábrica de computadores, toda vez que alguém instanciasse o objeto computador e passasse os atributos pedidos, um novo computador fosse criado.

Conceito de Pacotes

Os pacotes são usados para agrupar classes relacionadas, assim é possível evitar conflitos de nomes entre classes.

```
public class Pessoa {
    public String nome;
    public int idade;
    public String cpf;

    void imprimirDados(){
        System.out.println("nome: " + nome + "\nidade: " + idade + "\ncpf: " + cpf + ".");
    }
}

```

##### Encapsulamento

O encapsulamento põe uma camada de segurança nos dados do objeto, pois impede que os dados sejam acessados direteamente pela instância do objeto.

- Para acessar e manipular os dados, passa a ser preciso utilizar métodos(getters e setters).

```
package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}

```
