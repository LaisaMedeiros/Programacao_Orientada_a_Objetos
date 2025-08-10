### Objeto
É uma instância de uma classe, ou seja, algo criado a partir da classe que é como um molde. 

Exemplo: É como fabricar um carro real usando o projeto (classe).
``` java
   public class Main {
      public static void main(String[] args) {
          // Criando objetos (instâncias)
          Carro carro1 = new Carro();
          Carro carro2 = new Carro();
  
          // Definindo valores para o carro1
          carro1.marca = "Toyota";
          carro1.cor = "Preto";
          carro1.ano = 2020;
  
          // Definindo valores para o carro2
          carro2.marca = "Ford";
          carro2.cor = "Vermelho";
          carro2.ano = 2018;
  
          // Usando um método
          carro1.buzinar();
          carro2.buzinar();
      }
  }
```
### Classe 
Define as características (atributos) de um objeto e as ações (métodos) que um objeto poderá
realizar. 

Exemplo: A classe Carro define que todo os carros terão uma marca, cor, ano e poderão buzinar.
```java
  public class Carro {
      // Atributos (características)
      String marca;
      String cor;
      int ano;
  
      // Método (ação)
      void buzinar() {
          System.out.println("Biiiii!");
      }
  }
```


