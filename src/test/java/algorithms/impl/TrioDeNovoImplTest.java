package algorithms.impl;

import algorithms.AlgorithmBenchmark;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Benchmark;
import utils.Constants;

import static org.junit.jupiter.api.Assertions.*;

class TrioDeNovoImplTest
{

    private AlgorithmBenchmark algorithm;

    @BeforeEach
    void setUp()
    {
        algorithm = new DeNovoGearImpl();
    }

    @AfterEach
    void tearDown()
    {
    }

    @Test
    void findDeNovoChanges()
    {
        Benchmark result = algorithm.findDeNovoChanges("", "", "", "");

        assertTrue(result.getExecutionTime() > 0);
        assertEquals(result.getAlgorithmName(), algorithm.getAlgorithmName());
    }

    @Test
    void getAlgorithmName()
    {
        String name = algorithm.getAlgorithmName();

        assertEquals(name, Constants.TRIO_DE_NOVO);
    }

}