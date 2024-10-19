package biblioteca;

public class Audiovisual extends Material{
    public String formato;
    public int duracion;

    public Audiovisual(String titulo, String autor, int añoPublicacion, String formato, int duracion) {
        super(titulo, autor, añoPublicacion);
        this.formato = formato;
        this.duracion = duracion;
    }

    @Override
    public String gerTipoMaterial() {
        return "Audiovisual";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo){
        double tarifaDia = 100.0;
        double blueRay = 50.0;

        double total = diasPrestamo * tarifaDia;
        double recargo = 0;
        if (formato == "Blueray"){
            recargo = diasPrestamo * blueRay;
        }

    return total + recargo;

    }

    public void mostrarDetallesAudiovisual(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Formato: " + formato);
        System.out.println("Duración: " + duracion);
    }

    @Override
    protected String getTitulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitulo'");
    }


    


    
}
