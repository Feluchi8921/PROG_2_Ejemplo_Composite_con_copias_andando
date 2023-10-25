public abstract class Componente {

    public abstract void mostrarNombre();

    //Copia
    public abstract Componente copiar();

    //Copia restringida
    public abstract Componente copiar(CondicionBusqueda condicion);

}
