package utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmRunnerTest
{

    private AlgorithmRunner runner;

    @BeforeEach
    void setUp()
    {
        runner = new AlgorithmRunner();
    }

    @AfterEach
    void tearDown()
    {
    }

    @Test
    void runBenchmarksAll()
    {
        List<Benchmark> result = runner.runBenchmarks("0", "", "", "", "");

        assertEquals(result.size(), 3);
    }

    @Test
    void runBenchmarkDeNovoGear()
    {
        List<Benchmark> result = runner.runBenchmarks("1", "", "", "", "");

        assertEquals(result.size(), 1);
        assertEquals(result.get(0).getAlgorithmName(), Constants.DE_NOVO_GEAR);
    }

    @Test
    void runBenchmarkPhaseByTransmission()
    {
        List<Benchmark> result = runner.runBenchmarks("2", "", "", "", "");

        assertEquals(result.size(), 1);
        assertEquals(result.get(0).getAlgorithmName(), Constants.PHASE_BY_TRANSMISSION);
    }

    @Test
    void runBenchmarkTrioDeNovo()
    {
        List<Benchmark> result = runner.runBenchmarks("3", "", "", "", "");

        assertEquals(result.size(), 1);
        assertEquals(result.get(0).getAlgorithmName(), Constants.TRIO_DE_NOVO);
    }

}