package PadroesDeProjeto.Comportamental.Oberver.MonitoramentoDeEstoque;

public interface Subject {
    public void adicionar(Observer o);
    public void remover(Observer o);
    public void notificar(EventoEstoque evento);
}
