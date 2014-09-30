/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomizer;

import java.util.Random;

/**
 *
 * @author Narasimha
 */
public class RandNumGenerator {
    
    Random rand = new Random();
    long START = 10000;
    long END = (long)(Math.pow(2, 63) - 1);
    
    public long showRandomInteger(long START, long END){
    
    
    long range = END - START + 1;
    // compute a fraction of the range, 0 <= frac < range
    long fraction = (long)(range * rand.nextDouble());
    long randomNumber =  (fraction + START);    
    return randomNumber;
  }
}
