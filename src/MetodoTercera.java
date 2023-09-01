package plantrabajo;

import java.util.Random;

public class MetodoTercera {
	
	public MetodoTercera() {
		System.out.print(aleatorio());
	}
	public int aleatorio() {
		Random numero = new Random();		
		return numero.nextInt(100) + 1;
	}
}
