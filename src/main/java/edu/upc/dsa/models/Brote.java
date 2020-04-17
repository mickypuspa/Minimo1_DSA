package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

import java.util.LinkedList;
import java.util.List;

public class Brote{

    public String id;
    public float any;
    public LinkedList<Caso> casos = null;


    public Brote(){
        this.id= RandomUtils.getId();
    }
    public Brote(float any){
        this();
        this.any=any;
        this.casos = new LinkedList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getAny() {
        return any;
    }

    public void setAny(float any) {
        this.any = any;
    }

    public LinkedList<Caso> getCasos() {
        return casos;
    }

    public void setCasos(LinkedList<Caso> casos) {
        this.casos = casos;
    }

    public int getSizeListaCasos(){return this.casos.size();}

    public void addCaso(Caso c){this.getCasos().add(c);}


    @Override
    public String toString() {
        return "Brote [id="+id+", de la fecha=" + any +"]";
    }


}
