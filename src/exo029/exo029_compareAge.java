package exo029;

public class Exo029_compareAge {

	static String getClasseAge(String pName, int pAge) {
		if ( pAge < 10 ) 
			return pName + " est un nourisson";
		else {
			if ( pAge < 16)
				return pName + " est un adulte";
			else
				return pName + " est un enfant";
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nRiri="Riri", nFifi="Fifi", nLoulou="Loulou";
		int aRiri=2, aFifi=10, aLoulou=40;
		
//		if ( aRiri < 10 ) 
//			System.out.println(nRiri + " est un nourisson");
//		else {
//			if ( aRiri < 16)
//				System.out.println(nRiri + " est un adulte");
//			else
//				System.out.println(nRiri + " est un enfant");
//		}
//
//		if ( aFifi < 10 ) 
//			System.out.println(nFifi + " est un nourisson");
//		else {
//			if ( aFifi < 16)
//				System.out.println(nFifi + " est un adulte");
//			else
//				System.out.println(nFifi + " est un enfant");
//		}
//
//		if ( aLoulou < 10 ) 
//			System.out.println(nLoulou + " est un nourisson");
//		else {
//			if ( aLoulou < 16)
//				System.out.println(nLoulou + " est un adulte");
//			else
//				System.out.println(nLoulou + " est un enfant");
//		}

		System.out.println();
		System.out.println(getClasseAge(nRiri, aRiri));
		System.out.println(getClasseAge(nFifi, aFifi));
		System.out.println(getClasseAge(nLoulou, aLoulou));
		
	}

}
