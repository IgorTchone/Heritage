import Animal.Cao;
import Animal.Gato;
import Animal.Leao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao();
        leao.alimentar();
        leao.caçar();

        Gato gato = new Gato();
        gato.alimentar();
        gato.caçar();

        Cao cao = new Cao();
        cao.alimentar();
    }
}