package co.edu.poli.ces3.universitas.utils;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class RandomBigIntegerGenerator {
    private static final SecureRandom random = new SecureRandom();
    private static final Set<BigInteger> generatedNumbers = new HashSet<>();

    public static BigInteger generateUniqueBigInteger(int bitLength) {
        BigInteger number;
        do {
            number = new BigInteger(bitLength, random);
        } while (generatedNumbers.contains(number));

        generatedNumbers.add(number);
        return number;
    }

}
