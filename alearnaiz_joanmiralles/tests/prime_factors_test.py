import unittest

from ..src.prime_factors import PrimeFactors


class PrimeFactorsTest(unittest.TestCase):

    def test_generate_one__should_be_empty(self):
        primes = PrimeFactors.generate(1)
        assert len(primes) == 0

    def test_generate_two__should_be_two(self):
        number = 2
        self.check_primes(number, 2)

    def test_generate_three__should_be_three(self):
        number = 3
        self.check_primes(number, 3)

    def test_generate_four__should_be_two(self):
        number = 4
        self.check_primes(number, 2)

    def test_generate_six__should_be_two_and_three(self):
        number = 6
        self.check_primes(number, 2, 3)

    def test_generate_eight__should_be_two(self):
        number = 8
        self.check_primes(number, 2)

    def test_generate_fourty_two__should_be_two_three_seven(self):
        number = 42
        self.check_primes(number, 2, 3, 7)

    def check_primes(self, number, *expected_primes):
        actual_primes = PrimeFactors.generate(number)
        assert len(expected_primes) == len(actual_primes)
        for prime in expected_primes:
            assert prime in actual_primes
