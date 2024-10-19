package biblioteca;

public class Main {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();

        Libro l1 = new Libro("Pepita", "Carlos Sepulveda", 1963, "-", 410);
        Revista r1 = new Revista("Chismes", "--", 2000, 5, "-");
        Audiovisual a1 = new Audiovisual("Montañas", "--", 2010, "BLUERAY", 210);


        biblioteca.agregarMaterial(l1);
        biblioteca.agregarMaterial(r1);
        biblioteca.agregarMaterial(a1);

        System.out.println("Catálogo completo: ");
        biblioteca.mostrarCatalogo();


        String buscarTitulo = "Pepita";
        Material materialEncontrado = biblioteca.buscarMaterial(buscarTitulo);
        if (materialEncontrado != null) {
            System.out.println("Material encontrado: " + materialEncontrado.getTitulo());
            // Aquí puedes agregar lógica para mostrar detalles adicionales del material encontrado
        } else {
            System.out.println("Material no encontrado.");
        }

    }
}