package PadroesDeProjeto.Comportamental.Oberver.AgenciaDeNoticias;

// essa interface vai ser implementada pela agencia de noticias

public interface Subject {
    public void adicionar(Observer o);
    public void remover(Observer o);
    public void notificar(String noticia);
}
