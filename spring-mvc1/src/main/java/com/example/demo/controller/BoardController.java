package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("/index")
	public String index(Model model) {

		model.addAttribute("header", "SimpleBoard");
		model.addAttribute("title", "タイムライン");

		List<Board> board = boardService.getAll();
		model.addAttribute("board", board);

		return "index";
	}
	
//	@GetMapping("/show")
//	public String show(Model model, int id) {
//	return "show";	
//	}

}
