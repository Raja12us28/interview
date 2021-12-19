import java.io.*;
import java.util.*;
import java.util.Collections;
public class WordSplitRegex{

 public static void main(String[] args){
     System.out.println("WordSplitRegex");

     String sentance = "i am a java, program";
     String[] value = sentance.split("\\s+");
     System.out.println("Size : "+value.length);
     
     for(int i=0;i<value.length;i++){  
       System.out.println("WORD :"+i+value[i]);
       value[i] = value[i].replaceAll("[^\\w]","");
       System.out.println("WORD :"+i+value[i]);
     }

     Arrays.sort(value, Collections.reverseOrder());

      System.out.println("After Sorting Asending");

      for(int i=0;i<value.length;i++){  
       System.out.println("WORD :"+i+value[i]);
     }

 }

}