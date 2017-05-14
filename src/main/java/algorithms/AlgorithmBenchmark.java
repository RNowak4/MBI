package algorithms;

import utils.Benchmark;

public interface AlgorithmBenchmark {

    Benchmark findDeNovoChanges(String pedFile);

    Benchmark findDeNovoChanges(String pedFile, double mutationEstimation, long maxAlgorithmDepth);
}
