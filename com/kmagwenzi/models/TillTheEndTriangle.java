package com.kmagwenzi.models;

public class TillTheEndTriangle extends Triangle {

    public static  TillTheEndTriangle getTriangleObject(){
        return new TillTheEndTriangle();
    }

    @Override
    public void setTriangleData() {
        
        this.setSize();
        this.setOrientation();


    }

    @Override
    public void subMenuHeader() {

        System.out.println("-- TillThe End Triangle Triangle --");
        System.out.println("------------------------------------------------------------------");
    }


    @Override
    public void draw() {

        String line = "";
        int value = 1;

        System.out.println();

        switch(this.orientation){
            case "Right-Angle":
                for(int i = 0; i < this.size; i++){

                    // System.out.println(line);

                    line = Integer.toString(value);
                    value++;

                    for(int j=1; j<=i; j++, value++){
                        line = line + value;
                    }

                    System.out.println(line);
                    line = "";
                    value = 1;

                    // line = line + this.character;

                }
                break;

            case "Isosceles":

                int gapLength = this.size - 1;
                String gap = " ";

                for (int i = 0; i < this.size; i++){

                    for (int j = 0; j<gapLength; j++){
                        gap = gap + " ";
                    }

                    line = Integer.toString(value);
                    //value++;
                    for(int j=1; j<=i; j++, value = value+2){
                        line = line + (value+1) + (value+2);
                    }

                    //System.out.println(line);

                    System.out.println(gap+line);

                    // line = line + this.character + this.character;
                    line = "";
                    value = 1;
                    gap = " ";
                    gapLength = gapLength - 1;

                }
                break;

        }

    }
}
