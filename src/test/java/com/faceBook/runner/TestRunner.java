package com.faceBook.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\MJ\\eclipse-workspace\\list\\FacebookProject\\src\\test\\resources\\",
                                     glue = "com.faceBook",
                                     dryRun = false,
                                     monochrome = true,
                                     plugin = {"html:target/html", "json:target/report.json"},
                                    tags = "@onedimlist and @infoinonedimlist"  )
public class TestRunner {

}
