package model;

public class Conta {
    private String numero;
    private String titular;
    private double saldo;
    private String senha;

    public Conta(String numero, String titular, double saldo, String senha){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.senha = senha;
    }

    public boolean sacar(double valor){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero(){
        return numero;
    }
    public String getSenha(){
        return senha;
    }

}
