package java8.tp07.MethodReference;

public class Calculatrice {

	// Méthodes Statiques
	public static Integer add(Integer a, Integer b) {
		return a + b;
	}

	public static Integer mul(Integer a, Integer b) {
		return a * b;
	}

	public static Integer sub(Integer a, Integer b) {
		return a - b;
	}

	public static Integer div(Integer a, Integer b) {
		return a / b;
	}

	// Méthodes d'instance
	public Integer addByInstance(Integer a, Integer b) {
		return a + b;
	}

	public Integer mulByInstance(Integer a, Integer b) {
		return a * b;
	}

	public Integer subByInstance(Integer a, Integer b) {
		return a - b;
	}

	public Integer divByInstance(Integer a, Integer b) {
		return a / b;
	}

}
