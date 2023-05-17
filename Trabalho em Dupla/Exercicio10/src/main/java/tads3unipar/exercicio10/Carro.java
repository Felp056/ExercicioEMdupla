/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.exercicio10;

/**
 *
 * @author felip
 */
public class Carro extends Veiculo{
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void exibeVeiculo() {
       System.out.println(getMarca()+" "+ getAno()+" "+cor);
    }
    
}
