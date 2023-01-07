import java.util.Arrays;

class SumOfMultiples {

    private final int[] set;
    private final int number;

    SumOfMultiples(int number, int[] set) {
        this.set = set;
        this.number = number;
    }

    int getSum() {

        return Arrays.stream(set)
          .filter(value -> value != 0)
          .map(operand -> number / operand)
          .distinct()
          .map(operand -> operand)
          .sum();
    }



}
