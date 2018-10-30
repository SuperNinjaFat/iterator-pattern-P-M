import java.util.ArrayList;

public class PancakeHouseMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public PancakeHouseMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("K&B's pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
