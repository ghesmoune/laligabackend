package com.league.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.league.dao.ImageRepository;
import com.league.entites.Image;
import com.league.uploads.StorageService;
import com.league.uploads.UploadController;


@Service
public class ImageService {
	@Autowired
	private ImageRepository imageRepository;
	@Autowired
	private StorageService storageService;
	 public long  addImage(MultipartFile file) {
		  Image image =  new Image();
		  image.setName(file.getOriginalFilename());
		  storageService.storeImageHero(file,imageRepository.save(image).getId());
		  String fileName = image.getId()+file.getOriginalFilename();
		  image.setImageUri(MvcUriComponentsBuilder.fromMethodName(UploadController.class, "getFile", fileName).build().toString());
		  imageRepository.saveAndFlush(image);
		  return image.getId();
	 }
	 public Image findImageByID(long id) {
			return imageRepository.findOne(id);
		}
}
