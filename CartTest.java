public class CartTest {
	    public static void main(String[] args) {
	        Cart cart = new Cart();

	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle", "Adventure", "Joe Wright", 120, 15.5f);
	        cart.addDigitalVideoDisc(dvd1);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Animation", "John Lasseter", 90, 12.0f);
	        cart.addDigitalVideoDisc(dvd2);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 110, 18.0f);
	        cart.addDigitalVideoDisc(dvd3);
	        

	        cart.printCart();

	        cart.searchById(2);

	        cart.searchByTitle("Frozen");
	        cart.searchByTitle("The King Lion");
	    }
}


