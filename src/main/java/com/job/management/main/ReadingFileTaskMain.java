package com.job.management.main;

import com.job.management.main.controller.ReadFileController;
import com.job.management.main.util.ReadingFileConstants;

import java.io.File;
import java.io.IOException;

public class ReadingFileTaskMain {

    public static void main(String[] args) throws IOException {
        ReadFileController controller = new ReadFileController();
        controller.setFilePath(ReadingFileConstants.filePath);
        controller.readFile();

    }
}
