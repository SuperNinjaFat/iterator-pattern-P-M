
public class DinerMenuIterator implements Iterator {

	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] menuItems) {
		this.items = menuItems;
	}

	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

	public boolean hasNext() {
		if (position >= items.length || items[position] == null)
			return false;
		else
			return true;
	}
}
