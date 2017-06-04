package algorithms;

import utils.Benchmark;

public interface AlgorithmBenchmark {

    String getAlgorithmName();

    Benchmark findDeNovoChanges(String pedFile);

    Benchmark findDeNovoChanges(String pedFile, double mutationEstimation, long maxAlgorithmDepth);
}
