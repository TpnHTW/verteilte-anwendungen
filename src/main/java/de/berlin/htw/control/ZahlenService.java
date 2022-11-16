package de.berlin.htw.control;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;

@ApplicationScoped
public class ZahlenService {

    int zahl;

    public ZahlenService() {
    }

    public String add(int zahl) {
        this.zahl = zahl;
        return "zahl geändert"+ this.zahl;
    }

    public void remove(int zahl) {
        this.zahl = -1;
    }

    public int getlastZahl() {
        return this.zahl;
    }

    public void update(int zahl) {
        this.zahl = zahl;
    }
}
