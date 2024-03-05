package com.study.erum.repository;

import org.springframework.stereotype.Repository;

import com.study.erum.service.BoardService;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardRepository {
	
	private final BoardService boardService;
}
