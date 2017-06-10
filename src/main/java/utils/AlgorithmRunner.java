package utils;

import algorithms.AlgorithmBenchmark;
import algorithms.impl.DeNovoGearImpl;
import algorithms.impl.PhaseByTransmissionImpl;
import algorithms.impl.TrioDeNovoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlgorithmRunner {
    private final static Map<String, AlgorithmBenchmark> algorithmsMap = new HashMap<>();

    static {
        algorithmsMap.put("1", new DeNovoGearImpl());
        algorithmsMap.put("2", new PhaseByTransmissionImpl());
        algorithmsMap.put("3", new TrioDeNovoImpl());
    }

    public List<Benchmark> runBenchmarks(String methodId, String pedFilePath, String sourceFilePath,
                                         String outputDir, String referenceFilePath) {
        final List<Benchmark> benchmarks = new ArrayList<>();

        if("0".equals(methodId)) {
            for (String key : algorithmsMap.keySet()) {
                benchmarks.add(runBenchmark(key, pedFilePath, sourceFilePath, outputDir, referenceFilePath));
            }
        } else {
            benchmarks.add(runBenchmark(methodId, pedFilePath, sourceFilePath, outputDir, referenceFilePath));
        }

        return benchmarks;
    }

    private Benchmark runBenchmark(String methodId, String pedFilePath, String sourceFilePath,
                                   String outputDir, String referenceFilePath) {
        final AlgorithmBenchmark algorithmsImpl = algorithmsMap.get(methodId);

        return algorithmsImpl.findDeNovoChanges(pedFilePath, sourceFilePath, outputDir, referenceFilePath);
    }
}
