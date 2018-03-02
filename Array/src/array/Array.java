package array;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int namearr[] = new int[50];
        int i=0;
        int j=0;
         while(j<100){
             
             if(j%2!=0){
                 namearr[i]=j;
                 i=i++;
             }
             System.out.println(Arrays.toString(namearr));
             j++;
         }
      
    }
    
}
