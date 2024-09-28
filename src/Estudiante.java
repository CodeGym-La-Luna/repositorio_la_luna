public class Estudiante {
    private String nombre;
    private String apellido;
    private String pais;

    public Estudiante(String nombre, String apellido, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void printMensaje(String mensaje){
        System.out.println(mensaje);
        System.out.println("De: "+this.nombre+" "+this.apellido+" desde "+this.pais);
    }
}
