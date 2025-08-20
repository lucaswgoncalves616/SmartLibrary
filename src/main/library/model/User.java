package library.model;

import java.util.ArrayList;

public class User {
    private ArrayList<ArrayList<Object>> userList = new ArrayList<>();

    public ArrayList<ArrayList<Object>> getUserList() {
        return userList;
    }

    public void setStudentsList(int id, String name, int maxLoan, int currentlyLoaned) {
        ArrayList<Object> user = new ArrayList<>();
        user.add(id);
        user.add(name);
        user.add(maxLoan);
        user.add(currentlyLoaned);
        this.userList.add(user);
    }
}
