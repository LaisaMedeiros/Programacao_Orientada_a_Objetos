## Objeto
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

## Instância
- É o objeto real criado a partir dessa classe;
- Analogia: Se “classe” é a receita de bolo, “instanciar” é preparar um bolo real a partir dessa receita;
- Instanciar um objeto é reservar um espaço para ele na memória, inicilizar atributos e usar ele através de uma referência como um nome tipo c1 de Caneta;

Exemplo:
- ```Caneta``` → é a classe.
- ```new Caneta()``` → é o ato de instanciar (criar um objeto Caneta na memória).
- ```c1``` → é a variável de referência que aponta para esse objeto.

## Classe 
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
## Método
Um método é um bloco de código dentro de uma classe que executa uma tarefa específica. Ele pode:
- Executar ações (como imprimir algo na tela).
- Receber dados (por meio de parâmetros).
- Retornar um valor (ou não).

É uma função que está dentro de uma classe. Toda função é um médodo. 

Exemplo:
```java
public void dizerOla() {
    System.out.println("Olá, mundo!");
}

```

## Codigo:
- this: o nome do objeto que chamou; referencia ao proprio objeto que chamou;
- Se um atributo não receber valor ele inicia com 0;
- Toda classe começac com letra maiuscula;
- Todo atributo e médtodo começam com letra minuscula. O método se diferencia pq termina com ();
- O nome do arquivo deve ser igual ao nome da classe;
- A função main é um método;
- Para usar floar bote com f no final do numero;
- Literal decimal padrão é double. Ex: 2.0 sem o f, o Java considera como double;
- %.2f → mostra número com 2 casas decimais.
- %% → imprime um símbolo de porcentagem no texto.
- new: é usado somente quando você quer criar um novo objeto (instanciar uma classe) e arrays. Não é usado para chamar métodos que já existe;

## Tipos de print
- ```print()``` → imprime o texto sem pular para a próxima linha.
  Ex:
   ``` java 
        System.out.print("Olá");
        System.out.print(" Mundo"); 
        // Saída: Olá Mundo   (tudo na mesma linha)

        String nome = "Laísa";
      System.out.print("Meu nome é: " + nome);
      // Saída: Meu nome é: Laísa
   ```


- ```println()``` → imprime o texto e pula para a próxima linha automaticamente.
  Ex:
  ``` java
   System.out.println("Olá");
   System.out.println("Mundo");
   // Saída:
   // Olá
   // Mundo

  int idade = 20;
   System.out.println("Idade: " + idade);
   // Saída: Idade: 20
  ```
- ```printf()``` → imprime com formatação, usando placeholders como %s (texto), %d (inteiro), %.2f (número decimal com 2 casas), e não pula linha automaticamente (você coloca \n se quiser).
  Ex:
  ``` java
   System.out.printf("Meu nome é %s e tenho %d anos", "Laísa", 20);
   // Saída: Meu nome é Laísa e tenho 20 anos
   double media = 9.4567;
   System.out.printf("Média: %.2f", media);
   // Saída: Média: 9.46  (duas casas decimais)
  ```

## Visibilidade
- Indica o nível de acesso aos componentes internos de uma classe;
- +: público -> atributo que a classe atual e todas as outras classes podem ter acesso; 
- -: privado -> atributo que somente a classe atual tem acesso;
- #: protegido -> atributo que pode ser acessado pela classe atual e pelas suas sub-classes;
- Posso usar protegido e public na main, mas não private;
- Mesmo que o atributo seja privado, se o médtodo que usa ele dentro da mesma classe for público, então ele pode ser alterado através da chamada de outro arquivo;

## Métodos Especiais
- Você normalmente usa getters e setters quando quer controlar o acesso aos atributos de uma classe, em vez de deixar tudo público, mas ainda precisa ler e/ou alterar esses valores fora da própria classe.
- Quando não usar: Se o atributo é interno e nenhum código externo precisa acessar diretamente → não precisa nem de getter nem de setter; se é um valor fixo;

### Métodos Acessores (Getters)
- É um médtodo que pega alguma informação;
- É um médtodo que acessa um atributo mantendoa segurança de acesso a ele;
- Pede algo ao método, não passa nada como parâmetro;
- Usado quando: Você precisa ler o valor de um atributo fora da classe, mas não quer expor o atributo diretamente como public.
- Se um atributo já é public, não há necessidade técnica de criar getters e setters, porque qualquer código pode acessá-lo e modificá-lo diretamente.

### Métodos Modificadores (Setters)
- Modificam os atributos garantindo a segurança do atributo;
- Passa um parâmetro para o método geralmente;
- Usado quando: Você precisa alterar o valor de um atributo fora da classe, mas quer controlar a forma como ele é alterado.

### Construtores (Construct)
- É chamado automaticamente quando você cria (instancia) um objeto.
- Ele tem o mesmo nome da classe.
- Não tem tipo de retorno (nem void).
- Serve para configurar o estado inicial do objeto.
- Usado para garantir que todo objeto criado já tenha um estado inicial válido.
- Pode receber parametros;

### Override
- É uma anotação em Java que você coloca antes de um método para indicar que você está reescrevendo (sobrescrevendo) um método que já existe na superclasse (classe mãe, ancestral).

## Herança
- Herança é quando uma classe "filha" reaproveita código da classe "pai";
- No construtor da classe filha, precisa chamar o construtor da classe pai usando super(...).

## Encapsulamento
- Encapsulamento é controlar o acesso aos atributos e métodos.





