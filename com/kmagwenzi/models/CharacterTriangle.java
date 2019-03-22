package com.kmagwenzi.models;

public class CharacterTriangle  extends Triangle {

    CharacterTriangle ct;


    @Override
    public void setTriangleData() {

        this.setSize();
        this.setOrientation();
        this.setCharacter();
    }

    @Override
    public void subMenuHeader() {
        System.out.println("--- Character Triangle ---");
        System.out.println("------------------------------------------------------------------");
    }

    @Override
    public void draw() {

        String line = this.character;

        System.out.println();

        switch(this.orientation){
            case "Right-Angle":
                for (int i = 0; i < this.size; i++){

                    System.out.println(line);
                    line = line + this.character;

                }
            break;

            case "Isosceles":

                int gapLength = this.size - 1;
                String gap = " ";

                for (int i = 0; i < this.size; i++ ){

                    for (int j = 0; j<gapLength; j++){
                        gap = gap + " ";
                    }

                    System.out.println(gap+line);

                    line = line + this.character + this.character;
                    gap = " ";
                    gapLength = gapLength - 1;

                }
            break;

        }

    }
}
