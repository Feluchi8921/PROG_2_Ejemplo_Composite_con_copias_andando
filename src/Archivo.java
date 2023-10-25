public class Archivo extends Componente{
    //Clase simple

    //Atributos
    private String nombre;

    //Constructor
    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarNombre(){
        System.out.println("Archivo: "+nombre);
    }

    @Override
    public Componente copiar() {
        return new Archivo(this.nombre);
    }
    @Override
    public Componente copiar(CondicionBusqueda condicion){
        if (condicion.cumple(this)) {
            return new Archivo(this.nombre);
        }
        return null; // Devuelve null si no se permite copiar el elemento.
    }

}
