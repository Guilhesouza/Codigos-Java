import java.util.Scanner;

public class QuestaoSete {

	public static void main(String[] args) {
		
		String[] pergunta = {"Telefonou para a v�tima? ",
				"Esteve no local do crime? ",
				"Mora perto da v�tima? ",
				"Devia oara a v�tima? ",
				"J� trabalhou com a v�tima? "};
		
		String resposta = "";
		int quantidadeSim = 0;
		
		System.out.println("Responda Sim ou N�o para as perguntas abaixo: ");
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < pergunta.length; i++) {
			System.out.print(pergunta[i]);
			resposta = teclado.nextLine();
			if(resposta.equals("Sim")) {
				quantidadeSim += 1;
			}
		}
		
		if(quantidadeSim == 2) {
			System.out.println("A pessoa � Suspeita!!!");
		}else if(quantidadeSim ==3 || quantidadeSim ==4) {
			System.out.println("A pessoa � C�mplice!!!");
		}else if(quantidadeSim ==5) {
			System.out.println("A pessoa � Assassina!!!");
		}else {
			System.out.println("A pessoa � Inocente!!!");
		}

		teclado.close();
	}
}
