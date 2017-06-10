package algorithms.impl;

import algorithms.AlgorithmBenchmark;
import utils.Benchmark;
import utils.Constants;
import utils.ProgramOutputHelper;

import java.io.IOException;
import java.net.URL;

public class DeNovoGearImpl implements AlgorithmBenchmark {
    private final static String RESOURCE_NAME = "denovogear";
    private final static String OPTIONS = "auto dnm";
    private final static String PED_ARG = "--ped";
    private final static String IN_ARG = "--in_vcf";

    public Benchmark findDeNovoChanges(String pedFilePath, String sourceFilePath,
                                       String outputDir, String referenceFilePath) {
        final Benchmark benchmark = new Benchmark();
        long startTime, execTime;
        try {
            URL algorithm = getClass().getClassLoader().getResource(RESOURCE_NAME);
            startTime = System.currentTimeMillis();

            Process process = new ProcessBuilder(algorithm.getFile(), OPTIONS,
                                                 PED_ARG, pedFilePath,
                                                 IN_ARG, sourceFilePath).start();
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

    public String getAlgorithmName() {
        return Constants.DE_NOVO_GEAR;
    }

}