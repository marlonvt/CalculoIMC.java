package br.edu.uricer.calculoimc;


import java.util.Scanner;


public class CalculoIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
    
        System.out.println("Informeu seu sexo(M ou F): ");
        String sexoL = entrada.nextLine();
        String sexo = sexoL.toUpperCase();
        
        System.out.print("Informe seu peso: ");
        double peso = Double.parseDouble(entrada.nextLine());
        System.out.print("Informe sua altura: ");
        double altura = Double.parseDouble(entrada.nextLine()); 
    
        
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        
        if(sexo.equals("F")){
            if((imc >= 19.1) && (imc <= 25.8)){
                System.out.println("Peso ideal!");
            }else if (imc < 19.1){
                System.out.println("Abaixo do peso!");
            }else if (imc > 25.8){
                System.out.println("Acima do peso!");
            }
        }else{
           if((imc >= 20.7) && (imc <= 26.4)){
                System.out.println("Peso ideal!");
            }else if (imc < 20.7){
                System.out.println("Abaixo do peso!");
            }else if (imc > 26.4){
                System.out.println("Acima do peso!");
            } 
        }
            
        
        
    }
    
}
