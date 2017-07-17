package com.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.InitBinder;

@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class Config {

	private String url;
	private String database;
	private String gridFsDatabase;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public String getGridFsDatabase() {
		return gridFsDatabase;
	}
	public void setGridFsDatabase(String gridFsDatabase) {
		this.gridFsDatabase = gridFsDatabase;
	}
	
	@Override
	public String toString() {
		return "Config [url=" + url + ", database=" + database + ", gridFsDatabase=" + gridFsDatabase + "]";
	}
	
	@Bean
	public Object test() {
		System.out.println("++++++++++" + toString());
		return null;
	}
	
	@InitBinder
	public void init() {
		System.out.println("++++++++++++init++++++++");
	}
}
