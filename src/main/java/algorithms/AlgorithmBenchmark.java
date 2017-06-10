package algorithms;

import utils.Benchmark;

public interface AlgorithmBenchmark {

    Benchmark findDeNovoChanges(String pedFilePath, String sourceFilePath,
                                String outputDir, String referenceFilePath);

    String getAlgorithmName();
}
