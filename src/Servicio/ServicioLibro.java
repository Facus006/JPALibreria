package Servicio;

import Controlador.ControladoraPersistencia;
import Entidades.Libro;
import java.util.ArrayList;
import java.util.List;



public class ServicioLibro {
    
   public List<Libro> buscarLibrosPorTitulo(String parteTitulo) {
    List<Libro> librosEncontrados = new ArrayList<>();
    for (Libro libro : new ControladoraPersistencia().listadeLibros()) {
        if (libro.getTitulo().toLowerCase().contains(parteTitulo.toLowerCase())) {
            librosEncontrados.add(libro);
        }
    }
    if (librosEncontrados.isEmpty()) {
        System.out.println("No se encontraron libros que contengan '" + parteTitulo + "' en el título.");
    }
    return librosEncontrados;
}

    public List<Libro> buscarLibrosPorAutor(String autor) {
        List<Libro> librosAutor = new ArrayList<>();
        for (Libro libro : new ControladoraPersistencia().listadeLibros()) {
            if (libro.getAutor().getNombre().toLowerCase().contains(autor.toLowerCase())) {
                librosAutor.add(libro);
            }
        }

        if (librosAutor.isEmpty()) {
            System.out.println("No se encontró ningún libro del autor: " + autor);
        }

        return librosAutor;
    }

    public List<Libro> buscarLibrosPoreEditorial(String editorial) {
        List<Libro> librosAutor = new ArrayList<>();
        for (Libro libro : new ControladoraPersistencia().listadeLibros()) {
            if (libro.getEditorial().getNombre().toLowerCase().equals(editorial.toLowerCase())) {
                librosAutor.add(libro);
            }
        }

        if (librosAutor.isEmpty()) {
            System.out.println("No se encontró ningún libro de la editorial: " + editorial);
        }

        return librosAutor;
    }

    
}
