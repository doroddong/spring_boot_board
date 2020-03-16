package doroddong.spring_boot.board.mapper;

import doroddong.spring_boot.board.domain.CommentVO;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("doroddong.spring_boot.board.mapper.CommentMapper")
public interface CommentMapper {
    public int commentCount() throws Exception;

    public List<CommentVO> commentList() throws Exception;

    public int commentInsert(CommentVO comment) throws Exception;

    public int commentUpdate(CommentVO comment) throws Exception;

    public int commentDelete(int cno) throws Exception;
}
