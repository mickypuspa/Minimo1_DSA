package edu.upc.dsa.models;

public class Caso {
    String nombre;
    String apellidos;
    int id;
    float fnacimiento;
    float finforme;
    String riesgo;
    String genero;
    String email;
    float tel;
    String direccion;
    String clas;

    public Caso (){};
    public Caso(String nombre, String apellidos, int id, float fnacimiento, float finforme, String riesgo, String genero, String email, float tel, String direccion, String clas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.fnacimiento = fnacimiento;
        this.finforme = finforme;
        this.riesgo = riesgo;
        this.genero = genero;
        this.email = email;
        this.tel = tel;
        this.direccion = direccion;
        this.clas = clas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(float fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public float getFinforme() {
        return finforme;
    }

    public void setFinforme(float finforme) {
        this.finforme = finforme;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getTel() {
        return tel;
    }

    public void setTel(float tel) {
        this.tel = tel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "Caso num "+id+" con fecha "+finforme+"  [nombre:"+nombre+" "+apellidos+", fecha de nacimiento:"+fnacimiento+", género:"+genero+",tel: "+tel+",email:"+email+",direccion:"+direccion+". Riesgo:"+riesgo+"clasificado como:"+clas;
    }
}
