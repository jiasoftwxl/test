package com.jiasoft.cn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jiasoft.cn.dao.BookDao;
@PropertySource(value = { "classpath:/person.properties" })
@Configuration
@ComponentScan({"com.jiasoft.cn.dao","com.jiasoft.cn.service"})
public class MyDIConfig {
	@Bean("bookDao2")
	public BookDao bookDao() {
		BookDao bookDao = new BookDao();
		bookDao.setLable("2");
		return bookDao;
	}
}
