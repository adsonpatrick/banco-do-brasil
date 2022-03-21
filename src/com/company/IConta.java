package com.company;

public interface IConta {
    void sacar(double var1);

    void depositar(double var1);

    void transferir(double var1, IConta var3);

    void imprimirExtrato();
}