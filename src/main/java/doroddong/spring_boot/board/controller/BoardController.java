package doroddong.spring_boot.board.controller;

import doroddong.spring_boot.board.domain.BoardVO;
import doroddong.spring_boot.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class BoardController {
    @Resource(name="doroddong.spring_boot.board.service.BoardService")
    BoardService boardService;

    //게시판 리스트 화면 호출
    @RequestMapping("/list")
    private  String boardList(Model model) throws Exception{
        model.addAttribute("list",boardService.boardListService());
        return "list";  //생성할 jsp
    }
    @RequestMapping("/detail/{bno}")
    private String boardDetail(@PathVariable int bno, Model model) throws Exception{
        model.addAttribute("detail",boardService.boardDetailService(bno));
        return "detail";
    }

    @RequestMapping("/insert")   //게시글 작성폼 호출
    private String boardInsertForm(){
        return "insert";
    }

    @RequestMapping("/insertProc")
    private String boardInsertProc(HttpServletRequest request) throws Exception{
        BoardVO board=new BoardVO();

        board.setSubject(request.getParameter("subject"));
        board.setContent(request.getParameter("content"));
        board.setWriter(request.getParameter("writer"));

        boardService.boardInsertService(board);

        return "redirect:/list";
    }
    @RequestMapping("/update/{bno}") //게시글 수정폼 호출
    private String boardUpdateForm(@PathVariable int bno, Model model) throws Exception{
        model.addAttribute("detail",boardService.boardDetailService(bno));
        return "update";
    }

    @RequestMapping("/updateProc")
    private int boardUpdateProc(HttpServletRequest request) throws Exception{
        BoardVO board=(BoardVO) request.getParameterMap();
        return boardService.boardUpdateService(board);
    }
    @RequestMapping("/delete/{bno}")
    private String boardDelete(@PathVariable int bno) throws Exception{
        boardService.boardDeleteService(bno);
        return "redirect:/list";
    }
}
