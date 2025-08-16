package library.model;

import java.util.ArrayList;

public class DVD {
    private ArrayList<ArrayList<Object>> DVDsList = new ArrayList<>();

    public ArrayList<ArrayList<Object>> getDVDsList() {
        return DVDsList;
    }

    public void setDVD(int id, String title, int year, boolean loaned, int duration) {
        ArrayList<Object> DVD = new ArrayList<>();
        DVD.add(id);
        DVD.add(title);
        DVD.add(year);
        DVD.add(loaned);
        DVD.add(duration);
        this.DVDsList.add(DVD);
    }
}
