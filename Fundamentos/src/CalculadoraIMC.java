import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * *Calculo de Media
 * @author andre.scarvalho1
 */
public class CalculadoraIMC {

	public static void main(String[] args) {
		double peso, altura , imc;
		System.out.println("Cálculo da IMC");
		//Criando um objeto para a entrada de dados
		Scanner leia = new Scanner(System.in);
		//a linha abaixo configura o separador para ponto
		//leia.useLocale(Locale.ENGLISH);
		//criando um objeto para formatar o resultado
		DecimalFormat formatador= new DecimalFormat("0.00");
		
		System.out.print("Digite seu peso: ");
		peso = leia.nextDouble(); 
		System.out.print("Digite sua altura: ");
		altura = leia.nextDouble();
		imc = peso/(altura + altura); 
		System.out.println("O IMC é : " +formatador.format(imc));
		//para criar um intervalo usamos o operador AND (&&)	
		if (imc < 18.5) {
			System.out.println("Abaixo do Peso");
		}else if(imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal");
		}else if(imc >= 25 && imc < 30) {
			System.out.println("Acima do Peso");
		}else {
			System.out.println("Obeso");
		}
		
		leia.close();
	    }
	} 