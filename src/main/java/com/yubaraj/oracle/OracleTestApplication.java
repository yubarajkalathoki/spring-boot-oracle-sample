package com.yubaraj.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class OracleTestApplication {
    private static  final Logger LOGGER = LoggerFactory.getLogger(OracleTestApplication.class);
    public static void main(String[] args) {
        LOGGER.info("Starting application.");
	      SpringApplication.run(OracleTestApplication.class, args);
    }
}
