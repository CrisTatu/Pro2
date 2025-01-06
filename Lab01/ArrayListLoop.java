import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLoop {
    public static void main(String [] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(23,45,32,65,22,99,1));

    int minvalue = list.get(0);
    int maxvalue = list.get(0);
    int totalvalue = 0;
    
    for (int i=0;i<list.size();i++){
      totalvalue += list.get(i);
      
      if(list.get(i)>maxvalue){
        maxvalue = list.get(i);
      }
      if(list.get(i)<minvalue){
        minvalue = list.get(i);
      }
    }
    double avg = (double) totalvalue / list.size();

    System.out.println("Minimum Value: " + minvalue);
    System.out.println("Maximum Value: " + maxvalue);
    System.out.println("Average Value: " + avg);
    System.out.println("Total (Sum) of all values: " + totalvalue);

	}
}