package de.berlin.htw.control;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ZahlenService {

    int zahl;
    int number;

    public ZahlenService() {
    }

    public String add(int zahl) {
        this.zahl = zahl;
        return "Zahl geändert in: "+ this.zahl;
    }

    public void remove(int zahl) {
        this.zahl = -1;
    }

    public int getlastZahl() {
        return this.zahl;
    }
    public int getLastNumber(){
        return this.number;
    }
    public void update(int zahl) {
        this.zahl = zahl;
    }
}
