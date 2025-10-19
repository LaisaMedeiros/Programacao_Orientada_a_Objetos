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

## Principal
- Ela é o ponto de entrada obrigatório para a execução de qualquer aplicação Java autônoma (standalone). Quando você executa um programa Java, a Máquina Virtual Java (JVM) procura especificamente por um método com essa assinatura para começar a rodar o código.
- Aqui está o que cada parte significa:
   - public: É um modificador de acesso. Garante que o método main possa ser acessado pela JVM (que está fora da sua classe) para iniciar a execução do programa.
    - static: Indica que o método pertence à classe em si, e não a uma instância (objeto) da classe. Isso é crucial porque a JVM precisa chamar o método main para iniciar o programa antes que qualquer objeto da sua classe seja criado.
   - void: É o tipo de retorno. Significa que o método main não retorna nenhum valor para quem o chamou (a JVM, neste caso). O trabalho dele é iniciar a execução do programa, e não produzir um resultado que precise ser devolvido.
   - main: É o nome do método. Este nome é um identificador universalmente reconhecido que a JVM é programada para procurar como o ponto de partida.
   - (String[] args): É o parâmetro do método. É um array de strings que permite que o programa receba argumentos da linha de comando. Isso significa que você pode passar informações externas para o seu programa no momento em que ele é executado.


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

## Uso do this
- É uma referência ao objeto atual da classe.
- Diferenciar atributos da classe de parâmetros do método.
- Passar o objeto atual como argumento.
- Chamar outro construtor dentro da mesma classe.
Ex:
```java
class Pessoa {
    String nome;
    int idade;

    // Construtor
    Pessoa(String nome, int idade) {
        this.nome = nome; // "this.nome" é o atributo, "nome" é o parâmetro
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Olá, eu sou " + this.nome + " e tenho " + this.idade + " anos.");
    }
}

```
## Super
- é uma referência à classe pai (superclasse).
- Pra que serve:
   - Acessar métodos ou atributos da classe pai.
   - Chamar o construtor da superclasse.
Ex:
```java
// Classe pai (superclasse)
class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

// Classe filha (subclasse)
class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        // Chamando o método da classe pai
        super.fazerSom();
        System.out.println("O cachorro late.");
    }
}

// Classe de teste
public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.fazerSom();
    }
}
```
- Se a classe filha não chama o construtor da classe pai, o java cria essa chmada internamente;
- Chamar o construtor se torna obrugatóro quandoa classe pai tem um construtor sem argumentos ou não  tem construtor ou é necessario inicializar a classe pai com valores específicos que vem da classe filha; 
Ex:
```java
class Animal {
    String nome;

    public Animal(String nome) { // Construtor com argumento
        this.nome = nome;
        System.out.println("Construtor de Animal chamado para: " + this.nome);
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        // A chamada a 'super(nome)' é obrigatória
        // para passar o nome para o construtor da classe pai.
        super(nome);
        System.out.println("Construtor de Cachorro chamado!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex");
    }
}
```
## Uso do final
- É uma palavra-chave que pode ser usada em variáveis, métodos ou classes.
- Pra que serve:
   - Variável final: o valor não pode ser alterado.
   - Método final: não pode ser sobrescrito por subclasses.
   - Classe final: não pode ser herdada.
Ex:
```java
final class ContaBancaria {
    final double taxa = 0.1; // constante

    final void mostrarTaxa() {
        System.out.println("Taxa da conta: " + taxa);
    }
}

// Erro: não pode herdar de uma classe final
// class ContaCorrente extends ContaBancaria {}

```
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
- -: privado -> atributo que somente a classe atual tem acesso. Só é possível acessar pelo getter e não diretamente. Para mudança é com setter; 
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
- Exemplo:
  ```java
  c1.setModelo("BIC"); 
  c1.modelo = "BIC"; //acesso direto
  ```java

### Construtores (Construct)
- É chamado automaticamente quando você cria um objeto.
- Ele tem o mesmo nome da classe.
- Não tem tipo de retorno (nem void).
- Serve para configurar o estado inicial do objeto.
- Usado para garantir que todo objeto criado já tenha um estado inicial válido.
- Pode receber parametros;
- Exemplo: é possivel definir o valor do atributo dentro construtor na classe:
   ```java
   public Caneta(){
      this.cor = "Azul";
   }
   ```java

