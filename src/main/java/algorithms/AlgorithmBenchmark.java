package algorithms;

import utils.Benchmark;

public interface AlgorithmBenchmark {

    Benchmark findDeNovoChanges(String pedFilePath, String sourceFilePath, String outputDir);

    Benchmark findDeNovoChanges(String pedFile, double mutationEstimation, long maxAlgorithmDepth);

    String getAlgorithmName();
}
