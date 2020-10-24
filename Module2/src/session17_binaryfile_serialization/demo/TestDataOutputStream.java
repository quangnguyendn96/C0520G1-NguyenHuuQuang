package session17_binaryfile_serialization.demo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {
    public static void main(String[] args) {

        int a[] = {2, 3, 4, 5, 6, 7};
        try {
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);

            for (int i = 0; i < a.length; i++) {
                dout.writeInt(a[i]);
                dout.close();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
