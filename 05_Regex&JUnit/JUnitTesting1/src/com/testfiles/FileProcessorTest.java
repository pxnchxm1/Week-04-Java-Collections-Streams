package com.testfiles;
import org.junit.jupiter.api.*;

import com.test.FileProcessor;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    FileProcessor fileProcessor = new FileProcessor();
    final String testFile = "testfile.txt";

    @Test
    void testWriteAndReadFile() {
    	  String content = "Hello, File!";
          fileProcessor.writeToFile(testFile, content);
          String result = fileProcessor.readFile(testFile);
          assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWrite() {
        fileProcessor.writeToFile(testFile, "Checking file presence");
        File file = new File(testFile);
        assertTrue(file.exists());
    }

    @Test
    void testReadFile_FileDoesNotExist() {
        String result = fileProcessor.readFile("definitely_missing_file.txt");
        assertEquals("", result);
    }

    @AfterEach
    void cleanup() {
        File file = new File(testFile);
        if (file.exists()) {
            file.delete();
        }
    }
}
