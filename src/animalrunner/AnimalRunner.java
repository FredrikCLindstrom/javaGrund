
package animalrunner;

import java.util.ArrayList;


public class AnimalRunner {

    
    public static void main(String[] args) {
        Dog a=new Dog();
        Lion b = new Lion();
        
        ArrayList<Animal>animals= new ArrayList<>();
        animals.add(a);
        animals.add(b);
        for (Animal animal : animals) {
            animal.noise();
        }
        double k=7;
        int c=(int)k;
        System.out.println(c);
    }
    
}
