import java.io.*;
import java.util.*;

class StringDublicate{

    public static void main(String[] args){

      System.out.println("StringDublicate");

      String s = "Find the dublicate string from given String ";

      char[] stringData = s.toCharArray();

      for(int i=0;i<stringData.length;i++){
          
         int count = 1; 

         for(int j = i+1; j< stringData.length;j++){

                 if(stringData[i] == stringData[j] && stringData[j] != ' '){
                    count++;
                    stringData[j] = '0';
                 }       
          
         }
         
         if(count > 1 && stringData[i]!='0' )
            System.out.println("Dublicate["+stringData[i]+"]");
      }
       
    }

}