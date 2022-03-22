/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Timer {
    
    int oneHundredthsOfASec;
    int sec;
    
    public Timer(){
        
    }
    public Timer(int sec, int oneHundredthsOfASec){
        this.oneHundredthsOfASec = oneHundredthsOfASec;
        this.sec = sec;
    }
    
    public void advance(){
        
        if(oneHundredthsOfASec == 100){
            oneHundredthsOfASec = 0;
            sec++;
        }
        if(sec == 60){
            sec = 0;
        }
        oneHundredthsOfASec++;
        
    }
    
    public String toString(){
        if(sec <=9 && oneHundredthsOfASec <=9){
            return "0" + sec + ":0" + oneHundredthsOfASec;
        }  else if(sec<=9 && oneHundredthsOfASec > 9){
            return "0" + sec + ":" + oneHundredthsOfASec;
        }  else if(sec > 9 && oneHundredthsOfASec <= 9){
            return sec + ":0" + oneHundredthsOfASec;
        } else{
            return sec + ":" + oneHundredthsOfASec;
        }
        
    }
    
}
//if sec <9 it needs a 0
//if oneHundredths <9 it needs a 0

