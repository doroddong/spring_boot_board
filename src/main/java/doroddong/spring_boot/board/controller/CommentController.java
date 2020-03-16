package doroddong.spring_boot.board.controller;

import doroddong.spring_boot.board.domain.CommentVO;
import doroddong.spring_boot.board.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {

    @Resource(name="doroddong.spring_boot.board.service.CommentService")
    CommentService commentService;

    @RequestMapping("/list")
    @ResponseBody
    private List<CommentVO> commentServiceList(Model model) throws Exception{
        return commentService.commentListService();
    }

    @RequestMapping("/insert")
    @ResponseBody
    private int commentServiceInsert(@RequestParam int bno,@RequestParam String content) throws Exception{
        CommentVO comment=new CommentVO();
        comment.setBno(bno);
        comment.setContent(content);
        comment.setWriter("temp_writer");

        return commentService.commentInsertService(comment);
    }

    @RequestMapping("/update")
    @ResponseBody
    private int commentServiceUpdateProc(@RequestParam int cno,@RequestParam String content) throws Exception{
        CommentVO comment=new CommentVO();
        comment.setCno(cno);
        comment.setContent(content);

        return commentService.commentUpdateService(comment);
    }

    @RequestMapping("/delete/{cno}")
    @ResponseBody
    private int commentServiceDelete(@PathVariable int cno) throws Exception{
        return commentService.commentDeleteService(cno);
    }
}
