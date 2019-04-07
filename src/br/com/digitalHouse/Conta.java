package br.com.digitalHouse;

public class Conta {

    private Integer numeroDaConta;
    private Float saldo;
    private String titular;

    public Conta(Integer numeroDaConta, Float saldo, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


}
