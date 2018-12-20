package com.kubilay.iskatmani;

public class IcIceFor {

    public void soru1(){
        for (int x=1;x<=5;x++){
            for (int y=1;y<=3;y++){
              System.out.println(x+"---"+y);
            }
        }
    }
    public void soru2(){
        for (int x=1;x<=3;x++){
            for(int y=1;y<=5;y++){
                System.out.println(y);
            }
            System.out.println("-------");
        }
    }
    public void soru3(){
        for (int x=1;x<=4;x++){
            for(int y=5;y>=1;y--){
                System.out.println(y);
            }
            System.out.println("-------");
        }
    }
    public void soru4(){
        for (int x=1;x<=5;x++){
            for(int y=4;y>=1;y--){
                System.out.println(x);
            }
            System.out.println("-------");
        }
    }
    public void soru5(){
        for (int x=1;x<=15;x++){
            for (int y=1;y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void soru6(){
        for (int x=1;x<=3;x++){
            for (int y=1;y<=5;y++){
                System.out.println(x*y);
            }
        }
    }
    public void soru7(){
        int b=4;
        for(int x=1;x<=5;x++){
            for(int t=1;t<=b;t++){
                System.out.print(" ");
            }
            for(int y=1;y<=2*x-1;y++){
                System.out.print("+");
            }
            for(int t=1;t<=b;t++){
                System.out.print(" ");
            }
            System.out.println();
            b=b-1;
        }

    }

}
