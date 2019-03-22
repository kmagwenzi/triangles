package com.kmagwenzi.models;

import java.util.Scanner;

public abstract class Triangle {
    int size;
    String orientation;
    String character;

    Scanner scan = new Scanner(System.in);

    public abstract void setTriangleData();
    public abstract void draw();
    public abstract void subMenuHeader();



    public void setSize() {
        System.out.print("\nPlease enter tringle size: ");
        int size = scan.nextInt();
        this.size = size;
        //System.out.print("this.size = " + this.size);
    }

    public void setOrientation() {
        System.out.println("\nPlease select triangle orientation: ");
        System.out.println("\t 1 - Right Angle");
        System.out.println("\t 2 - Isosceles");
        System.out.println();

        System.out.print("selection: ");
        int selection = scan.nextInt();


        switch (selection){
            case 1:
                this.orientation = "Right-Angle";
            break;

            case 2:
                this.orientation = "Isosceles";
            break;
        }

       // System.out.print("this.orientation = " + this.orientation);
    }

    public void setCharacter(){
        System.out.print("\nPlese enter tringle charater: ");
        String character = scan.next();
        //String character = "\u25b2";
        this.character = character;
        //System.out.print("this.character = " + this.character);
    }



}
