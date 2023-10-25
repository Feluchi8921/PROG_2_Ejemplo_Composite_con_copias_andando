public class CondicionNombre extends CondicionBusqueda{

    //Atributo
    private String nombre;

    //Constructor
    public CondicionNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public boolean cumple (Archivo archivo){
        return archivo.getNombre().contains(nombre);
    }
}
