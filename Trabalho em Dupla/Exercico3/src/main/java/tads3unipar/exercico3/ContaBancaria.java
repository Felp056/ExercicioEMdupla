/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.exercico3;

/**
 *
 * @author felip
 */
public class ContaBancaria {
    public void pagar(double pagar, double ValLim, double val){
        double ValorLimite = ValLim;
        double Valor = val;
        double saldo;
        if(pagar < Valor){
            saldo = Valor - pagar;
             System.out.println("saldo = "+saldo);
        }else if(pagar > Valor && pagar < ValorLimite){
            saldo = Valor - pagar;
             System.out.println("saldo = "+saldo);
        }else{
            System.out.println("Valor insulficinete na conta");
        }
       
    }
}
