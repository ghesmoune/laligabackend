package com.league.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.league.entites.Image;
import com.league.service.ImageService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping(value="/api")
public class ImageController {
	@Autowired
	private ImageService imageService;
	
	
	@RequestMapping(value="/images/{id}",method=RequestMethod.GET)
	public Image getById(@PathVariable("id")Long id) {
		return imageService.findImageByID(id);
	}
}
	