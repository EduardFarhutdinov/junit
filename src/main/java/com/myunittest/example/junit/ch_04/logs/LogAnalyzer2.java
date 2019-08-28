package com.myunittest.example.junit.ch_04.logs;

public class LogAnalyzer2 {
    private WebService webService;
    private EmailService emailService;

    public LogAnalyzer2(WebService webService, EmailService emailService) {
        this.webService = webService;
        this.emailService = emailService;
    }

    public void analyze(String fileName){
        if (fileName.length() < 8){
            try {
                webService.logError("Filename too short : " + fileName);
            }catch (Exception e ){
                emailService.sendEmail("admin@logan.com","Failure",e.getMessage());
            }
        }
    }
}
