package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Material> materiales;

    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }

    public void mostrarCatalogo() {
        for (Material material : materiales) {
            material.mostrarInformacion();

            // Use instanceof to check the type and call the appropriate method
            if (material instanceof Libro) {
                ((Libro) material).mostrarDetallesLibro();
            } else if (material instanceof Revista) {
                ((Revista) material).mostrarDetallesRevista();
            } else if (material instanceof Audiovisual) {
                ((Audiovisual) material).mostrarDetallesAudiovisual();
            }
        }
    }
}