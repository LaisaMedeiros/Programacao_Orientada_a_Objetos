## Singleton
- Objetivo: garantir que uma classe possua apenas uma instância e fornecer um ponto global de acesso a ela.

#### Características
| Característica          | Descrição                                                            |
| ----------------------- | -------------------------------------------------------------------- |
| **Instância única**     | Garante que apenas um objeto da classe exista.                       |
| **Construtor privado**  | Impede que outros objetos criem instâncias diretamente.              |
| **Acesso controlado**   | Oferece um método público que retorna a instância única.             |
| **Criação sob demanda** | A instância é criada apenas quando necessária (lazy initialization). |

### Lazy Singleton
- A criação do objeto é adiada até o primeiro uso. Isso economiza recursos quando a classe pode nunca ser usada durante a execução do programa.
- **Vantagens:** economiza memória;

### Eager: 
- A instância é criada no momento em que a classe é carregada na memória, mesmo que nunca seja usada.
- **Desvantagem:** Pode desperdiçar memória se a instância nunca for usada.



## Estrutural

### Decorator
- **Exige que todas as partes compartilhem uma interface ou classe abstrata comum.**
- Estender o comportamento de um objeto em tempo de execução, e não em tempo de compilação (usando herança).
- Evitar a explosão de subclasses que ocorreria se você tentasse combinar todas as funcionalidades possíveis
- Elementos:
    1. Componente (Component): Interface ou classe abstrata que define as operações comuns que podem ser decoradas.
    → Exemplo: public interface Cafe { double getCusto(); String getDescricao(); }

    2. Componente Concreto (Concrete Component): Implementa o comportamento básico.
    → Exemplo: public class Forte extends Bebida { ... }

    3. Decorador (Decorator): Classe abstrata que implementa a mesma interface e possui uma referência para um objeto do tipo Component.
    → Exemplo: public abstract class CafeDecorator implements Cafe { protected Cafe cafe; ... }

    4. Decoradores Concretos (Concrete Decorators): Adicionam novas funcionalidades ao objeto que estão decorando.
    → Exemplo: public class Leite extends CafeDecorator { ... }, public class Chantilly extends CafeDecorator { ... }
 

 | **Característica de Código**                                       | **Descrição / Função**                                                                                                   | **Exemplo**                                                    |
| ------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------- |
| `extends` ou `implements` o **Componente**                         | A classe `Decorator` implementa a **mesma interface** ou **herda da mesma classe abstrata** que o componente que decora. | `public abstract class CafeDecorator implements Cafe`          |
| Possui um **atributo protegido (`protected`)** do tipo `Component` | Guarda a referência para o objeto que será decorado (permite o acesso em subclasses).                                    | `protected Cafe cafe;`                                         |
| Construtor recebe um **objeto do tipo Component**                  | O decorador “embrulha” o componente passado como parâmetro.                                                              | `public CafeDecorator(Cafe cafe) { this.cafe = cafe; }`        |
| **Delegação** de métodos                                           | Chama os mesmos métodos do componente interno, repassando as chamadas.                                                   | `public double getCusto() { return cafe.getCusto(); }`         |
| **Classe abstrata**                                                | Geralmente é abstrata, pois não adiciona comportamento diretamente — serve de base para os decoradores concretos.        | `public abstract class CafeDecorator implements Cafe`          |
| **Sobrescreve métodos da interface**                               | Redefine métodos do componente para permitir extensão por subclasses concretas.                                          | `public String getDescricao() { return cafe.getDescricao(); }` |
| Pode usar **super** para aproveitar comportamentos herdados        | Decoradores concretos usam `super` para chamar métodos da classe `Decorator` e adicionar lógica extra.                   | `return super.getDescricao() + ", leite";`                     |
| **Mantém compatibilidade polimórfica**                             | Como implementa a mesma interface, o decorador pode ser usado onde um `Component` é esperado.                            | `Cafe meuCafe = new Leite(new CafeSimples());`                 |
