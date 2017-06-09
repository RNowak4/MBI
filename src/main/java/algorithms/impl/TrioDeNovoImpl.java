package algorithms.impl;

import algorithms.AlgorithmBenchmark;
import utils.Benchmark;
import utils.Constants;
import utils.ProgramOutputHelper;

import java.io.IOException;
import java.net.URL;

public class TrioDeNovoImpl implements AlgorithmBenchmark {
    private final static String TRIO_DE_NOVO_RESOURCE_NAME = "triodenovo";
    private final static String PED_ARG = "--ped";
    private final static String IN_ARG = "--in_vcf";
    private final static String OUT_ARG = "--out_vcf";

    public Benchmark findDeNovoChanges(String pedFilePath, String sourceFilePath, String outputDir) {
        final Benchmark benchmark = new Benchmark();
        long startTime, execTime;
        try {
            URL algorithm = getClass().getClassLoader().getResource(TRIO_DE_NOVO_RESOURCE_NAME);
            startTime = System.currentTimeMillis();

            Process process = new ProcessBuilder(algorithm.getFile(),
                                                 PED_ARG, pedFilePath,
                                                 IN_ARG, sourceFilePath,
                                                 OUT_ARG, outputDir + "/trio.denovo.vcf.out").start();
            execTime = System.currentTimeMillis() - startTime;

            final String programOutput = ProgramOutputHelper.getProgramOutput(process);
            benchmark.setProgramOutput(programOutput);
            benchmark.setExecutionTime(execTime);
            benchmark.setAlgorithmName(getAlgorithmName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return benchmark;
    }

    public Benchmark findDeNovoChanges(String pedFile, double mutationEstimation, long maxAlgorithmDepth) {
        return null;
    }

    public String getAlgorithmName() {
        return Constants.TRIO_DE_NOVO;
    }
}
