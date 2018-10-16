/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combolockdriver;

/**
 *
 * @author anarc6700
 */
public class ComboLock {
    int number,number2,number3;
    int number122,number222,number322;
    boolean win,win2,win3;
    public ComboLock(){
        number = 0;
        number2= 0;
        number3 = 0;
    }
    
    public void setNumber(){
        number = 5; //(int)(Math.random() *3) +1;
    }
    public void setNumber2(){
        number2 =  (int)(Math.random() *3) +1;
    }
    public void setNumber3(){
        number3 =  (int)(Math.random() * 9) + 1;
    }
    public void setNumber122(int number4){
       number122 = number4;
       if(number122==number){
           win = true;
       }
    }
    public void setNumber222(int number5){
        number222 = number5;
         if(number222==number2){
           win2 = true;
       }else{
             win2 = false;
         }
    }
    public void setNumber322(int number6){
      number322 = number6;
        if(number322==number3){
           win3 = true;
       }else{
            win2 = false;
        }
    }
    
    public String toString() {
    String output = "Number 1: " + number + "\n";
           output += "Number 2: " + number2 + "\n";
           output+= "Number 3: " + number3 + "\n";
           output += "Guess 1: " + number122 + "\n";
           output += "Guess 2: " + number222 + "\n";
           output += "Guess 3: " + number322 + "\n";
           output += "Your first Guess was " + win +"\n";
           output += "Your first Guess was " + win +"\n";
           output += "Your first Guess was " + win +"\n";
    //output string is complete, return it
    return output;
}
}
