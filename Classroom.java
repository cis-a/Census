class Classroom {

	public static void main (String [] args) {
		
		//References to Wilders
		Wilder christoph = new Wilder ("Christoph", true);
		Wilder gast = new Wilder ("Gast", true);
		Wilder denis = new Wilder ("Denis", true);

		//Use setter method
		denis.setPresence(false);
			
			System.out.println ("In the classroom today..."); 			
			//Call whoAmI method
			System.out.println (christoph.whoAmI()); 
			System.out.println (denis.whoAmI());
			System.out.println (gast.whoAmI());
				
	}
}
