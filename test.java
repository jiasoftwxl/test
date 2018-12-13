package com.jiasoft.cn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.jiasoft.cn.bean.Color;
import com.jiasoft.cn.bean.MyCarFactory;
import com.jiasoft.cn.bean.MyImportBeanDefinitionRegistrar;
import com.jiasoft.cn.bean.MyImportSelecter;

@Configuration
@ComponentScan(value="com.jiasoft.cn",includeFilters= {
	@Filter(type=FilterType.ANNOTATION,classes= {Controller.class,Service.class})	
},useDefaultFilters=false)
@Import({ 
	Color.class,
	MyImportSelecter.class,
	MyImportBeanDefinitionRegistrar.class 
})
public class MainConfig {
	@Bean
	public MyCarFactory getMyCarFactory() {
		return new MyCarFactory();
	}
}
