package PadroesDeProjeto.Comportamental.Oberver.AgenciaDeNoticias;

public class Main {
    public static void main (String args[]){
        // cria uma instancia do subject (observado)
        AgenciaDeNoticia agencia = new AgenciaDeNoticia();

        //Cria as instancias dos objetos observadores
        Observer jornal = new Jornal();
        Observer tv = new TV();

        //Adiciona os observadores na lista de objetos observadores da agencia
        agencia.adicionar(jornal);
        agencia.adicionar(tv);

        //evento acontecendo
        agencia.publicarNoticia("Laísa tem prova de POO amanhã!:D");

    }
}
