package com.blockchain10.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blockchain10.requestDto.BlockDto;

@RestController
public class BlockController {

	public ResponseEntity<String> createBlock(@RequestBody BlockDto block){
		
		return new ResponseEntity<>("Block created " + block.getBlock().toString(),HttpStatus.OK);
	}
	
}
