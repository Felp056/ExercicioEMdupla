/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.exercicio1;

/**
 *
 * @author felip
 */
public class Circulo extends FormaGeometrica{
    public void CalcularArea( int AA) {
        int raio = AA;
        double pi = 3.14;
        double area = pi * (raio * raio);
        System.out.println("Area = "+area);
    }
    
}
