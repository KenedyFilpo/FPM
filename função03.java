        package exer;

import java.util.Scanner;

public class fun��o03 {

	    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
		
		double a,b,c,d;//cada letra uma nota
		
		System.out.println("Digite suas 4 notas:");
		
		a=leitor.nextDouble();
		b=leitor.nextDouble();
		c=leitor.nextDouble();
		d=leitor.nextDouble();
		
		if((a+b+c+d)/4 >=7) {
			
			System.out.println("Voc� teve a m�dia de "+(a+b+c+d)/4+" voc� foi APROVADO!");
		}
		
		else {
			System.out.println("voc� tem a m�dia de "+(a+b+c+d)/4+" voc� foi REPROVADO!");	

	}
	    }
}
