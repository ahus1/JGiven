package com.tngtech.jgiven.integration.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tngtech.jgiven.integration.spring.SpringScenarioTest;
import com.tngtech.jgiven.integration.spring.config.TestSpringConfig;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( classes = TestSpringConfig.class )
public class SpringScenarioTestTest extends SpringScenarioTest<SimpleTestSpringSteps, SimpleTestSpringSteps, SimpleTestSpringSteps> {

    @Test
    public void spring_can_inject_beans_into_stages() {
        given().a_step_that_is_a_spring_component();
        when().methods_on_this_component_are_called();
        then().beans_are_injected();
    }
}
