package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cliente adson = new Cliente();
        adson.setNome("Adson");
        Conta cc = new ContaCorrente(adson);
        Conta poupanca = new ContaPoupanca(adson);
        cc.depositar(500.0D);
        cc.transferir(500.0D, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
