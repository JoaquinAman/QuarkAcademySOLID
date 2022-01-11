package quarkAcademySOLIDPatrones.SustitucionLiskov;

import quarkAcademySOLIDPatrones.SustitucionLiskov.abstraction.IComer;
import quarkAcademySOLIDPatrones.SustitucionLiskov.abstraction.INadar;
import quarkAcademySOLIDPatrones.SustitucionLiskov.abstraction.IVolar;

public class Pato implements IComer, INadar, IVolar {

	private IComer comer;
	private IVolar volar;
	private INadar nadar;

	@Override
	public String vuela(boolean vuela) {
		if (vuela) {
			return "El pato vuela";

		} else {
			return "El pato no vuela";

		}

	}

	@Override
	public String nada(boolean nada) {
		if (nada) {
			return "El pato nada";

		} else {
			return "El pato no nada";

		}
	}

	@Override
	public String come(String comida) {
		return "El pato come " + comida;

	}

}
