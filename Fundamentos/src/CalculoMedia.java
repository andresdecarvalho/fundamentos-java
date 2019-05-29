import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * *Calculo de Media
 * @author andre.scarvalho1
 */
public class CalculoMedia {

	public static void main(String[] args) {
		double nota1, nota2 , media;
		System.out.println("Cálculo da Média");
		//Criando um objeto para a entrada de dados
		Scanner leia = new Scanner(System.in);
		//a linha abaixo configura o separador para ponto
		leia.useLocale(Locale.ENGLISH);
		//criando um objeto para formatar o resultado
		DecimalFormat formatador= new DecimalFormat("#0.0");
		
		System.out.print("Digite a nota1: ");
		nota1 = leia.nextDouble(); 
		System.out.print("Digite a nota2: ");
		nota2 = leia.nextDouble();
		media = (nota1 + nota2) / 2; 
		System.out.println("Média: " +formatador.format(media));
		if (media <5) {
			System.out.print("REPROVADO");
		} else {
			System.out.print("APROVADO");
		}
		
		leia.close();
		

	}

}
