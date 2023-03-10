package class31;

import class24.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {

        /*
        Path where we want to create the new file and the name of the file with its extension
         */

        String path="Files/test.properties";
        // We use FileOutputStream when we have to write the data in the file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        // Creating the object of the Properties class
        Properties properties=new Properties();
        // we use setProperty method to store data inside Properties files
        properties.setProperty("Name", "Anees");
        // A method to write the data to the disk
        properties.store(fileOutputStream,"A new name has been added");

    }
}

