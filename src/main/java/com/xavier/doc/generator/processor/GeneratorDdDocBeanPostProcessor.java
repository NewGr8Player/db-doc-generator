package com.xavier.doc.generator.processor;

import com.xavier.doc.generator.service.GeneratorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/***
 * spring上下文初始化完成后-执行生成文档操作
 *
 * @author NewGr8Player
 *
 */
@Slf4j
@Component
public class GeneratorDdDocBeanPostProcessor implements ApplicationListener<ContextRefreshedEvent> {

	@Resource
	private GeneratorService generatorService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
			generatorService.generateDbDoc();
			log.info("生成数据库文档成功");
		} catch (Exception e) {
			log.error("生成数据库文档错误", e);
		}
	}
}