package com.java;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class IsPresentInFile {

    public IsPresentInFile() throws IOException{
    }
    public boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);

        // read the file line by line
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.contains(str)){
                return true;
            }
        }
        scanner.close();
        return false;
}
@Test
public void readFile() throws FileNotFoundException{
    String path = "/Users/julialukas/IdeaProjects/juliahacksjava/data.json";
    Assert.assertTrue(findStringInFile(path, "Live JSON generator"));
    }
}