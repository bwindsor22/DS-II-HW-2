import java.util.Arrays;
import java.util.List;

public class Problem1 {
    static void run0(List<Integer> ints) { // LOG(N)
        int sum = 0;
        for (int j = 0; j < ints.size(); j *= 2) {
            sum += j;
        }
    }

    static void run1(List<Integer> ints) { // N^2
        int sum = 0;
        for(int i = 0; i < ints.size(); i ++) {
            for (int j = 0; j < ints.size(); j ++) {
                sum += i + j;
            }
        }
    }
    static void run2(List<Integer> ints) {
        int sum = 0;
        for(int i = 0; i < ints.size(); i ++) {
            for (int j = 0; j < ints.size(); j ++) {
                for (int k = 0; j < ints.size(); k ++) {
                    for (int l = 0; j < ints.size(); l ++) {
                        sum += i + j + k + l;
                    }
                }
            }
        }
    }
    static void run3(List<Integer> ints) {
        int sum = 0;
        for(int i = 0; i < ints.size(); i ++) {
            for (int j = 0; j < ints.size(); j *= 2) { // NOTE *= 2
                sum += i + j;
            }
        }
    }
    static void run4(List<Integer> ints) {
        int sum = 0;
        for(int i = 0; i < ints.size(); i ++) {
            for (int j = 0; j < ints.size(); j ++) {
                sum += i + j;
            }
        }

        for(int i = 0; i < ints.size(); i ++) {
            for (int j = 0; j < ints.size(); j ++) {
                sum += i + j;
            }
        }


        for(int i = 0; i < ints.size(); i ++) {
            for (int j = 0; j < ints.size(); j ++) {
                sum += i + j;
            }
        }


        for(int i = 0; i < ints.size(); i ++) {
            for (int j = 0; j < ints.size(); j ++) {
                sum += i + j;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        run0(ints);
        run1(ints);
        run2(ints);
        run3(ints);
        run4(ints);
    }
}
