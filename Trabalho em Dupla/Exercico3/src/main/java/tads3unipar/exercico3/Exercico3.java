/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.exercico3;

/**
 *
 * @author felip
 */
public class Exercico3 {

    public static void main(String[] args) {
       ContaBancaria cc = new ContaBancaria();
       cc.pagar(15, 30, 20);
       ContaCorrente gg = new ContaCorrente();
       gg.pagar(1500, 500);
    }
}
