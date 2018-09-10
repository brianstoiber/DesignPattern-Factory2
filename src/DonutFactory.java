public class DonutFactory {
	
	// receiving donut order from customer
	private Donut createDonut(String item){
		Donut donut = null;
		if(item.equalsIgnoreCase("BostonCream")){
			donut = new BostonCreamDonut();
		} else if(item.equalsIgnoreCase("Glazed")){
			donut = new GlazedDonut();
		} else if(item.equalsIgnoreCase("LongJohn")){
			donut = new LongJohnDonut();
		} else if(item.equalsIgnoreCase("MarbleFrosted")){
			donut = new MarbleFrostedDonut();
		} else if(item.equalsIgnoreCase("ChocolateFrosted")){
			donut = new ChocolateFrostedDonut();
		}
		return donut;
	}
	 
	// 
	public Donut order(String type) {
		Donut donut = createDonut(type);
		System.out.println("\n*** Making a " + donut.getName() + " ***");
		donut.roll();
		donut.fry();
		donut.dry();
		donut.addFilling();
		donut.addFrosting();
		donut.addTopping();
		donut.pack();
		return donut;
	}
}