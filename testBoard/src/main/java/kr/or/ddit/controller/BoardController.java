package kr.or.ddit.controller;

import java.util.List;

import javax.inject.Inject;

import kr.or.ddit.service.IBoardService;
import kr.or.ddit.vo.BoardVO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@Inject
	IBoardService service;
	
	@RequestMapping("/board/boardList.do")
	public String getBoardList(Model model){
		System.out.println("컨트롤러 들어왔냐???");
		List<BoardVO> boardList = service.getBoardList();
		model.addAttribute("boardList", boardList);
		return "/board/boardList";
	}
}
