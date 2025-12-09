package Provas.P2_251.Questao2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import Exercicios.FabricaDeCarros.Opcional;

public class Carro {
    private String modelo;
    private Set<Opcional> opcionais;
    private double tamTanque;
    private double tamPortaMalas;
    private double volumePermitido;

    public Carro(String modelo, double tamPortaMalas, double tamTanque){
        this.modelo = modelo;
        opcionais = new HashSet<>();
        if ((tamPortaMalas + tamTanque == 400) && (tamPortaMalas >= 2* tamTanque)){
            this.tamPortaMalas = tamPortaMalas;
            this.tamTanque = tamTanque;
        }
        else{
            throw new RuntimeException("A soma do tamanho do Tanque e do Porta Malas deve ser 400 Litros.");
        }
    }

    public void addOpcional(Opcional op) {
        try {
            if (op.getVolumeOcupado > volumePermitido){
                throw new UltrapassouVolumePermitido("Esse opcional não pode ser incluído para a configuração atual!");
            }
            opcionais.add(op);
        } catch (UltrapassouVolumePermitido e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(!(obj instanceof Carro)){
            return false;
        }
        Carro c = (Carro) obj;
        return c.getModelo().equals(this.modelo) && c.getOpcionais().equals(this.opcionais);

    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, opcionais);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Set<Opcional> getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(Set<Opcional> opcionais) {
        this.opcionais = opcionais;
    }

    public double getTamTanque() {
        return tamTanque;
    }

    public void setTamTanque(double tamTanque) {
        if ((tamPortaMalas + tamTanque == 400) && (tamPortaMalas >= 2* tamTanque)){
            this.tamTanque = tamTanque;
        }
    }

    public double getTamPortaMalas() {
        return tamPortaMalas;
    }

    public void setTamPortaMalas(double tamPortaMalas) {
       if ((tamPortaMalas + tamTanque == 400) && (tamPortaMalas >= 2* tamTanque)){
            this.tamPortaMalas = tamPortaMalas;
        }
    }

    
}
