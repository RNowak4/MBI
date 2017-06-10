import utils.AlgorithmRunner;
import utils.Benchmark;

import java.util.List;

public class MBI {
    private static final AlgorithmRunner algorithmRunner = new AlgorithmRunner();

    /**
     * @param args 0 - wybor metody,
     *             1 - nazwa pliku wejsciowego ped,
     *             2 - nazwa pliku wejsciowego vcf,
     *             3 - folder pliku wyjsciowego
     */
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Za malo parametrow wywolania programu!");
        } else {
            final String methodId = args[0];
            final String pedFilePath = args[1];
            final String sourceFilePath = args[2];
            final String outputDir = args[3];

            final List<Benchmark> benchmarks = algorithmRunner.runBenchmarks(methodId, pedFilePath, sourceFilePath, outputDir);
            for (Benchmark benchmark : benchmarks) {
                System.out.println(benchmark);
            }
        }
    }
}
