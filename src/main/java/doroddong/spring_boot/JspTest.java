package doroddong.spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspTest {

    @RequestMapping("/test")
    private String jspTest(){
        return "test"; //생성한 jsp명 (test.jsp)
    }
}
