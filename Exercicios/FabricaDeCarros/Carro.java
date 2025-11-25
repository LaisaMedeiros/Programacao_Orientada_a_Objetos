package Exercicios.FabricaDeCarros;

import java.util.Set;

public class Carro{
    private String modelo;
    private Set<Opcional> opcionais;
    private double tamanhoTanque;
    private double tamanhoPortaMalas;
    private double espacoTotalOpcionais; // Limite máximo para opcionais
    private double espacoOcupado; // Espaço atual usado por opcionais
    
    // Construtor, Getters e Setters aqui...

    /**
     * @Override
     * Sobrescreve a lógica de igualdade.
     */
    @Override
    public boolean equals(Object obj) {
        // 1. Verificação básica de memória e classes
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 2. Cast do objeto
        Carro outroCarro = (Carro) obj;

        // 3. Verificação dos requisitos: Modelo e Opcionais

        // Verificação do MODELO
        boolean modeloIgual = this.modelo.equals(outroCarro.modelo);

        // Verificação do CONJUNTO DE OPCIONAIS
        // O método .equals() do Set já compara se os conjuntos têm os mesmos itens.
        boolean opcionaisIguais = this.opcionais.equals(outroCarro.opcionais);

        // A igualdade total é a união dos dois requisitos (AND lógico)
        return modeloIgual && opcionaisIguais;
    }

    public void adicionarOpcional(Opcional opcional) throws ConfiguracaoInvalidaException {
        // Verifica se o opcional cabe no espaço disponível
        if (espacoOcupado + opcional.getEspacoOcupado() > espacoTotalOpcionais) {
            throw new ConfiguracaoInvalidaException(
                "Opcional '" + opcional.getNome() + "' não pode ser incluído. " +
                "Espaço insuficiente. Espaço disponível: " + 
                (espacoTotalOpcionais - espacoOcupado) + "L");
        }
        
        // Se couber, adiciona e atualiza o espaço
        this.opcionais.add(opcional);
        this.espacoOcupado += opcional.getEspacoOcupado();
    }
}
