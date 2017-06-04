package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProgramOutputHelper {

    public static String getProgramOutput(Process process) {
        final StringBuilder sb = new StringBuilder();
        try {
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
