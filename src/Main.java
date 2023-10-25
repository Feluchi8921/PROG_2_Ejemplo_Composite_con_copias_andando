public class Main {
    public static void main(String[] args) {

        // Paso 4: Uso del patrón Composite y creación de copias restringidas con filtro
        Carpeta carpetaOriginal = new Carpeta("Carpeta1");
        carpetaOriginal.addElemento(new Archivo("Archivo1.txt"));
        carpetaOriginal.addElemento(new Archivo("Archivo2.txt"));
        carpetaOriginal.addElemento(new Archivo("Documento1.txt"));


        // Crear una copia restringida de la carpeta utilizando un filtro
        CondicionNombre filtroNombre = new CondicionNombre("Archivo");

        Carpeta copiaCarpeta = (Carpeta) carpetaOriginal.copiar(filtroNombre);

        System.out.println("Elementos en la carpeta original:");
        for (Componente elemento : carpetaOriginal.getElementos()) {
            System.out.println(elemento instanceof Archivo ? "Archivo: " + ((Archivo) elemento).getNombre() : "Carpeta: " + ((Carpeta) elemento).getNombre());
        }

        System.out.println("\nElementos en la copia restringida de la carpeta (solo archivos):");
        for (Componente elemento : copiaCarpeta.getElementos()) {
            System.out.println(elemento instanceof Archivo ? "Archivo: " + ((Archivo) elemento).getNombre() : "Carpeta: " + ((Carpeta) elemento).getNombre());
        }
    }
}