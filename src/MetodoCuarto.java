package plantrabajo;

public class MetodoCuarto {

	
	public MetodoCuarto() {
		int[] objeto = {6,10,45 ,23};
		
		 int valor= maximo(objeto);
		System.out.print(valor);

	}
	
	public int maximo(int[] arreglo) {
		int mayor = arreglo[0];
		
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] > mayor) {
				mayor=arreglo[i];
			}
		}
		return mayor;
		
	}
}
