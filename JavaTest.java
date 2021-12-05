import java.util.*;
class JavaTest {
    int x = 10;
   // HashMap<Integer,String>  hashmap = new HashMap<Integer,String>();
    public static void main(String[] args)
    {

      String val = "DJDFn difjdsf sdkfljsdf";
      int count = 0;
      for(int i=0;i<val.length();i++){

            if(val.charAt(i)!=' ')
            {
                count++;
            }
            
      }

      System.out.println("Total Char"+count);
     
    }
}

