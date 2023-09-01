package plantrabajo;

public class MetodoSegunda {
	
	
	public MetodoSegunda( int numero) {
		int hola = numero;
		mayor(hola);
	}
	
	public void mayor(int hola) {
		if (hola > 10) {
			System.out.print("el numero es mayor de 10");
		}
		if (hola == 10) {
			System.out.print("el numero es igual a 10");
		}
		if (hola < 10) {
			System.out.print("el numero es menor de 10");
		}
	
	}
}
