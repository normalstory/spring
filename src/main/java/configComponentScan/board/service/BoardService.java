package configComponentScan.board.service;

import java.util.List;   

import configComponentScan.board.dao.BoardDao;
import board.model.BoardVo;

public interface BoardService {
	public BoardDao getBoardDao();
	
	public void setBoardDao(BoardDao boardDao);
	
	public List<BoardVo> getBoardList(String boardGb);
		
}