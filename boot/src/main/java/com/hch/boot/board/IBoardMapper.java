package com.hch.boot.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IBoardMapper {

	List<BoardDTO> boardForm(@Param("begin")int begin,@Param("end") int end);
	
	int totalCount();
	
	void boardWriteProc(BoardDTO board);
	
	BoardDTO boardContent(int no);

	void incrementHits(int no);
	
	void boardDeleteProc(int n);

	String boardDownload(int no);

	int boardModifyProc(BoardDTO board);

	
}
