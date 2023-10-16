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
