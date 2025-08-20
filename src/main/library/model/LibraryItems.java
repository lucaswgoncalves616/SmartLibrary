package library.model;

public class LibraryItems {
    private Item[] items;
    private int numOfItems;

    public LibraryItems() {
        items = new Item[5];
        numOfItems = 0;
    }

    public void registerNewItem(Item item) {
        items[numOfItems++] = item;
    }

    public void showInfo() {
        for(Item item : items) {
            System.out.println(item);
        }
    }

}
