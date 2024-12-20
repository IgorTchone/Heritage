package Veiculo;

public class Carro extends Veiculo implements Motorizado{

    private int nivelCombustivel = 0;

    public Carro(String modelo, int ano) {
        super(modelo, ano);
        nivelCombustivel = 0;
    }

    @Override
    void mover() {
        System.out.println("O carro está se movendo.");
    }

    @Override
    public void ligarMotor() {
        System.out.println("Ligando o motor do carro.");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Desligando o motor do carro.");
    }

    @Override
    public int getNivelCombustivel() {
        return nivelCombustivel;
    }
}