### Override
- É uma anotação em Java que você coloca antes de um método para indicar que você está reescrevendo (sobrescrevendo) um método que já existe na superclasse (classe mãe, ancestral).

## Herança
- Herança é quando uma classe "filha" reaproveita código da classe "pai";
- No construtor da classe filha, precisa chamar o construtor da classe pai usando super(...).

## Encapsulamento
- Encapsulamento é controlar o acesso aos atributos e métodos;
- Significa esconder a implementação interna de um objeto e controlar o acesso aos seus dados;
- O objetivo principal do encapsulamento é proteger os dados de um objeto contra acesso indevido e modificações inconsistentes. Em vez de deixar os dados (atributos) de uma classe publicamente acessíveis para qualquer parte do código modificar, nós:
     - Tornamos os atributos private (ou protected).
     - Fornecemos métodos public para controlar como esses atributos são acessados e modificados.
     - Esses métodos são conhecidos como Getters e Setters.
     - Getter (get): Um método público que permite ler o valor de um atributo privado.
     - Setter (set): Um método público que permite alterar o valor de um atributo privado, geralmente incluindo regras de validação para garantir que o novo valor é válido.

### Interface
- Uma interface é um contrato que uma classe escolhe "assinar". Ela define o que uma classe deve fazer (os métodos que deve ter), mas não define como fazer (a implementação desses métodos).
- O encapsulamento esconde os detalhes internos de uma classe específica. A interface leva isso para outro nível: ela esconde os detalhes de todas as classes que implementam aquele comportamento.
- O código que usa uma interface só se preocupa com o contrato ("o que pode ser feito"), não com a implementação específica ("como é feito"). Isso fortalece enormemente o encapsulamento, pois você pode trocar a implementação real sem que o código que a usa perceba qualquer diferença.

  ## Extends
  - É usada para estabelecer uma relação de herança entre classes, permitindo que uma classe (a subclasse) herde os atributos e métodos de outra classe (a superclasse)
- Não tem atributos só métodos.

## Exceções:
- Quando se cria programas de computador em Java, há possibilidade de ocorrer erros imprevistos durante sua execução, esses erros são conhecidos como exceções e podem ser provenientes de erros de lógica ou acesso a dispositivos ou arquivos externos.
- Alguns possíveis motivos externos para ocorrer uma exceção são:
   - Tentar abrir um arquivo que não existe.
   - Tentar fazer consulta a um banco de dados que não está disponível.
   - Tentar escrever algo em um arquivo sobre o qual não se tem permissão de escrita.
   - Tentar conectar em servidor inexistente.
- Alguns possíveis erros de lógica para ocorrer uma exceção são:
   - Tentar manipular um objeto que está com o valor nulo.
   - Dividir um número por zero.
   - Tentar manipular um tipo de dado como se fosse outro.
   - Tentar utilizar um método ou classe não existentes

  ### Tratamento de exceções:
  ```java
  try
   {
     //Neste bloco são introduzidas todas as linhas de código que podem vir a lançar uma exceção.
   }
   catch(tipo_exceçao_1 e)
   {
     //Neste bloco é descrita a ação que ocorrerá quando a exceção for capturada.
   }
   catch(tipo_exceçao_2 e)
   {
     //ação a ser tomada
   }
   catch(tipo_exceçao_n e)
   {
     //ação a ser tomada
   }
  ```

### Hierarquia em Exceções
- Throwable: classe base da hierarquia java.lang.Throwable. Possui duas sublasses diretas: Erro e Exceções;
- Erro: Indica problemas sérios e anormais que geralmente não devem ser tratados pela aplicação. Eles são, na maioria das vezes, irrecuperáveis e resultam de falhas no sistema Java Virtual Machine (JVM) ou problemas de ambiente. java.lang.Error. Exemplos:
   - StackOverflowError: Ocorre quando o stack de chamadas de métodos está cheio, geralmente por uma recursão infinita.
   - OutOfMemoryError: Indica que a JVM esgotou a memória do heap e não pode alocar mais objetos.
   - VirtualMachineError: Indica que a JVM está quebrada ou esgotou os recursos necessários para continuar.
- Exceções: Indica condições excepcionais que o programa pode querer e deve capturar e tratar para permitir que o processamento continue. java.lang.Exception. As exceções são divididas em dois tipos principais:
   - Exceções Verificadas (Checked Exceptions);
   - Exceções Não Verificadas (Unchecked Exceptions).
