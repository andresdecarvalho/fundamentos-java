import java.util.Date;
import java.text.DateFormat;

public class PDV {

	public static void main(String[] args) {
		//Date ->trabalhar com Data
		Date data = new Date();
		//formatar a data
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL); 
		System.out.println(formatador.format(data));

	}

}
