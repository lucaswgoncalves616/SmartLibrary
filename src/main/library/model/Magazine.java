package library.model;

import java.util.ArrayList;

public class Magazine {
    private ArrayList<ArrayList<Object>> magazinesList = new ArrayList<>();

    public ArrayList<ArrayList<Object>> getMagazinesList() {
        return magazinesList;
    }

    public void setMagazine(int id, String title, int year, boolean loaned, String edition) {
        ArrayList<Object> magazine = new ArrayList<>();
        magazine.add(id);
        magazine.add(title);
        magazine.add(year);
        magazine.add(loaned);
        magazine.add(edition);
        this.magazinesList.add(magazine);
    }
}
