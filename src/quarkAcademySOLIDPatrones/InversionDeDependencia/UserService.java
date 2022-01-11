package quarkAcademySOLIDPatrones.InversionDeDependencia;

public class UserService {
	Repository re = new Repository();

	public User save(User user) {

		re.save(user);
		return user;
	}
}
