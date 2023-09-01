package plantrabajo;

import java.util.ArrayList;

public class MetodoQuinto {

	public MetodoQuinto() {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(50);
		numeros.add(34);
		numeros.add(20);
		numeros.add(0);
		numeros.add(5);
		
		int valor= maximo(numeros);
		System.out.print(valor);	
	}

	public int maximo(ArrayList<Integer> numeros) {
		int mayor = numeros.get(0);
		for (int i : numeros) {
			if (i > mayor) {
				mayor= i;
			}
		}
		return mayor;
	}
}
