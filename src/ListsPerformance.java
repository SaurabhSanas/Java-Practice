import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListsPerformance {

    public static void main(String[] args) throws Exception{
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i < 10000; i++){
            list1.add(i);
        }

        List<Integer> list2 = new LinkedList<Integer>();
        for(int i = 0; i < 10000; i++){
            list2.add(i);
        }

        double ArrayListTime = estimatePerformance(list1);
        double LinkedListTime = estimatePerformance(list2);

        System.out.println("Linked list is faster than arraylist by " + (ArrayListTime - LinkedListTime));

    }

    public static double estimatePerformance(List<Integer> list){
        double startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++){
            list.add(list.size()/2, 1);
        }
        double endTime = System.nanoTime();
        return endTime - startTime;
    }
}
