public class CookieFactory {

	// receiving cookie order from customer
	private Cookie createCookie(String item){
		Cookie cookie = null;
		if(item.equalsIgnoreCase("chocolatechip")){
			cookie = new ChocolateChipCookie();
		} else if(item.equalsIgnoreCase("peanutbutter")){
			cookie = new PeanutButterCookie();
		} else if(item.equalsIgnoreCase("oatmeal")){
			cookie = new OatmealCookie();
		} 
		return cookie;
	}
	 
	public Cookie order(String type) {
		Cookie cookie = createCookie(type);
		System.out.println("\n*** Making a " + cookie.getName() + " ***");
		cookie.create();
		cookie.rollBalls();
		cookie.bake();
		cookie.box();
		return cookie;
	}
}