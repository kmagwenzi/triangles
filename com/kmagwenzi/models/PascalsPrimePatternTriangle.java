package com.kmagwenzi.models;

public class PascalsPrimePatternTriangle extends Triangle {

    public static  PascalsPrimePatternTriangle getTriangleObject() {
        return new  PascalsPrimePatternTriangle();
    }

    @Override
    public void setTriangleData(){
        this.setSize();
        this.setOrientation();
        this.setCharacter();
    }

    @Override
    public void subMenuHeader(){
        System.out.println("-- Pascals Prime Pattern Triangle --");
        System.out.println("------------------------------------------------------------------");
    }

    public static boolean primeCheck(int n){    
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i < n/2; i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  

    @Override
    public void draw() {

        int[][] pascal  = new int[this.size+1][];

        // initialize first row
        pascal[1] = new int[1+2];
        pascal[1][1] = 1;

        // fill in Pascal's triangle
        for (int i = 2; i <= this.size; i++) {
            pascal[i] = new int[i+2];
            for (int j = 1; j < pascal[i].length - 1; j++)
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
        }


        switch(this.orientation){
            case "Right-Angle":
    
                // print results
                for (int i = 1; i <= this.size; i++) {
                    for (int j = 1; j < pascal[i].length - 1; j++) {
                        //System.out.print(pascal[i][j] + " ");
                        if(primeCheck(pascal[i][j])){
                            System.out.print(this.character);
                        }else{
                            System.out.print(" ");
                        }

                    }
                    System.out.println();
                }

             break;

            case "Isosceles":

                int gapLength = this.size - 1;
                String gap = " ";

                for (int i = 1; i < this.size; i++ ){

                    // Creating gap to order Isoceles
                    for (int j = 0; j<gapLength; j++){
                        gap = gap + " ";
                    }

                    System.out.print(gap);

                    for (int j = 1; j < pascal[i].length - 1; j++) {
                        //System.out.print(pascal[i][j] + " ");
                        if(primeCheck(pascal[i][j])){
                            System.out.print(this.character + " ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();

                    //line = line + this.character + this.character;
                    gap = " ";
                    gapLength = gapLength - 1;

                }
                break;

        }


    }
}
