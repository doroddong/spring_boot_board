package doroddong.spring_boot.board.service;

import doroddong.spring_boot.board.domain.BoardVO;
import doroddong.spring_boot.board.domain.FileVO;
import doroddong.spring_boot.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("doroddong.spring_boot.board.service.BoardService")
public class BoardService {

    @Resource(name="doroddong.spring_boot.board.mapper.BoardMapper")
    BoardMapper boardMapper;

    public int boardCountService() throws Exception{
        return boardMapper.boardCount();
    }
    public List<BoardVO> boardListService() throws Exception{
        return boardMapper.boardList();
    }
    public BoardVO boardDetailService(int bno) throws Exception{
        return boardMapper.boardDetail(bno);
    }
    public int boardInsertService(BoardVO board) throws Exception{
        return boardMapper.boardInsert(board);
    }
    public int boardUpdateService(BoardVO board) throws Exception{
        return boardMapper.boardUpdate(board);
    }
    public int boardDeleteService(int bno) throws Exception{
        return boardMapper.boardDelete(bno);
    }
    public int fileInsertService(FileVO file) throws Exception{
        return boardMapper.fileInsert(file);
    }
    public FileVO fileDetailService(int bno) throws Exception{
        return boardMapper.fileDetail(bno);
    }
}
