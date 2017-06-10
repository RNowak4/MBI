import algorithms.impl.TrioDeNovoImpl;
import algorithms.impl.DeNovoGearImpl;
import algorithms.impl.PhaseByTransmissionImpl;
import utils.Benchmark;

public class MBI
{
    /**
     * @param args 0 - nazwa pliku wejsciowego,
     *             1 - wybor metody,
     *             2 - folder pliku wyjsciowego
     */
    public static void main(String[] args) {
        //if(args.length < 3) {
        //    System.out.println("Za malo parametrow wywolania programu!");
        //} else {
        //    String pedFilePath = args[0];
        //    String sourceFilePath = args[1];
        //    String outputDir = args[2];

            String pedFilePath = MBI.class.getClassLoader().getResource("data.ped").getPath();
            String sourceFilePath = MBI.class.getClassLoader().getResource("data.vcf").getPath();
            String outputDir = "/home/radek";

//            Benchmark benchmark = new TrioDeNovoImpl().findDeNovoChanges(pedFilePath, sourceFilePath, outputDir);
//        Benchmark benchmark = new DeNovoGearImpl().findDeNovoChanges(pedFilePath, sourceFilePath, outputDir);
        Benchmark benchmark = new PhaseByTransmissionImpl().findDeNovoChanges(pedFilePath, sourceFilePath, outputDir);
            System.out.println(benchmark.getAlgorithmName() + ": " + benchmark.getExecutionTime() + " ms.");

            // TODO do ustalenia jak maja byc prezentowane wyniki wykonania programu
        //}
    }
}
