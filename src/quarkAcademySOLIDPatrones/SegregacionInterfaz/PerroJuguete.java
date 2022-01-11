package quarkAcademySOLIDPatrones.SegregacionInterfaz;

import quarkAcademySOLIDPatrones.SegregacionInterfaz.abstraction.IComer;

public class PerroJuguete implements IComer {

	@Override
	public String come(String comida) {
		return "El pato come " + comida;
	}
}
