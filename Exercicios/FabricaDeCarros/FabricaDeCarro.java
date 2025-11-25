package Exercicios.FabricaDeCarros;

public class FabricaDeCarro {
    
    public static Carro criarCarro(String modelo, 
                                  double tamanhoTanque, 
                                  double tamanhoPortaMalas) 
                                  throws ConfiguracaoInvalidaException {
        
        // VALIDAÇÃO 1: Somatório = 400L
        if (tamanhoTanque + tamanhoPortaMalas != 400) {
            throw new ConfiguracaoInvalidaException(
                "Somatório tanque + porta-malas deve ser 400L");
        }
        
        // VALIDAÇÃO 2: Porta-malas ≥ 2 × Tanque  
        if (tamanhoPortaMalas < 2 * tamanhoTanque) {
            throw new ConfiguracaoInvalidaException(
                "Porta-malas deve ser pelo menos o dobro do tanque");
        }
        
        // Se passou nas validações, cria o carro
        return new Carro(modelo, tamanhoTanque, tamanhoPortaMalas);
    }
}