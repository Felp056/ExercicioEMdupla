/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.exercicio9;

/**
 *
 * @author felip
 */
public class Programador extends Funcionario {
    
     public void geraFuncionario(String _Nome, int _Idade, int _Matricula, String _Linguagem){
     String nome = _Nome;
     int idade = _Idade;
     int matricula = _Matricula;
     String linguagem = _Linguagem;
     System.out.println(nome+" "+idade+" "+matricula+ " "+linguagem);
 }
}
