
public class AnimalCounterApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		int i;
		String sRet;
		// Create a new instance of the Alligator and Sheep classes
		Alligator cAlligator = new Alligator();
		Sheep cBlackie = new Sheep();
		Sheep cDollie = (Sheep) cBlackie.clone("Dollie");
		
		//		
		// Counting 3 Alligators
		//
		System.out.println("Counting alligators...\n");
		for (i=1;i<=3;i++)
		{
			cAlligator.incrementCount();
			sRet = cAlligator.getCountString();
			System.out.println(sRet);
		}
		
		//
		//Counting sheep
		//
		System.out.println("\nCounting sheep...\n");
		
		// Blackie
		cBlackie.setName("Blackie");
		for (i=1;i<=2;i++)
		{
			cBlackie.incrementCount();
			sRet = cBlackie.getCountString();
			System.out.println(sRet);
		}
		System.out.println("");
		
		// Dollie
		for (i=1;i<=3;i++)
		{
			cDollie.incrementCount();
			sRet = cDollie.getCountString();
			System.out.println(sRet);
		}
		System.out.println("");
		
		// Blackie
		cBlackie.resetCount();
		sRet = cBlackie.getCountString();
		System.out.println(sRet);
		
	}
}


