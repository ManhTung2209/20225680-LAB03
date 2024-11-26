package hust.soict.dsai.aims.cart;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED =20;
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Đĩa đã được thêm vào.");
        } else {
            System.out.println("Giỏ hàng gần đầy.");
        }
    }
	 public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		 for(DigitalVideoDisc dvd : dvdList) {
			 this.addDigitalVideoDisc(dvd);
		 }
	}
	 public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		 this.addDigitalVideoDisc(dvd1);
		 this.addDigitalVideoDisc(dvd2);
	 }
	 public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i] == disc) {
	                // Di chuyển các phần tử còn lại để lấp vào vị trí bị xóa
	                for (int j = i; j < qtyOrdered - 1; j++) {
	                    itemsOrdered[j] = itemsOrdered[j + 1];
	                }
	                itemsOrdered[qtyOrdered - 1] = null;  // Xóa phần tử cuối cùng
	                qtyOrdered--;
	                System.out.println("Đĩa đã được xóa khỏi giỏ hàng.");
	                return;
	            }
	        }
	        System.out.println("Đĩa không có trong giỏ hàng.");
	    }

	  public float totalCost() {
	        float total = 0;
	        for (int i = 0; i < qtyOrdered; i++) {
	            total += (itemsOrdered[i]).getCost();  
	        }
	        return total;
	    }
	 
	  public void printCart() {
	        System.out.println("***********************CART***********************");
	        System.out.println("Ordered Items:");
	        for (int i = 0; i < qtyOrdered; i++) {
	            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
	        }
	        System.out.println("Total cost: " + totalCost() + " $");
	        System.out.println("***************************************************");
	    }

	    
	   public void searchById(int id) {
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i].getId() == id) {
	                System.out.println("DVD found: " + itemsOrdered[i].toString());
	                return;
	            }
	        }
	        System.out.println("No match found for ID: " + id);
	    }

	   
	   public void searchByTitle(String title) {
	        boolean found = false;
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i].isMatch(title)) {
	                System.out.println("DVD found: " + itemsOrdered[i].toString());
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No match found for title: " + title);
	        }
	    }
}

