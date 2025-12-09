package Provas.P1_251.Questao5_3;

import Exercicios.ReceitaFederal.LojaComercial;
import Exercicios.ReceitaFederal.PessoaFisica;

public class SistemaRF {
    public String comparaContribuintes(Object obj1, Object obj2){
        if (!obj1.getClass().equals(obj2.getClass())) {
            return "Erro: tipos diferentes - ";
        }

         if (obj1 instanceof PessoaFisica) {
            PessoaFisica p1 = (PessoaFisica) obj1;
            PessoaFisica p2 = (PessoaFisica) obj2;
            return comparaPontos(p1.getPontos(), p2.getPontos(), p1.getNome(), p2.getNome());
            
        } else if (obj1 instanceof Fabrica) {
            Fabrica f1 = (Fabrica) obj1;
            Fabrica f2 = (Fabrica) obj2;
            return comparaPontos(f1.getPontos(), f2.getPontos(), f1.getNome(), f2.getNome());
            
        } else if (obj1 instanceof LojaComercial) {
            LojaComercial l1 = (LojaComercial) obj1;
            LojaComercial l2 = (LojaComercial) obj2;
            return comparaPontos(l1.getPontos(), l2.getPontos(), l1.getNome(), l2.getNome());
            
        } else {
            return "Erro: tipo desconhecido";
        }
    }
    
    private String comparaPontos(int p1, int p2, String nome1, String nome2) {
        if (p1 > p2) {
            return nome1 + " tem mais pontos que " + nome2;
        } else if (p2 > p1) {
            return nome2 + " tem mais pontos que " + nome1;
        } else {
            return nome1 + " e " + nome2 + " estão empatados";
        }
    }
        
    
}
