/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.exercicio7;

/**
 *
 * @author felip
 */
public class Aluno extends Pessoa {
    public void criaPessoa(String _Nome, int _Idade, int _Matricula) {
        int matricula = _Matricula;
        String nome = _Nome;
        int idade = _Idade;
        System.out.println(nome+" "+idade+" "+matricula);
    }
    
}
