/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author Vladimir
 */
public class Interfejs {
    public int meni(){
        Scanner s = new Scanner(System.in);
        System.out.println("1. Novi\n2. Brisi\n3. Edit\n4. Prikazi Sve\n5. Filter\n6. Exit");
        System.out.print("Unesite vas izbor: ");
        return Integer.parseInt(s.nextLine());
    }
}
