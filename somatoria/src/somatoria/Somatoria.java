/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somatoria;

import java.util.Scanner;

/**
 *
 * @author Lenovo-Notebook
 */
public class Somatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int n, s = 0;
        String resp;
        
        do{
            System.out.println("Digite um número: ");
            n = ler.nextInt();
            s = s + n;
            System.out.println("Quer continuar? [N / S]");
            resp = ler.next();
            
        } while (resp.equals("S"));
        System.out.println("A soma é: "+ s);
    }
    
}
