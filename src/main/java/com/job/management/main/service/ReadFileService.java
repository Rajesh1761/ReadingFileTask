package com.job.management.main.service;

import com.job.management.main.util.ReadingFileConstants;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReadFileService {

    String fileLocation = System.getProperty("user.dir")+File.separator;

    int counter = 0;

    public void readFile(String path) throws IOException {
        String fileName = path;
        int count = 1 ;
        if(!fileName.isEmpty()){
               try {
                BufferedReader br = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = br.readLine()) != null) {
                    try {
                        System.out.println(ReadingFileConstants.readingLine+count+ReadingFileConstants.postReadingLine);
                        System.out.println(line);
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count++;
                }

            } catch (IOException e) {
                   if(counter==0){
                       counter++;
                       createFile();
                   }
            }
        }else{
            throw new FileNotFoundException("File is not available on location ");
        }

    }
    private void createFile(){
        List<String> listOfDataInFile = new ArrayList<String>(30);
        for(int i = 0 ; i < 15 ; i++){
            listOfDataInFile.add(ReadingFileConstants.dataInFile);
        }
        try {
            Files.write(Paths.get(fileLocation+ReadingFileConstants.filePath),
                    listOfDataInFile,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            readFile(fileLocation+ReadingFileConstants.filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
