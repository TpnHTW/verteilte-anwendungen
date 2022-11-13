package de.berlin.htw.control;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ZahlenService {

    List<Integer> zahlen = new ArrayList<>();

    public void add(int zahl) {
        zahlen.add(zahl);
    }

    public void remove(int zahl) {
        zahlen.remove(zahlen.indexOf(zahl));
    }

    public int getlastZahl() {
        return zahlen.get(zahlen.size());
    }

    public void update(int zahl, int newZahl) {
        zahlen.set(zahlen.indexOf(zahl), newZahl);
    }
}
