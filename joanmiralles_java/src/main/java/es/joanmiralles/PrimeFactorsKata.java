package es.joanmiralles;

import java.util.ArrayList;
import java.util.List;

class PrimeFactorsKata {

    static List<Integer> generate(int number) {
        return generateFrom(number, 2, new ArrayList<>());
    }

    private static List<Integer> generateFrom(int number, int cand, List<Integer> accummulated) {
        if (number <= 1) return accummulated;
        while (number % cand > 0) { cand++; }
        if (!accummulated.contains(cand)) accummulated.add(cand);
        return generateFrom(number / cand, cand, accummulated);
    }
}
