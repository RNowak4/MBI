package algorithms;

import utils.Benchmark;

public interface AlgorithmBenchmark {

    String getAlgorithmName();

    Benchmark findDeNovoChanges(String pedFilePath, String vcfFilePath, String outputDir);

    Benchmark findDeNovoChanges(String pedFile, double mutationEstimation, long maxAlgorithmDepth);
}
