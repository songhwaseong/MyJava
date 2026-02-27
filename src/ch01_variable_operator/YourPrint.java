package ch01_variable_operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class YourPrint {
    static void main(String[] args) throws IOException {

        Supplier<Integer> k = () -> (int)Math.random();
        Consumer<Integer> a = (b) -> System.out.println(b);

        a.accept(1200);
        k.get();

    }
}
