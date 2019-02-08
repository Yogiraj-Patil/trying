package in.codecore.yogiraj.trynewdrawerlayout.attendence;

import java.util.ArrayList;

public class Main_item {

    private String year_titel;
    private ArrayList<String> list_title;

    public Main_item(String year_titel, ArrayList list_title) {
        this.year_titel = year_titel;
        this.list_title = list_title;
    }

    public String getYear_titel() {
        return year_titel;
    }

    public ArrayList getList_title() {
        return list_title;
    }
}
