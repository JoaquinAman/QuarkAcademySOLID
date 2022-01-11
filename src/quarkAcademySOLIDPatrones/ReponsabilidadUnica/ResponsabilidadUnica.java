package quarkAcademySOLIDPatrones.ReponsabilidadUnica;

public class ResponsabilidadUnica {
	public boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}
}
