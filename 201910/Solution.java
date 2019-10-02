import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Find the extension of given file names
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.

            AsscTableHelper.add(EXT, MT);
        }
        in.nextLine();

        List<String> filenameList = new ArrayList(Q);
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            System.err.println("FNAME = " + FNAME);
            filenameList.add(FNAME);
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
//        System.out.println("UNKNOWN");

        for (String filename : filenameList) {
//            System.out.println("filename = " + filename);

            String[] subs = filename.split("\\.");
            String ext = "";
            if (filename.endsWith(".")) {

            }
            else if (subs.length > 1) {
                ext = subs[subs.length - 1];
            }


            System.out.println(AsscTableHelper.get(ext.toLowerCase()));
        }
    }

}

/**
 * The association table helper class
 */
class AsscTableHelper {
    private static Map<String, String> table;


    public static void add(String k, String v) {
        if (table == null) {
            table = new HashMap<>();
        }

        if (k == null || v == null) {
            return;
        }

        table.put(k.toLowerCase(), v);
    }

    public static String get(String k) {
        if (k == null) {
//            System.out.println("get, k is null");
        }

        return table.get(k.toLowerCase()) == null ? "UNKNOWN" : table.get(k);
    }
}
