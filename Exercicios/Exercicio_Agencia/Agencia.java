public class Agencia {
    // Atributo que armazena o número da agência
    private int numAgencia;

    // Vetor de contas associadas a essa agência (tamanho fixo de 100)
    private Conta[] contas;

    // Quantidade de contas atualmente cadastradas
    private int qtdaContas;

    // Construtor da classe Agencia
    // Esse método é chamado quando usamos: new Agencia(1);
    public Agencia(int numAgencia) {
        this.numAgencia = numAgencia;           // Atribui o número da agência
        this.contas = new Conta[100];           // Cria um vetor para armazenar até 100 contas
        this.qtdaContas = 0;                    // Começa com zero contas cadastradas
    }

    // Cada vez que um conta é criada é +1 em qtdaContas
    // Método que cria uma nova conta dentro da agência
    //A conta é criada acessando o Construct da classe Conta
    public void criaConta(int num, double saldo) {
        // Cria um novo objeto Conta com número e saldo
        Conta c = new Conta(num, saldo);

        // Adiciona essa conta no vetor 'contas' e incrementa o contador
        this.contas[this.qtdaContas] = c;
        this.qtdaContas++; // ou: this.qtdaContas = this.qtdaContas + 1;
    }

    // Método que busca uma conta com base no número
    // Retorna a conta se encontrar, ou null se não encontrar
    public Conta getConta(int num) {
        // Loop que percorre apenas as contas já cadastradas (até qtdaContas)
        for (int i = 0; i < this.qtdaContas; i++) {
            // Se encontrar uma conta com o número igual ao procurado
            if (this.contas[i].getNum() == num) {
                return this.contas[i]; // retorna essa conta
            }
        }
        // Se nenhuma conta com o número for encontrada, retorna null
        return null;
    }
}

//return this.contas[i] retorna:
//- o número da conta → c.getNum()
//- o saldo atual → c.getSaldo()
//- todos os métodos definidos na classe Conta → c.depositar(...), c.sacar(...), c.toString()...
