import spock.lang.Specification


class PrimeFactorsTest extends Specification {

    def "return prime factors of integer input"() {
        expect:
            primeFactors(input) == result
        where:
        input | result
        1     | []
        2     | [2]
        3     | [3]
        4     | [2, 2]
        5     | [5]
        6     | [2, 3]
        7     | [7]
        8     | [2, 2, 2]
        9     | [3, 3]
        10    | [2, 5]
        11    | [11]
        13    | [13]
        22    | [2, 11]

    }

    def primeFactors(int input) {
        return PrimeFactors.generate(input)
    }

}