- Unchecked Exceptions: Indicam erros que geralmente são resultado de falhas de lógica de programação ou uso indevido de uma API, e não de falhas externas ou de ambiente. Não precisam ser declaradas na assinatura do método com throws. Exemplo:
     - NullPointerException;
     - ArrayIndexOutBoubdsException;
     - ArithmeticException;
     - IllegalArgumentException;
- Checked Exceptions: não é RuntimeExcpetion ou Error. Indicam situações excepcionais externas que um aplicativo pode prever e se recuperar, como problemas de I/O (Entrada/Saída), problemas de rede ou acesso a arquivos. É obrigatório tratar. Isso significa que um método que possa lançar uma Checked Exception deve, ou capturá-la (try-catch), ou declará-la assinatura do método com throws.
   - IOException: Sinaliza que ocorreu algum tipo de exceção de I/O (leitura/escrita de arquivo, comunicação de rede).
   - FileNotFoundException;
   - SQLException;
   - ClassNotFoundException.
#### Qual a diferença entre RuntmeException e as outras sublasses?
#### Throws
- Usada na assinatura de um método para declarar se ele pode lançar uma ou mais exceções. É obrigatório em checked excpetions. Serve como um aviso para quem chama o método, informando que ele deve tratar a exceção usando um bloco try-catch ou, de forma análoga, propagar a exceção para outro método.
   - Como usar? throws é colocado após a lista de parâmetros do método, seguida pelos tipos de exceção que ele pode lançar.
   - Como funciona? Se um método não traat a exceção com try-catch, deve declarar com throws a responsabilidade passa para o método que o chamou;
   - Exceções verificadas (como IOException, FileNotFoundException) devem ser declaradas com throws ou tratadas com try-catch. O compilador força essa verificação.
#### Throw
- Usado dentro de um método para lançar explicitamente uma instância de ;
- O fluxo normal de execução do programa é interrompido e vai para o bloco try-catch mais próximo;
- O objeto lançado deve ser instância da classe Throwable ou uma de suas subclasses (Exception ou Runtime);
- Tabela sobre a superclasse de uma exceção personalizada:

| Se sua exceção estende... | Ela é classificada como... | Obrigatório Tratar (pelo compilador)? | Situações Comuns |
|---------------------------|----------------------------|--------------------------------------|-----------------|
| Exception | Checked (Verificada) | SIM. Quem chama o método deve usar try-catch ou declarar throws. | Problemas externos e recuperáveis: IOException, SQLException, etc. |
| RuntimeException | Unchecked (Não Verificada) | NÃO. O compilador não te obriga a tratar. | Erros de programação/lógica: NullPointerException, ArithmeticException, IllegalArgumentException, etc. |

- Use extends Exception (Checked): Se a falha é um problema externo ou uma condição de negócio recuperável (ex: Arquivo não encontrado, falha de conexão). Você quer forçar o programador a tratar a situação.
- Use extends RuntimeException (Unchecked): Se a falha é um erro de programação ou falha de lógica (ex: Argumento nulo/inválido, índice fora do limite). A intenção é que esses erros não sejam tratados, mas sim corrigidos no código-fonte.

#### Throw vs Throws

| Característica | throw | throws |
|----------------|-------|--------|
| O que faz? | Executa o lançamento de um objeto de exceção (pausa o fluxo do programa). | Declara/Informa que um método pode lançar uma ou mais exceções (faz parte da assinatura do método). |
| Uso em Código | Usado dentro do corpo de um método (como uma instrução). | Usado na assinatura do método (antes da chave {). |
| Sintaxe | É seguido por uma instância de Throwable.<br>`throw new NomeDaExcecao("Mensagem");` | É seguido pelo nome da classe da exceção.<br>`public void metodo() throws NomeDaExcecao { ... }` |
| Propósito | Criar e lançar um evento de exceção em um ponto específico. | Satisfazer o compilador para exceções Checked ou documentar a API do método. |
| Exemplo | `if (idade < 0) { throw new IllegalArgumentException(); }` | `public void lerArquivo() throws IOException { ... }` |

#### Importante sobre throw e throws:
- Se usar throws na assinatura do método n usa try-ctah dentro dele pq a exceção vai ser propagada para quem o chamou;
- 
