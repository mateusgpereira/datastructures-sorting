import java.util.List;

public class BubbleSort {

    public static List<Integer> sort(List<Integer> input) {
        if (input.size() <= 1) {
            return input;
        }

        for (int i = 0; i < input.size(); i++) {
            int limit = input.size() - 1 - i;

            for (int j = 0; j < limit; j++) {
                int first = input.get(j);
                int second = input.get(j + 1);
                if (first > second) {
                    input.set(j, second);
                    input.set(j + 1, first);
                }
            }
        }
        return input;
    }
}
