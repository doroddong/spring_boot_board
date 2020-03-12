package doroddong.spring_boot.board.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BoardVO {
    private int bno;
    private String subject;
    private String content;
    private Date reg_date;
}
