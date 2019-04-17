package com.xavier.doc.generator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/***
 * @author NewGr8Player
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

	@Autowired
	private Optional<JdbcTemplate> jdbcTemplate;

	@Test
	public void contextLoads() {
		Assert.assertTrue(jdbcTemplate.isPresent());
	}

}
