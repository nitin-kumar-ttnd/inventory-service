package com.scloud.inventoryservice.controller;

import com.scloud.inventoryservice.dto.InventoryDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/inventory/")
public class InventoryController {

	@GetMapping("{inventoryId}")
	public ResponseEntity<InventoryDTO> getById(@PathVariable("inventoryId") Integer id) {
		return new ResponseEntity<>(InventoryDTO.builder().id(id).itemName("Laptop").quantity(100).build(), HttpStatus.OK);
	}
}
