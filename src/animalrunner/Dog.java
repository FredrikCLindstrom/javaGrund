/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalrunner;

/**
 *
 * @author lindstrom
 */
public class Dog implements Animal, Pet{
    @Override
    public void noise(){
        
        System.out.println("Voof");
    }

    @Override
    public void klappa() {
        System.out.println("klappar hunden");
    }
    
}
