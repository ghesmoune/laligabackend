package com.league.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.league.entites.Image;


public interface ImageRepository extends JpaRepository<Image,Long> {

}