package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
	    public static void main(String[] args) {
	        Cart cart = new Cart();

	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
			cart.addDigitalVideoDisc(dvd1);
			
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
			cart.addDigitalVideoDisc(dvd2);
		
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 18.99f);
			cart.addDigitalVideoDisc(dvd3);
	        

	        cart.printCart();

	        cart.searchById(2);

	        cart.searchByTitle("Frozen");
	        cart.searchByTitle("The Lion King");
	        cart.searchByTitle("Aladin");
	    }
}


