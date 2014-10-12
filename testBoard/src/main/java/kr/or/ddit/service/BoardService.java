package kr.or.ddit.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.dao.IBoardDao;
import kr.or.ddit.vo.BoardVO;

@Service
public class BoardService implements IBoardService {
	
	@Inject
	IBoardDao dao;
	
	public List<BoardVO> getBoardList() {
		System.out.println(dao);
		System.out.println("서비스 들어왔냐???");
		List<BoardVO> boardList = dao.getBoardList();
		System.out.println(boardList);
		return boardList;
	}

}
