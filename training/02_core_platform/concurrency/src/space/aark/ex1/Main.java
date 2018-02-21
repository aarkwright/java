package space.aark.ex1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        String[] inFiles = {"./file1.txt", "./file2.txt", "./file3.txt", "./file4.txt"};
        String[] outFiles = {"./file1.out.txt", "./file2.out.txt", "./file3.out.txt", "./file4.out.txt"};

        Thread[] threads = new Thread[inFiles.length];

        for (int i = 0; i < inFiles.length; i++) {
            Adder adder = new Adder(inFiles[i], outFiles[i]);
            adder.doAdd();

            // Multithreading
            Thread thread = new Thread(adder);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

    }
}
