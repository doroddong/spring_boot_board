package doroddong.spring_boot.board.mapper;

import org.springframework.stereotype.Repository;

//Repository : 해당 클래스가 데이터베이스에 접근하는 클래스임을 명시
@Repository("doroddong.spring_boot.board.mapper.BoardMapper")
public interface BoardMapper {
    public int boardCount() throws Exception;
}
