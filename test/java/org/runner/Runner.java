package org.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import schemasMicrosoftComVml.STTrueFalse;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\Feature\\Login.feature" }
,glue = {"StepDefentions"},tags = {"~@tag1,@tags2"},plugin = { "src\\Screenshots.json"})


public class Runner {

}
