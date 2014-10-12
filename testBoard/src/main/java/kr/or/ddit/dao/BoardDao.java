package kr.or.ddit.dao;

import java.util.List;

import javax.inject.Inject;

import kr.or.ddit.vo.BoardVO;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao implements IBoardDao{
	
	@Inject
	SqlMapClientTemplate template;
	
	@Override
	public List<BoardVO> getBoardList() {
		System.out.println("다오 들어왔냐???");
		return template.queryForList("Board.getBoardList");
	}

}
