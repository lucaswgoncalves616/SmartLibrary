package library.model;

import java.util.ArrayList;

public class LibraryItems {
    private ArrayList<Item> items = new ArrayList<Item>();
    private int numOfItems;

    public LibraryItems() {
        numOfItems = 0;
    }

    public void registerNewItem(Item item) {
        items.add(item);
    }

    public void showInfo() {
        for(Item item : items) {
            System.out.println(item);
        }
    }
}
