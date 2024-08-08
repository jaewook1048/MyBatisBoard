package com.mybatis.board.repository;

import com.mybatis.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
    private final SqlSessionTemplate sqlSessionFactory;

    public void save(BoardDTO boardDTO) {
        sqlSessionFactory.insert("Board.save", boardDTO);
    }

    public List<BoardDTO> findAll() {
        return sqlSessionFactory.selectList("Board.findAll");
    }

    public void updateHits(Long id) {
        sqlSessionFactory.update("Board.updateHits", id);
    }

    public BoardDTO findById(Long id) { return sqlSessionFactory.selectOne("Board.findById", id); }

    public void update(BoardDTO boardDTO) {
        sqlSessionFactory.update("Board.update", boardDTO);
    }
}
