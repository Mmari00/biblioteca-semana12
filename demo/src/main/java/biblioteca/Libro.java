package biblioteca;

public class Libro extends Material{
    public String isbn;
    public int numeroPaginas;

    public Libro(String titulo, String autor, int añoPublicacion, String isbn, int numeroPaginas) {
        super(titulo, autor, añoPublicacion);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String gerTipoMaterial() {
        return "Libro";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaDia = 100.0;
        double recargo = 50.0;
        double total = diasPrestamo * tarifaDia;
        double total1 = 0;
        if (numeroPaginas > 500){
            total1 = numeroPaginas * recargo;
        }
        return total + total1;
    }

    public void  mostrarDetallesLibro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Disponibilidad: " + disponible);
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de páginas: " + numeroPaginas);
    }

    @Override
    protected String getTitulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitulo'");
    }

    

    
}
