import model.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        conta.add(conta);
    }

    public Conta autenticar(String titular, String senha) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(titular) && conta.getSenha().equals(senha)) {
                return conta;
            }
        }
        return null;
    }
}
