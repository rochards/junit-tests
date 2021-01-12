package com.rochards.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class RuleTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {
        File created = folder.newFile("file.txt");

        assertTrue("Should have been created.", created.isFile());
        assertEquals("Temp folder and test file should match", folder.getRoot(), created.getParentFile());
    }
}
