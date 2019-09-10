package com.job.management.main.controller;

import com.job.management.main.service.ReadFileService;
import com.job.management.main.util.ReadFileIInterface;

import java.io.IOException;

public class ReadFileController implements ReadFileIInterface {

    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void readFile() throws IOException {
        ReadFileService service = new ReadFileService();
        service.readFile(filePath);
    }
}
