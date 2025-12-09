package Provas.P3_251.Q2;

import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // --- Getters e Setters ---

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    public int getEstoque() {
        return estoque;
    }
    
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}