package doroddong.spring_boot;

import doroddong.spring_boot.board.mapper.BoardMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class JspTest {

    @Resource(name="doroddong.spring_boot.board.mapper.BoardMapper")
    BoardMapper mBoardMapper;

    @RequestMapping("/test")
    private String jspTest() throws Exception {
        int temp =mBoardMapper.boardCount();
        System.out.println(temp);
        return "test"; //생성한 jsp명 (test.jsp)
    }
}
