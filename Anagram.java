
import java.util.*;

public class Anagram {

  public static void main(String[] args){
     
      System.out.println("Helloworld");

      String a = "king";
      String b = "gnik";
           
      // String sorting1 = Arrays.sort(a);
      
      char tempArr1[] = a.toCharArray();

      char tempArr2[] = b.toCharArray();
    
      Arrays.sort(tempArr1);
      
      Arrays.sort(tempArr2);

     // a = new String(tempArr1);

     a = sortingString(tempArr1);
      
     // b = new String(tempArr2);

       b = sortingString(tempArr2);

      if(a.equals(b)){
           System.out.println("IS Anagram");
      }else{
           System.out.println("Not Anagram");   
      }

    // System.out.println("DATA ["+sortingString("STRING")+"]");

  }
     /**
      * Bubble sort to sort the given string from the user input data.
      */
     public static String sortingString(char dataArr[]){

         char tempArr[] = dataArr;         
         String s = new String(tempArr);
         char temp = 'a';        

         for(int i = 0;i<s.length()-1;i++){
              for(int j = 0; j< (s.length()-1) - i;j++){
                           if(tempArr[j]>tempArr[j+1]){
                              temp = tempArr[j];
                              tempArr[j] = tempArr[j+1];
                              tempArr[j+1] = temp;
                           }
              }
         }

        String data = new String(tempArr);

         return data;
     }

}