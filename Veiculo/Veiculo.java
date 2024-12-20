package Veiculo;

public class Veiculo {
    public String modelo;
    int ano;

    public Veiculo(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    abstract void mover();
}
