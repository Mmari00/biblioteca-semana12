package biblioteca;

public abstract class Material {
    public String titulo;
    public String autor;
    public int añoPublicacion;
    public boolean disponible;

    public Material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public void  mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Disponibilidad: " + disponible);
    }
    
    public void prestar(){
        disponible = false;
    }

    public void devolver(){
        disponible = true;
    }

    public abstract String  gerTipoMaterial();
    public abstract double calcularTarifaPrestamo(int diasPrestamo);

    protected abstract String getTitulo();
}
