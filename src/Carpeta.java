import java.util.ArrayList;

public class Carpeta extends Componente{
    //Atributos
    private String nombre;
    private ArrayList<Componente> elementos = new ArrayList<>();

    //Constructor
    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.elementos=new ArrayList<>();
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addElemento(Componente elemento){
        elementos.add(elemento);
    }

    @Override
    public void mostrarNombre(){
        System.out.println("Carpeta "+nombre);
        for (Componente e: elementos) {
            e.mostrarNombre();
        }
    }
    @Override
    public Componente copiar() {
        Carpeta copiaCarpeta = new Carpeta(this.nombre);
        for (Componente elemento : elementos) {
            Componente copiaElemento = elemento.copiar();
            copiaCarpeta.addElemento(copiaElemento);
        }
        return copiaCarpeta;
    }

    @Override
    public Componente copiar(CondicionBusqueda condicion) {
        Carpeta copiaCarpeta = new Carpeta(this.nombre);
        for (Componente elemento : elementos) {
            Componente copiaElemento = elemento.copiar(condicion);
            if (copiaElemento != null) {
                copiaCarpeta.addElemento(copiaElemento);
            }
        }
        return copiaCarpeta;
    }

    public ArrayList<Componente> getElementos() {
        return elementos; // Retorna un arrayList de elementos contenidos en la carpeta
    }
}
