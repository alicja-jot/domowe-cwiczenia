package osmy.exception.main;

import osmy.exception.io.FileReader;

public class ExceptionModuleRunner {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        fileReader.readFile();

    }
}
