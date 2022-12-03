package collection;

import java.lang.Math;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> output = new ArrayList<>();
    for(int i=0 ; i<input.size() ; i++){
      double x = input.get(i);
      output.add(Math.pow(((x * 2) + 3),5));
    }
    return output;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    List<String> output = new ArrayList<>();
    
    
    for(int i=0 ; i<input.size() ; i++){
      String text = input.get(i);
      if (text.length() == 1){
        text=text.toUpperCase();
      }else if(text.length() == 0){
        
      }else{
        String firstLetter = text.substring(0, 1).toUpperCase();
        text = firstLetter+text.substring(1);
      }
      //text = text+text;
      output.add(text+text);
    } 
    return output;
  }

}
