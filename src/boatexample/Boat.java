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
public class Boat {
    private String name;
    private Boolean sail;
    private int speed;
    
         
    public void goFast()
    {
      sail = true;  
      if(speed < 100)
      {
        speed = speed + 10; 
      }
      else
      {
          speed = 100;
      }
      
      System.out.println(name + " is raising the sail at the speed of " + speed + "mph");
    }  
    
   public void goSlow()
   {
       sail = false; 
       if(speed > 0)
       {
            speed = speed - 5; 
       }
       else
       {
            speed = 0; 
       }
       System.out.println(name + " is lowering the sail at the speed of " + speed + "mph");
   }
    
   public void whereIsTheSail()
    {
        if( sail = true)
        {
            System.out.println("sail is up");
        }
        else
        {
            System.out.println("sail is down");
        }
    }
   
   public void setName(String name)
   {
       this.name = name;
   }
    
}

