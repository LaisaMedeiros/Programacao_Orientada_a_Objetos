package Exercicios.SistemaTranfusaoDeSangue;

public class Main {
    public static void main(String[] args){
        //Criando pessoas com tipos sanguineos específicos
        Pessoa<TipoA> pessoaA = new Pessoa<>("Alice", new TipoA());
        Pessoa<TipoB> pessoaB = new Pessoa<>("Bruno", new TipoB());
        
        // Realizando transfusões compatíveis
        TransfusaoDeSangue.ehCompativel(pessoaA, pessoaA); // A → A
    }
}
