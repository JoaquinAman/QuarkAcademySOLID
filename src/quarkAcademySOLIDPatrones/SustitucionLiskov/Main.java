package quarkAcademySOLIDPatrones.SustitucionLiskov;

import quarkAcademySOLIDPatrones.SustitucionLiskov.abstraction.IComer;
import quarkAcademySOLIDPatrones.SustitucionLiskov.abstraction.INadar;
import quarkAcademySOLIDPatrones.SustitucionLiskov.abstraction.IVolar;

public class Main {

	public static void main(String[] args) {
		Pato pa = new Pato();

		IComer comer1 = pa;
		IVolar volar1 = pa;
		INadar nadar1 = pa;

		System.out.println(nadar1.nada(true));
		System.out.println(volar1.vuela(true));
		System.out.println(volar1.vuela(false));
		System.out.println(comer1.come("peces"));
	}

}
