public abstract class Donut {
	String name = null;
	String filling = null;
	String frosting = null;
	String topping = null;
	
	void roll() {
		System.out.println("Rolling/shapping donut");
	}

	void fry() {
		System.out.println("Frying Donut for 5 minutes at 450 degrees");
	}
	
	void dry() {
		System.out.println("Draining/drying donut for 3 minutes");
	}
	
	void addFilling() {
		if(filling != null) {
			System.out.println("Injecting filling: " + filling);
		}
	}
	
	void addFrosting() {
		if(frosting != null) {
			System.out.println("Applying frosting: " + frosting);
		}
	}
	
	void addTopping() {
		if(topping != null) {
			System.out.println("Applying topping: " + topping);
		}
	} 
	
	void pack() {
		System.out.println("Packaging for customer");
	}
	
	public String getName() {
		return name;
	}
}