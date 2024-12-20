package Animal;

public class Leao extends Felino{
    public void rugir() {
        System.out.println("Animal.Animal rugindo.");
    }

    @Override
    public void caçar() {
        System.out.println("Leão caça na savana de forma feroz.");

    }
}
