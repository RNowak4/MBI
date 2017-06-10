package algorithms.impl;

import algorithms.AlgorithmBenchmark;
import org.broadinstitute.gatk.engine.CommandLineGATK;
import utils.Benchmark;
import utils.Constants;

public class PhaseByTransmissionImpl implements AlgorithmBenchmark {
    private final static String ALGORITHM_NAME_ARG = "-T";
    private final static String PHASE_BY_TRANSMISSION = "PhaseByTransmission";
    private final static String IN_ARG = "-V";
    private final static String PED_ARG = "-ped";
    private final static String OUTPUT_FILE_ARG = "-o";
    private final static String OUTPUT_FILE_NAME = "phaseByTransmission.vcf";
    private final static String REFERENCE_FILE_ARG = "-R";
    private final static String REFERENCE_FILE_NAME = "/home/radek/data.fasta";

    public Benchmark findDeNovoChanges(String pedFilePath, String vcfFilePath, String outputDir) {
        final Benchmark benchmark = new Benchmark();
        final String[] args = {ALGORITHM_NAME_ARG, PHASE_BY_TRANSMISSION,
                IN_ARG, vcfFilePath,
                PED_ARG, pedFilePath,
                OUTPUT_FILE_ARG, outputDir + "/" + OUTPUT_FILE_NAME,
                REFERENCE_FILE_ARG, REFERENCE_FILE_NAME};

        long startTime = System.currentTimeMillis();
        CommandLineGATK.main(args);
        long execTime = System.currentTimeMillis() - startTime;

        benchmark.setAlgorithmName(getAlgorithmName());
        benchmark.setExecutionTime(execTime);
        return benchmark;
    }

    public Benchmark findDeNovoChanges(String pedFile, double mutationEstimation, long maxAlgorithmDepth) {
        return null;
    }

    public String getAlgorithmName() {
        return Constants.PHASE_BY_TRANSMISSION;
    }

}