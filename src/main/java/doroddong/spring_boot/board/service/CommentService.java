package doroddong.spring_boot.board.service;

import doroddong.spring_boot.board.domain.CommentVO;
import doroddong.spring_boot.board.mapper.CommentMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("doroddong.spring_boot.board.service.CommentService")
public class CommentService {

    @Resource(name="doroddong.spring_boot.board.mapper.CommentMapper")
    CommentMapper commentMapper;

    public List<CommentVO> commentListService() throws Exception{
        return commentMapper.commentList();
    }

    public int commentInsertService(CommentVO comment) throws Exception{
        return commentMapper.commentInsert(comment);
    }

    public int commentUpdateService(CommentVO comment) throws Exception{
        return commentMapper.commentUpdate(comment);
    }

    public int commentDeleteService(int cno) throws Exception{
        return commentMapper.commentDelete(cno);
    }
}
