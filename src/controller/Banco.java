package controller;

import model.Conta;


import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta autenticar(String numeroConta, String senhaInformada) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numeroConta) && conta.getSenha().equals(senhaInformada)) {
                return conta;
            }
        }
        return null;
    }
}
