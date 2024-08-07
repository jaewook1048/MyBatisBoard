package com.mybatis.board.repository;

import com.mybatis.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSessionTemplate sqlSessionFactory;
    public void save(BoardDTO boardDTO) {
        sqlSessionFactory.insert("Board.save", boardDTO);
    }
}
