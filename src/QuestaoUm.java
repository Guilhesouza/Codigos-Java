import java.util.Scanner;

public class QuestaoUm {
	
	public static void main(String[] args) {
		
		float ganhaHora, salarioBruto, inss, salarioLiquido, impostoRenda, sindicato;
		int horaTrabalhadaMes;
		float porcentagemImpostoRenda = 0.11f, porcentagemInss = 0.08f, porcentagemSindicato = 0.05f ;
		float descontos;
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.print("Quanto voc� ganha por hora? R$ ");
		ganhaHora = teclado.nextFloat();
		System.out.print("Quantas horas voc� trabalha ao m�s? ");
		horaTrabalhadaMes = teclado.nextInt();
	
		salarioBruto = ganhaHora * horaTrabalhadaMes;
		inss = salarioBruto * porcentagemInss;
		sindicato = salarioBruto * porcentagemSindicato;
		impostoRenda = salarioBruto * porcentagemImpostoRenda; 
		descontos = inss + sindicato + impostoRenda;
		salarioLiquido = salarioBruto - descontos;
				
		System.out.println("Seu sal�rio Bruto �: R$ " + salarioBruto);
		System.out.println("Seu desconto do IR �: R$ " + impostoRenda);
		System.out.println("Seu desconto do INSS �: R$ " + inss);
		System.out.println("Seu desconto do Sindicato �: R$ " + sindicato);
		System.out.println("Seu sal�rio Liquido �: R$ " + salarioLiquido);
		
		teclado.close();
		
	}

}
