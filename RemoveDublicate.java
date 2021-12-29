
import java.util.*;

public class RemoveDublicate {

  public static void main(String[] args){
  
    System.out.println("Remove Dublicate");

    int a[] = new int[]{1,2,2,3,3,5,6,777,4,4,23,22};
    
    int b[] = new int[12];

 //   System.out.println("Length : ["+a.length+"]");

    int k=0;
    for(int i=0;i<a.length-1;i++){
       if(a[i]!=a[i+1]){
           b[k] = a[i];
           k++;
       }
    }
    
  //   System.out.println("Length : ["+b.length+"]");

      for(int j=0;j<k;j++){
           System.out.println("Length : ["+b[j]+"]");
      }
  }
}