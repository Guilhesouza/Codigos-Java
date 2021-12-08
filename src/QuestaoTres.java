import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {
		
		float salarioBruto, impostoRenda5, impostoRenda10, impostoRenda20, fgts, valorHora, horaTrabalhadaMes, salarioLiquido, inss, descontos;
		float porcentoImpostoRenda5 = 0.05f, porcentoImpostoRenda10 = 0.10f, porcentoImpostoRenda20 = 0.20f, porcentoFgts = 0.11f, porcentoInss = 0.10f;
	
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual o valor da sua hora? R$ ");
		valorHora = teclado.nextFloat();
		System.out.print("Quantas horas voc� trabalha no m�s? ");
		horaTrabalhadaMes = teclado.nextFloat();
		
		salarioBruto = valorHora * horaTrabalhadaMes;
		impostoRenda5 = salarioBruto * porcentoImpostoRenda5;
		impostoRenda10 = salarioBruto * porcentoImpostoRenda10;
		impostoRenda20 = salarioBruto * porcentoImpostoRenda20;
		inss = salarioBruto * porcentoInss;
		fgts = salarioBruto * porcentoFgts;
		descontos = impostoRenda5 + inss;
		salarioLiquido = salarioBruto - descontos;
	
		
		if(salarioBruto <=900) {
			System.out.println("Voc� n�o ter� desconto no IR, ele � isento!!!");
		}else if(salarioBruto <=1500) {
			System.out.println("Seu desconto no IR � de: R$ " + impostoRenda5);
		}else if(salarioBruto <=2500) {
			System.out.println("Seu desconto no IR � de: R$ " + impostoRenda10);
		}else{
			System.out.println("Seu desconto no IR � de: R$ " + impostoRenda20);
		}
		
		System.out.println("Seu sal�rio bruto �: R$ " + salarioBruto);
		System.out.println("Seu desconto no IR (5%) � de: R$ " + impostoRenda5);
		System.out.println("Seu desconto no INSS (10%) � de: R$ " + inss);
		System.out.println("O seu FGTS (11%) � pago pela empresa no valor de: R$ " + fgts);
		System.out.println("O seu total de descontos � de: R$ " + descontos);
		System.out.println("O seu sal�rio l�quido � de: R$ " + salarioLiquido);
		
		teclado.close();
		
	}

}
