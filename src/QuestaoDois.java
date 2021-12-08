import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		
		double areaPintada, coberturaTinta, valorApenasLata, valorApenasGalao, quantidadeComprarApenasLata, quantidadeComprarApenasGalao;
		double quantidadeLataTinta = 18.0f, quantidadeGalaoTinta = 3.6f;
		double valorLataTinta = 80.00f, valorGalaoTinta = 25.00f;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual o tamanho da area a ser pintada em M�? ");
		areaPintada = teclado.nextFloat();
		
		coberturaTinta = (areaPintada / 6) * 1.1;
		quantidadeComprarApenasLata = Math.ceil(coberturaTinta / quantidadeLataTinta);
		valorApenasLata =  Math.ceil(quantidadeComprarApenasLata * valorLataTinta);
		quantidadeComprarApenasGalao = Math.ceil(coberturaTinta / quantidadeGalaoTinta);
		valorApenasGalao = Math.ceil(quantidadeComprarApenasGalao * valorGalaoTinta);
		
		double menorQuantidadeMisturaLata = Math.floor(coberturaTinta / quantidadeLataTinta);
		double restanteLitrosLata = coberturaTinta - (quantidadeLataTinta * menorQuantidadeMisturaLata);
		double menorQuantidadeMisturaGalao = Math.ceil(restanteLitrosLata / quantidadeGalaoTinta);
		double valorTotalMistura = (menorQuantidadeMisturaLata * valorLataTinta) + (menorQuantidadeMisturaGalao * valorGalaoTinta);
		
		System.out.println("Caso queira comprar apenas lata de 18L, voc� ir� gastar " + quantidadeComprarApenasLata + " lata" 
				+ " e pagar R$ " + valorApenasLata );
		System.out.println("Caso queira comprar apenas gal�o de 3.6L, voc� ir� gastar " + quantidadeComprarApenasGalao + " gal�o" 
				+ " e pagar R$ " + valorApenasGalao );
		System.out.println("Caso queira misturar a compra de gal�o e lata, voc� ir� gastar: "
				+ menorQuantidadeMisturaLata + " lata de 18L " + "e " + menorQuantidadeMisturaGalao + " gal�o de 3.6L"
				+ " pagando R$ " + valorTotalMistura);
		
		teclado.close();
	}

}