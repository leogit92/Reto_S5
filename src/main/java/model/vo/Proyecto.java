package model.vo;


public class Proyecto {

    private String fecha_inicio;
    private int num_habitaciones;
    private int num_banios;
    private String nombre_constructora;
    private int estrato_proyecto;
    private String serial;
    private int num_casas;
    private String nombre_lider;
    private String apellido_lider;

    public Proyecto() {

    }

    public Proyecto(String fecha_inicio, int num_habitaciones, int num_banios, String nombre_constructora, int estrato_proyecto, String serial, int num_casas, Lider lider) {
        this.fecha_inicio = fecha_inicio;
        this.num_habitaciones = num_habitaciones;
        this.num_banios = num_banios;
        this.nombre_constructora = nombre_constructora;
        this.estrato_proyecto = estrato_proyecto;
        this.serial = serial;
        this.num_casas = num_casas;
        //this.lider = lider;

    }

    /*******************************
     * Consultores y modificadores
     ********************************/

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public int getNum_banios() {
        return num_banios;
    }

    public void setNum_banios(int num_banios) {
        this.num_banios = num_banios;
    }

    public String getNombre_constructora() {
        return nombre_constructora;
    }

    public void setNombre_constructora(String nombre_constructora) {
        this.nombre_constructora = nombre_constructora;
    }

    public String getNombreLider() {
        return nombre_lider;
    }

    public void setNombreLider(String nombre) {
        this.nombre_lider = nombre;
    }

    public String getApellidoLider() {
        return apellido_lider;
    }

    public void setApellidoLider(String apellido) {
        this.apellido_lider = apellido;
    }

    public int getEstrato_proyecto() {
        return estrato_proyecto;
    }

    public void setEstrato_proyecto(int estrato_proyecto) {
        this.estrato_proyecto = estrato_proyecto;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getNum_casas() {
        return num_casas;
    }

    public void setNum_casas(int num_casas) {
        this.num_casas = num_casas;
    }

    
}