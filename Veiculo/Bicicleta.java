package Veiculo;

public class Bicicleta extends Veiculo {

    public Bicicleta(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    void mover(){
        System.out.println("Pedalando");
    }
}
