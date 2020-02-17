package java8.tp05.lambda;

@FunctionalInterface
public interface ImachineAlaver {

	String demarrer(String nom);
	//void getStatus(); --> must be removed since it is now annotated functional interface (SAM = Single Abstract method)
}
