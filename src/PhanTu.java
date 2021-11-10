import java.io.*;
import java.util.*;

public class PhanTu <T extends Comparable<T>> {
    private T t;
    public boolean isGreaterThan(T obj) {
        return t.compareTo(obj) > 0;
    }

    public static void readWriteFile(String input, String output) throws IOException {
        File inPut = new File(input);
        FileReader fr = new FileReader(inPut);
        BufferedReader br = new BufferedReader(fr);

        String s = "";
        List<Integer> res = new ArrayList<Integer>();
        while (br.readLine() != null) {
            res.add(Integer.parseInt(s));
        }
        Collections.sort(res);
        File outPut = new File(output);
        FileWriter fw = new FileWriter(output);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Integer re : res) {
            s += re.toString() + " ";
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        String in = args[0];
        String out = args[1];
        readWriteFile(in, out);
    }
}
