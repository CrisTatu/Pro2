public class ArrayLoop {
    public static void main(String [] args) {
		int [] list = { 23, 45, 32, 65, 22, 99, 1 };

        int minval = list[0];
        int maxval = list[0];
        int totalsum = 0;

        for(int i=0;i<list.length;i++){
            totalsum += list[i];

            if(list[i]>maxval){
                maxval = list[i];
            }
            if(list[i]<minval){
                minval = list[i];
            } 
        }
        double avgval = (double) totalsum / list.length;

        System.out.println("Min value = "+ minval);
        System.out.println("Max value = "+ maxval);
        System.out.println("Average value = "+ avgval);
        System.out.println("Total sum = "+ totalsum);

	}
}
