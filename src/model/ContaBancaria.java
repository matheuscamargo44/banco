package model;

public class ContaBancaria {
        private String numero;
        private String titular;
        private double saldo;

        public ContaBancaria(String numero, String titular) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = 0;
        }

        public void depositar(double valor) {
            if (valor > 0) saldo += valor;
        }

        public boolean sacar(double valor) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                return true;
            }
            return false;
        }

        public double getSaldo() {
            return saldo;
        }

        public String getNumero() {
            return numero;
        }

        public String getTitular() {
            return titular;
        }
    }

