import java.io.*;
import java.util.*;

public class LongestWord {

  public static void main(String[] args){
       System.out.println("Longest Word in a string.");

        String sentance = "I love my india";
        int maxLength = 0;
        String word = "";
        String longestword = "";

        System.out.println("WORD LEN ["+countWords(sentance)+"]");

        for(int i=0;i<(sentance.length());i++){
            word = word + sentance.charAt(i);
            System.out.println("WORD ["+word+"]");
             if(sentance.charAt(i)== ' ' || i == sentance.length()-1){
                System.out.println("MAX LENGTH ["+maxLength+"]WORD LENGTH ["+word.length()+"]"); 
                if(word.length() >= maxLength){
                    maxLength =  (word.length());
                    longestword = word;
                }
                word = "";
             }
       
        }

        System.out.println("Longest Word Is : ["+longestword+"]");

  }
  
  public static int countWords(String s){
    String words[] = s.split(" ");
    int count = words.length; 
    return count;
  }

}