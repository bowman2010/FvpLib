package FvpLib;


import FvpLib.Utils;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bowman
 */
public class Tester {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int i = kbd.nextInt();
        System.out.println("i="+i);
    }
}
