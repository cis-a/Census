class Wilder {
	
	private String firstName;
	private boolean isHere;

		//Constructor
		    public Wilder(String firstName, boolean isHere) {
       			 this.firstName = firstName;
			 this.isHere = isHere;
		    }
        
		//Setter
		public void setPresence (boolean isHere) {
		this.isHere = isHere;		
		}	
		
		//Getter
		public boolean isPresent () {
		return this.isHere;
		}
		
		public String getName () {
		return this.firstName;
		}
	
	//Method : reminder "do use internal variables here, we are inside the class so no need to access via getters!"
	public String whoAmI () {
		if (this.isHere == true) {
		return ("My name is " + this.firstName + " and I am present");
		}
		else {
		return ("My name is " + this.firstName + " and I'm not present");
		}
	}
		
	public static void main (String [] args) {
						
	}
}
