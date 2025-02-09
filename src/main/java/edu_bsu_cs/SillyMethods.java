package edu_bsu_cs;

public class SillyMethods {
    public boolean didGuess42(int i){
        if(i == 42){
            return true;
        }
        else{
            return false;
        }

    }

    public String countTo(int i) {
        String counting = "";
        for(int a = 0; a <= i; a++){
            if(a < i) {
                counting = counting + Integer.toString(a) + " ";
            }
            else{
                counting = counting + Integer.toString(a);
            }

        }
        return counting;
    }
}



