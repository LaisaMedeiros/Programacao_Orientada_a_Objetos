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

// No Padrão Observer, a AgenciaDeNoticia (o Subject) não pode saber quais 
// tipos de objetos específicos estão interessados em suas notícias. Ela 
// não deve se importar se é um Jornal, uma TV, um Radio, ou um Celular.

// Ao declarar os observadores como Observer (a interface), você garante
//  que a AgenciaDeNoticia interage com eles apenas através dos métodos 
// definidos nessa interface (provavelmente o método atualizar() ou similar).