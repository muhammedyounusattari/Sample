package com.sample.sample.restcontrollers.extended;

import com.sample.sample.restcontrollers.core.RolepermissionControllerTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, properties = "spring.profiles.active=test")
public class RolepermissionControllerTestExtended extends RolepermissionControllerTest {
    //Add your custom code here
}
