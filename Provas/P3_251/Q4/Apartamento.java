package Provas.P3_251.Q4;

import java.util.ArrayList;
import java.util.List;

public class Apartamento {
    private ArrayList<Comodo> comodos;

    public Apartamento() {
        this.comodos = new ArrayList<>();
    }

    public void adicionarComodo(Comodo comodo) {
        comodos.add(comodo);
    }

    public List<Comodo> getComodos() {
        return comodos;
    }
}
