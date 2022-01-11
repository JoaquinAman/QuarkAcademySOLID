package quarkAcademySOLIDPatrones.InversionDeDependencia.abstraction;

import quarkAcademySOLIDPatrones.InversionDeDependencia.User;

public interface IRepository {
	public void save(User user);
}
