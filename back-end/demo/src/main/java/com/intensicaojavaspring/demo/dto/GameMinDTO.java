package com.intensicaojavaspring.demo.dto;

import com.intensicaojavaspring.demo.entities.Game;
import com.intensicaojavaspring.demo.projection.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entidy) {
		this.id = entidy.getId();
		this.title = entidy.getTitle();
		this.year = entidy.getYear();
		this.imgUrl = entidy.getImgUrl();
		this.shortDescription = entidy.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getGameYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
}
