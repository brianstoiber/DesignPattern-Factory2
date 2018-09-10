public abstract class Cookie {
	String name;

	public String getName() {
		return name;
	}
	
	void create() {
		System.out.println("Creating " + name);
	}
	
	void rollBalls() {
		System.out.println("Rolling cookie balls and placing on tray");
	}
	
	void bake() {
		System.out.println("Baking cookie for 12 minutes at 350 degrees");
	}
	
	void box() {
		System.out.println("Packaging for customer");
	}
}