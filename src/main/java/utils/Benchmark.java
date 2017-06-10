package utils;

public class Benchmark {

    private long executionTime;
    private String programOutput;
    private String algorithmName;

    public long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    public String getProgramOutput() {
        return programOutput;
    }

    public void setProgramOutput(String programOutput) {
        this.programOutput = programOutput;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    @Override
    public String toString() {
        return "Benchmark{" +
                "executionTime=" + executionTime +
                ", programOutput='" + programOutput + '\'' +
                ", algorithmName='" + algorithmName + '\'' +
                '}';
    }
}
