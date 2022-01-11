package quarkAcademySOLIDPatrones.InversionDeDependencia;

import quarkAcademySOLIDPatrones.InversionDeDependencia.abstraction.IRepository;

public class Repository implements IRepository {

	User user;

	public Repository() {
	}

	@Override
	public void save(User u) {
		this.user = user;
	}

}
