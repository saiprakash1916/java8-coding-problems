package commonQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondLargest {

    static Integer secondLargetUsingJava8(List<Integer> list){
        return list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    static int secondLargestNumber(List<Integer> list){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : list){
            if(num > first){
                second = first;
                first = num;
            }else if(num > second && num != first){
                second = num;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 4, 45, 99);

        System.out.println(secondLargestNumber(list));
        System.out.println(secondLargetUsingJava8(list));
    }
}
