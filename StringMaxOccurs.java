
import java.util.*;

public class StringMaxOccurs {
 
  public static void main(String[] args){
      System.out.println("Helloworld");

      StringOccurs object = new StringOccurs();
      System.out.println("Number of ocurrens : "+object.occursOfCharType1("Hellow",'l'));

      System.out.println("Number of occurs : "+object.occursofCharType2("sachin Tendulkar",'n'));

      object.occursOfCharType3UI();

  }

  public static class StringOccurs {
  
    public int occursOfCharType1(String s,char search){    
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==search){
               count++;
            }
        }
        System.out.println("Count "+count);
        return count;
    }    

    public int occursofCharType2(String s, char search){
        return s.length() - s.replace("a","").length();
    }

    public void occursOfCharType3UI(){

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Input String :");
       String str = sc.nextLine();
       System.out.println("Enter Search charactor String :");
       char search = sc.next().charAt(0);
       occursOfCharType1(str,search);
    }

}


}