package library.model;

import java.util.ArrayList;

public class LibraryItems {
    private static ArrayList<Item> itemList = new ArrayList<>();

    public static void addNewItem(Item item) {
        itemList.add(item);
    }

    public static ArrayList<Item> getItemList() {
        return itemList;
    }

}
