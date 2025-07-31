//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import model.Conta;
import view.Menu;

import java.util.List;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Menu menu = new Menu();
        List<Conta> contas = List.of(
            new Conta("12345", "Alice", 1000.0, "senha123"),
            new Conta("67890", "Bob", 500.0, "senha456")
        );
        menu.menu(contas);
    }
}