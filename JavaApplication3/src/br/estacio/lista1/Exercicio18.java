/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.lista1;
import java.util.Scanner;

/**
 *
 * @author alunoadm
 */
public class Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner leitorDeDados = new Scanner (System.in);
        n = leitorDeDados.nextInt();
        
        for (int linha=0; linha<n; linha++){
            for (int coluna=0; coluna<n; coluna++){
                System.out.println(""+linha+coluna+" ");
            }
            System.out.println("");
        }
    }
    
}
