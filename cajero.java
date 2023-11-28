import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); 
		 
		 
		 
		 System.out.println("Introduzca una cadena: "); 
		 String cadena = scanner.nextLine(); 
		 
		 boolean flag = true; 
		 
		 
		 StringBuilder posicionerrores = new StringBuilder(); 
		 int contadorerrores = 0; 
		 
		 for (int i = 0; i < cadena.length(); i++) { 
			 char letra_digito = cadena.charAt(i); 
			 
			 
			 if (!Character.isUpperCase(letra_digito) && !Character.isDigit(letra_digito)) {
				 flag = false; posicionerrores.append(i); 
				 System.out.println("Letra o digito incorrecto en la posisicon: " + (i + 1)); 
				 contadorerrores++; 
				 } 
			 } 
		    if (flag == false) { 
		    	System.out.println("La cadena es incorrecta :(");  
	    		System.out.println("El total de errores en la cadena es de: " + contadorerrores);
		    	} else { 
		    		System.out.println("La cadena es correcta!!!!"); 
		    } 

	}

}
