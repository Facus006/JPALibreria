/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Controlador.ControladoraPersistencia;
import Entidades.Autor;

/**
 *
 * @author Facu
 */
public class ServicioAutor {
 
    public Autor buscarAutorPorNombre(String nombre) {
    for (Autor autor : new ControladoraPersistencia().listadeAutor()) {
        if (autor.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
            return autor;
        }
    }
    return null; // Si no se encuentra un autor con el nombre buscado, devolvemos null
}
    
    
}
