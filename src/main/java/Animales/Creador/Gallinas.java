/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales.Creador;

import Animales.Herbivoro;

/**
 *
 * @author e30ri
 */
public class Gallinas extends Herbivoro {
    protected String huevos;
    protected String polloComestible;
    
    public Gallinas(String comida, String nombre, Integer edad) {
        super(comida, nombre, edad);
    }
    
}
