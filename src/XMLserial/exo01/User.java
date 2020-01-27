package XMLserial.exo01;

public class User {

	private int id;
	private static int count;
	private String login;
	private String password;

	public User() {
		super();
		this.id = count++;
	}

	public User(String login, String password) {
		super();
		this.id = count++;
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "[" + id + "] login=" + login + ", password=" + password;
	}

}
