package com.myunittest.example.junit.ch_04.logs;

public class LogAnalyzer {
    private WebService webService;

    public LogAnalyzer(WebService webService){
        this.webService = webService;
    }

    public void analyze(String fileName){
        if(fileName.length() < 8){
            try {
                webService.logError("Filename too short:" + fileName);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }

    }
}
