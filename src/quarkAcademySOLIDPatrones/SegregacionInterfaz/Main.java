package quarkAcademySOLIDPatrones.SegregacionInterfaz;

public class Main {

	public static void main(String[] args) {
		AvionJuguete av = new AvionJuguete();
		PezJuguete pez = new PezJuguete();
		PerroJuguete perro = new PerroJuguete();

		System.out.println(av.vuela(false));
		System.out.println(pez.nada(true));
		System.out.println(perro.come("asado"));
	}

}
