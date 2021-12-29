
import java.util.*;

public class SortingList {

  public static void main(String[] args){
    
    String value = "i am java developer inn softwware company";

    System.out.println("Sorting list");

    String[] list =  value.split("\\s+");

    System.out.println("Size of :["+list.length+"]");

    for(int i=0;i<list.length;i++){
       list[i] =  list[i].replaceAll("[^\\w]","");
    } 

     System.out.println("Size of :["+list.length+"]");

    Arrays.sort(list,Collections.reverseOrder());

      for(int i=0;i<list.length;i++){
           System.out.println("string :["+list[i]+"]");
        } 
  }
}