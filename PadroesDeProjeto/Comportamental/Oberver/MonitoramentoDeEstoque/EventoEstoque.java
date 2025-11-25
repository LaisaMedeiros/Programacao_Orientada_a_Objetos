package PadroesDeProjeto.Comportamental.Oberver.MonitoramentoDeEstoque;

public class EventoEstoque {
    private String item;
    private int quantidade;
    String tipoEvento;

    public EventoEstoque(String item, int quantidade, String tipoEvento) {
        this.item = item;
        this.quantidade = quantidade;
        this.tipoEvento = tipoEvento;
    }

}
