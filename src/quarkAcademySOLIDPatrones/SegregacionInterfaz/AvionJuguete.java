package quarkAcademySOLIDPatrones.SegregacionInterfaz;

import quarkAcademySOLIDPatrones.SegregacionInterfaz.abstraction.IVolar;

public class AvionJuguete implements IVolar {

	private IVolar volar;

	@Override
	public String vuela(boolean vuela) {
		if (vuela) {
			return "El pato vuela";

		} else {
			return "El pato no vuela";

		}
	}
}