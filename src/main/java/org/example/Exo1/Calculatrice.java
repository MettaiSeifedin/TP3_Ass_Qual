package org.example.Exo1;

public class Calculatrice {
    public int additionner(int a, int b) {
        result = a + b ;
        additionnerCounterCall ++;
        return result;
    }
    private int result ;
    private int additionnerCounterCall =0;
    public  int getState(){

        return additionnerCounterCall ;
    }

}
