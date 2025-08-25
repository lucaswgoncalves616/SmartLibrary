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
        System.out.println(items);
        for (int i = 0; i < items.size(); i++){
            System.out.println(items.get(i));
        }
        for(Item item : items) {
            System.out.println(item);
        }
    }
}
