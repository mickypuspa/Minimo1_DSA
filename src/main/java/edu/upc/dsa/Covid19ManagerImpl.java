package edu.upc.dsa;

import edu.upc.dsa.models.Brote;
import edu.upc.dsa.models.Caso;
import java.util.*;


import org.apache.log4j.Logger;


public class Covid19ManagerImpl extends Covid19Manager {

    String numb="0";
    //Implementación del Singelton
    private static Covid19Manager instance;
    //Listas
    protected List<Caso> casos;
    //acceso por (<clave,valor>)
    protected HashMap<String, Brote> brotes;

    //para las funciones de logg
    final static Logger logger = Logger.getLogger(Covid19ManagerImpl.class);


    //Constructor privado singleton para que nadie pueda crear instancias
    private Covid19ManagerImpl() {
        this.brotes= new HashMap<>();
        this.casos = new LinkedList<>();
    }

    //Metodo publico estatico que proporciona la instancia
    public static Covid19Manager getInstance() {
        if (instance==null) instance = new Covid19ManagerImpl();
        return instance;
    }

    public Brote addBrote(Brote b){
        logger.info("new Brote "+ b);

        this.brotes.put(numb,b);
        logger.info("new Brote added");
        return b;


    }

    public Brote addBrote(int any){ return this.addBrote(new Brote(any));}


    public HashMap<String, Brote> findAll(){
        return this.brotes;
    }


    public void addCaso(String nombre, String apellidos, int id, int fnacimiento, int finforme, String riesgo, String genero, String email, int tel, String direccion, String clas){
        Caso c = new Caso(nombre, apellidos, id, fnacimiento, finforme, riesgo, genero, email, tel, direccion, clas);
        logger.info("Caso Creado");
    }




}
