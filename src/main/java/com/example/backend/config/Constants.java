package com.example.backend.config;

public class Constants {
    private String DEVOPS = System.getenv("DEVOPS_IP");
    private String DB = System.getenv("DB_IP");
    private String USER = System.getenv("DB_USERNAME");
    private String PASS = System.getenv("DB_PASSWORD");

    public static final String FRONTEND_URL = "http://"+ DEVOPS + ":8080";
}
