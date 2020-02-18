package java8.tp07.MethodReference;

import java.util.function.BinaryOperator;

public class AppCalc {

	//Avec une interface fonctionnelle fournie par la JDK
	public static Integer applyOperation(BinaryOperator<Integer> bo, Integer a, Integer b) {		
		return bo.apply(a, b);
	}

	//Avec ma propre Interface fonctionnelle
	public static Integer applyOperation2(IFonctionSurEntier bo, Integer a, Integer b) {		
		return bo.apply(a, b);
	}

	public static void main(String[] args) {
		
		System.out.println("----------------------Avec méthodes statiques de calculatrice------------------------------");

		//Avec méthodes statiques de calculatrice
		{
			System.out.println(applyOperation(Calculatrice::add, 5, 3));
			System.out.println(applyOperation(Calculatrice::mul, 5, 3));
			System.out.println(applyOperation(Calculatrice::sub, 5, 3));
			System.out.println(applyOperation(Calculatrice::div, 5, 3));
	
			
			System.out.println(applyOperation2(Calculatrice::add, 5, 3));
			System.out.println(applyOperation2(Calculatrice::mul, 5, 3));
			System.out.println(applyOperation2(Calculatrice::sub, 5, 3));
			System.out.println(applyOperation2(Calculatrice::div, 5, 3));
		}
		
		System.out.println("-----------------------Avec méthodes d'instance de calculatrice-----------------------------");

		//Avec méthodes d'instance de calculatrice
		{
			Calculatrice calc = new Calculatrice();
			
			System.out.println(applyOperation(calc::addByInstance, 5, 3));
			System.out.println(applyOperation(calc::mulByInstance, 5, 3));
			System.out.println(applyOperation(calc::subByInstance, 5, 3));
			System.out.println(applyOperation(calc::divByInstance, 5, 3));
	
			
			System.out.println(applyOperation2(calc::addByInstance, 5, 3));
			System.out.println(applyOperation2(calc::mulByInstance, 5, 3));
			System.out.println(applyOperation2(calc::subByInstance, 5, 3));
			System.out.println(applyOperation2(calc::divByInstance, 5, 3));
		}

		
		System.out.println("------------------------Avec interfaces instanciées----------------------------");

		//Avec interfaces instanciées
		{
			//IFonctionSurEntier add = (a,b)->{ return a+b;};
			//IFonctionSurEntier add = (a,b)->(a+b);
			IFonctionSurEntier add = (a,b)->a+b;
			IFonctionSurEntier sub = (a,b)->a-b;
			IFonctionSurEntier mul = (a,b)->a*b;
			IFonctionSurEntier div = (a,b)->a/b;
			
			System.out.println(applyOperation2(add, 5, 3));
			System.out.println(applyOperation2(mul, 5, 3));
			System.out.println(applyOperation2(sub, 5, 3));
			System.out.println(applyOperation2(div, 5, 3));
		}
	}
}
