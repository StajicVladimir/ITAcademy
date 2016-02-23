
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vladimir
 */
/**
 * Klasa za zajebavanciju!
 * @author Vladimir
 */
public class program {
    public static void main(String[] args) {
        
        int target_tank_x = 4;
        int target_tank_y = 5;
        float target_tank_height = 2;
//        int target_tank_length = 3;
        int tankXP = 200;
        
        int projectile_x = 0;
        float projectile_y =0;
        int projectileDmg = 50;
        
        int hitCount=0;
        
        while (tankXP > 0 && projectile_y <=target_tank_height){
            if((projectile_x < target_tank_x) && (projectile_y>0 && projectile_y < target_tank_height))
                System.out.println("Jos nema sudara!!! Projektil je na x: " + projectile_x + " y: "+projectile_y+ 
                        " Tenk je na: " + target_tank_x + " y: " +target_tank_y);
            else{
                System.out.println("Sudar!!!!! na x poziciji: " + projectile_x + " y pos: "+projectile_y+
                        " tenk ima preostalo: " + (tankXP-=projectileDmg) + " Hit poena");
                projectile_x=0;
                projectile_y =0;
                hitCount++;
                
            }
            projectile_x+=3;
            projectile_y+=0.2;
            target_tank_x++;
            //target_tank_y++;
        }
        System.out.println("Tenk je pogodjen: " + hitCount + " puta");
        System.out.println("Ovo sam dodao samo da vidim radi li mi GIT kako treba");
            
//        projectile_x++;
//        System.out.println("Collision: " + (projectile_x>=target_tank_x));
//        
//        projectile_x++;
//        System.out.println("Collision: " + (projectile_x>=target_tank_x));
//        projectile_x++;
//        System.out.println("Collision: " + (projectile_x>=target_tank_x));
//        projectile_x++;
//        System.out.println("Collision: " + (projectile_x>=target_tank_x));
//        projectile_x++;
//        System.out.println("Collision: " + (projectile_x>=target_tank_x));
//        projectile_x++;
//        System.out.println("Collision: " + (projectile_x>=target_tank_x));
        
//        String njanja, lozinka = "Fanta82ns";
//        Scanner crevo = new Scanner(System.in);
//        
//        String unetaLozinka = crevo.nextLine();
//        
//        if (unetaLozinka.equals(lozinka) )
//            System.out.println("Uneta lozinka je ispravna!");
//        else
//            System.out.println("Nije uneta ispravna lozinka!");
//        System.out.println("Mnogo komplikovan program za sabiranje brojeva");
//        System.out.println("Unesite prvi broj: ");
//        int x = crevo.nextInt();
//        System.out.println("Unesite drugi broj: ");
//        int y = crevo.nextInt();
//        
//        System.out.println("Rezultat je: " + (x+y));
//        
//        int a=1;
//        
//        System.out.println(a);
        
//        System.out.println("Zdravo svete!!!");
//        System.out.print("Druga");
//        System.out.print("Treca");
//        System.out.print("Cetvrta");
        
    }
}
