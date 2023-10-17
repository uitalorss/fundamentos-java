package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
