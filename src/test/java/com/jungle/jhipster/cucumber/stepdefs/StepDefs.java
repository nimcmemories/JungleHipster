package com.jungle.jhipster.cucumber.stepdefs;

import com.jungle.jhipster.JungleHipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JungleHipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
