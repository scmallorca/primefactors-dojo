class PrimeFactors {

    def static generate(int input) {
        def result = []
        int remaining = input
        for (int candidate = 2; candidate <= input; candidate++) {
            while (isDivisible(remaining, candidate)) {
                result << candidate
                remaining /= candidate
            }
        }
        return result
    }

    private static boolean isDivisible(int remaining, int candidate) {
        return remaining % candidate == 0
    }

}
