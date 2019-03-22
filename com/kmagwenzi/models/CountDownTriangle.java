package com.kmagwenzi.models;

public class CountDownTriangle extends Triangle {

    public static CountDownTriangle getTriangleObject(){
        return new CountDownTriangle();
    }

    @Override
    public void setTriangleData(){

        this.setSize();
        this.setOrientation();

    }

    @Override
    public void draw() {

        String line = "";
        int value = 1;

        System.out.println();

        switch(this.orientation){
            case "Right-Angle":
                for(int i = 0; i < this.size; i++, value++){

                    // System.out.println(line);

                    line = Integer.toString(value);

                    for(int j=0; j<i; j++ ){
                        line = line + value;
                    }

                    System.out.println(line);
                    // line = line + this.character;

                }
                break;

            case "Isosceles":

                int gapLength = this.size - 1;
                String gap = " ";

                for (int i = 0; i < this.size; i++, value++){

                    for (int j = 0; j<gapLength; j++){
                        gap = gap + " ";
                    }

                    line = Integer.toString(value);

                    for(int j=0; j<i; j++ ){
                        line = line + value + value;
                    }

                    //System.out.println(line);

                    System.out.println(gap+line);

                    // line = line + this.character + this.character;
                    gap = " ";
                    gapLength = gapLength - 1;

                }
                break;

        }

    }

    @Override
    public void subMenuHeader() {

        System.out.println("-- Count Down Triangle --");
        System.out.println("------------------------------------------------------------------");
    }

}
