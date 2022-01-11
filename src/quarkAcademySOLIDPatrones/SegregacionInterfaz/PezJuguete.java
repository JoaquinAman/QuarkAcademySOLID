package quarkAcademySOLIDPatrones.SegregacionInterfaz;

import quarkAcademySOLIDPatrones.SegregacionInterfaz.abstraction.INadar;

public class PezJuguete implements INadar {

	@Override
	public String nada(boolean nada) {
		if (nada) {
			return "El pato nada";

		} else {
			return "El pato no nada";

		}
	}
}
