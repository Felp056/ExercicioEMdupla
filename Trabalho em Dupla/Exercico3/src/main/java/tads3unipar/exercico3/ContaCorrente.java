/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.exercico3;

/**
 *
 * @author felip
 */
public class ContaCorrente extends ContaBancaria{

   
    public void pagar(double pagar, double ValLim) {
        double Limite = ValLim;
        double saldo;
        if(pagar < ValLim){
            saldo = ValLim - pagar;
             System.out.println("saldo = "+saldo);
        }else if((ValLim + 1000.00) > Limite){
            saldo = ValLim -  pagar;
             System.out.println("saldo = "+saldo);
        }else{
            System.out.println("Valor exede o cheque especial");
        }
    }
    
}
