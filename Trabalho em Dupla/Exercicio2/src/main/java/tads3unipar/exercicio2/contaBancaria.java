package tads3unipar.exercicio2;

/**
Felipe Talini 00233331
João Vitor Florisvaldo Pereira 00241738
 *
 * @author felip
 */
public class contaBancaria {
    private double saldo;
    private String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void exibir(){
        System.out.println(saldo + " " + titular);
    }
}
