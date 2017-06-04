import algorithms.impl.TrioDeNovoImpl;
import utils.Benchmark;

public class Mbi {

    /**
     * @param args 0 - nazwa pliku wejsciowego, 1 - wybor metody
     */
    public static void main(String[] args) {
        Benchmark benchmark = new TrioDeNovoImpl().findDeNovoChanges("asd");
        System.out.println(benchmark.getAlgorithmName() + ": " + benchmark.getExecutionTime() + " ms.");

        // TODO do ustalenia jak maja byc prezentowane wyniki wykonania programu
    }
}
