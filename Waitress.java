
public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	


	public Waitress(PancakeHouseMenu pancakeHouseMenu2, DinerMenu dinerMenu2) {
		this.pancakeHouseMenu = pancakeHouseMenu2;
		this.dinerMenu = dinerMenu2;
	}

	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("Menu\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
		
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext() ) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
