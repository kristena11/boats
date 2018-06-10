/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boatexample;
/**
 *
 * @author Kristen Albrecht
 */
public class BoatMain {
    public static void main(String[] args) 
    {
        Boat simpleBoat  = new Boat();
        simpleBoat.setName("Destiny");
        simpleBoat.goFast();   

        simpleBoat.goSlow();

        simpleBoat.whereIsTheSail();

        simpleBoat.goFast();

        simpleBoat.whereIsTheSail();

        simpleBoat.goFast(); 
                               
        
    }
    
}
