package condicionantes;

public class CondicionanteIF {
 public static void main(String[] args) {
	
	 int valor=0;
	 
	 
	 if(valor < 0) {
		 //bloque de codigo si se cumple la condicion
		 System.out.println("Valor es Negativo");
	 }
	 else if(valor > 0){
		 System.out.println("Valor es Positivo");
	 }
	 else {
		 System.out.println("Valor es cero");
	 }
	 System.out.println("El valor es : " + valor + " ese fue valor");
}
}
