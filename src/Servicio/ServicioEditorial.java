/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Controlador.Controladora;
import java.util.Scanner;

/**
 *
 * @author Facu
 */
public class ServicioEditorial {
    
    public void menu(){
      
        Scanner scanne = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("MENU");
            System.out.println("1.Búsqueda de un Autor por nombre.");
            System.out.println("2.Búsqueda de un libro por ISBN.");
            System.out.println("3.Búsqueda de un libro por Título.");
            System.out.println("4.Búsqueda de un libro/s por nombre de Autor.");
            System.out.println("5.Búsqueda de un libro/s por nombre de Editorial.");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanne.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opción 1");
                    buscarAutorXnombre();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    buscarLibroxISBN();
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3");
                    buscarLibroXtitulo();
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción 4");
                    buscarLibrosXautor();
                    break;
                case 5:
                    System.out.println("Has seleccionado la opción 5");
                    buscarLibrosXeditorial();
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
                    break;
            }
        }
        scanne.close();
    }
    
    public void buscarAutorXnombre(){
        System.out.print("Ingrese el nombre del autor: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre = leer.nextLine();
        ServicioAutor s = new ServicioAutor();
        System.out.println(s.buscarAutorPorNombre(nombre)); 
        
    } 
    
    public void buscarLibroxISBN(){
        System.out.print("Ingrese el ISBN del libro que desea buscar");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        long id = leer.nextLong();
        Controladora n = new Controladora();
        System.out.println(n.buscarLibro(id));
    }
    
    public void buscarLibroXtitulo(){
        ServicioLibro s = new ServicioLibro();
        System.out.print("Ingrese el Titulo del libro: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String titulo = leer.nextLine();
        System.out.println(s.buscarLibrosPorTitulo(titulo));
    }
    
    public void buscarLibrosXautor(){
        ServicioLibro s = new ServicioLibro();
        System.out.print("Ingrese el nombre del Autor para ver sus Libros: ");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre = leer.nextLine();
        System.out.println(s.buscarLibrosPorAutor(nombre));
    }
    
    public void buscarLibrosXeditorial(){
        ServicioLibro s = new ServicioLibro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el nombre de la Editorial: ");
        String editorial = leer.nextLine();
        System.out.println(s.buscarLibrosPoreEditorial(editorial));
        
    }
}

