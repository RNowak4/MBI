//import algorithms.impl.PhaseByTransmissionImpl;
//import utils.Benchmark;
//
//public class MbiTest {
//    /**
//     * @param args 0 - nazwa pliku wejsciowego,
//     *             1 - wybor metody,
//     *             2 - folder pliku wyjsciowego
//     */
//    public static void main(String[] args) {
//        String pedFilePath = MBI.class.getClassLoader().getResource("data.ped").getPath();
//        String sourceFilePath = MBI.class.getClassLoader().getResource("data.vcf").getPath();
//        String outputDir = "/home/radek";
//
////            Benchmark benchmark = new TrioDeNovoImpl().findDeNovoChanges(pedFilePath, sourceFilePath, outputDir);
////        Benchmark benchmark = new DeNovoGearImpl().findDeNovoChanges(pedFilePath, sourceFilePath, outputDir);
//        Benchmark benchmark = new PhaseByTransmissionImpl().findDeNovoChanges(pedFilePath, sourceFilePath, outputDir);
//        System.out.println(benchmark.getAlgorithmName() + ": " + benchmark.getExecutionTime() + " ms.");
//    }
//}
