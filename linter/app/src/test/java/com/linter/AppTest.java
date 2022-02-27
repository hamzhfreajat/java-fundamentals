/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.linter;

import org.junit.jupiter.api.Test;

import java.nio.file.FileSystems;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
@Test
    void readFile(){

    String path = String.valueOf(FileSystems.getDefault().getPath(System.getProperty("user.dir"), "/src/test/resources/test.js"));
    int err = App.fileReader(path);
    assertEquals(11 , err);
    }
}
