import algorithms.impl.TrioDeNovoImpl;
import utils.Benchmark;

public class Mbi {

    /**
     * @param args 0 - nazwa pliku wejsciowego, 1 - wybor metody
     */
    public static void main(String[] args) {
        if(args.length < 3) {
            System.out.println("Za malo parametrow wywolania programu!");
        } else {
            final String pedFilePath = args[0];
            final String vcfFilePath = args[1];
            final String outputDir = args[2];

            Benchmark benchmark = new TrioDeNovoImpl().findDeNovoChanges(pedFilePath, vcfFilePath, outputDir);
            System.out.println(benchmark.getAlgorithmName() + ": " + benchmark.getExecutionTime() + " ms.");

            // TODO do ustalenia jak maja byc prezentowane wyniki wykonania programu
        }
    }
}
