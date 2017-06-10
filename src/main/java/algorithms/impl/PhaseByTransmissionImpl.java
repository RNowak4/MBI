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
    private final static String OUT_ARG = "-o";
    private final static String OUT_NAME = "phaseByTransmission.vcf.out";
    private final static String REFERENCE_ARG = "-R";

    public Benchmark findDeNovoChanges(String pedFilePath, String vcfFilePath,
                                       String outputDir, String referenceFilePath) {
        final Benchmark benchmark = new Benchmark();
        final String[] args = {ALGORITHM_NAME_ARG, PHASE_BY_TRANSMISSION,
                               IN_ARG, vcfFilePath,
                               PED_ARG, pedFilePath,
                               OUT_ARG, outputDir + "/" + OUT_NAME,
                               REFERENCE_ARG, referenceFilePath};

        long startTime = System.currentTimeMillis();
        CommandLineGATK.main(args);
        long execTime = System.currentTimeMillis() - startTime;

        benchmark.setAlgorithmName(getAlgorithmName());
        benchmark.setExecutionTime(execTime);
        return benchmark;
    }

    public String getAlgorithmName() {
        return Constants.PHASE_BY_TRANSMISSION;
    }

}