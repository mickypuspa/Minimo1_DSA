package edu.upc.dsa;

import edu.upc.dsa.models.Brote;
import edu.upc.dsa.models.Caso;

import java.util.HashMap;
import java.util.List;

public interface Covid19Manager {

    //Añadir un brote
    public Brote addBrote(Brote b);
    public Brote addBrote(int any);


    //Lista de brotes

    public HashMap<String, Brote> findAll();


    //Añadir Caso

    public void addCaso( String nombre, String apellidos, int id, int fnacimiento, int finforme, String riesgo, String genero, String email, int tel, String direccion, String clas);

    //Listado de casos según brote y ordenado por clasificación y posteriormente fecha

    public List<Caso> clasificacionyFechadeCasos(String id);

    public int size();

}