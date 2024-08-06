package com.mybatis.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
    private Long id;
    private String boardPass;
    private String boardWriter;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private String createAt;
}
