package algorithms.impl;

import algorithms.AlgorithmBenchmark;
import utils.Benchmark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TrioDeNovoImpl implements AlgorithmBenchmark {

    public Benchmark findDeNovoChanges(String pedFile) {
        long startTime, execTime;
        try {
            startTime = System.currentTimeMillis();
            Process process = new ProcessBuilder("C:\\PathToExe\\MyExe.exe", "param1", "param2").start();
            execTime = System.currentTimeMillis() - startTime;
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Benchmark findDeNovoChanges(String pedFile, double mutationEstimation, long maxAlgorithmDepth) {
        return null;
    }
}
