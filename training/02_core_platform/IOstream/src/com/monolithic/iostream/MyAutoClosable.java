package com.monolithic.iostream;

import java.io.IOException;

public class MyAutoClosable implements AutoCloseable {
    public void saySomething() throws IOException {
        throw new IOException("Exception thrown from saySomething();");
//        System.out.println("Something");
    }

    @Override
    public void close() throws IOException {
        throw new IOException("Exception thrown from close();");
//        System.out.println("close");
    }
}
