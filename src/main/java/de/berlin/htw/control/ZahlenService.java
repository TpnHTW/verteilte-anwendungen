package de.berlin.htw.control;

import java.util.LinkedList;

import javax.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class ZahlenService {

    LinkedList<Integer> list = new LinkedList<>();

    public ZahlenService() {
    }

    public String addList(int zahl){
        list.add(zahl);
        return "Zahl " + zahl + " wurde zur Liste hinzugefügt";
    }

    public String getList(){
        return list.toString();
    }

    public String getLastNumber(){
        if(list.size() == 0){
            return "Die Liste ist leer. Füge zuerst Zahlen hinzu!";
        }
        return list.getLast().toString();
    }


    public String removeLastListElement(){
        if(list.size() == 0){
            return "Ihre Liste ist bereits leer!";
        }
        list.removeLast();
        return "Das letzte Element wurde gelöscht!";
    }

    public void updateLastListElement(int zahl){
        int lastElementIndex = list.size() -1;
        list.set(lastElementIndex, zahl);
    }


}

/* 
 *    public int getlastZahl() {
        return this.zahl;
    }

    public void update(int zahl) {
        this.zahl = zahl;
    }
     public void remove(int zahl) {
        this.zahl = -1;
    }

     public String add(int zahl) {
        this.zahl = zahl;
        return "zahl geändert "+ this.zahl;
    }
*/
