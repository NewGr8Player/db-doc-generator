package com.xavier.doc.generator.dao;

import java.util.List;

import com.xavier.doc.generator.entity.TableInfo;

/***
 * 获取数据库信息的dao接口
 * 
 * @author NewGr8Player
 *
 */
public interface DbInfoDao {

	/****
	 * 获取数据库名称
	 * 
	 * @return
	 */
	String databaseName();

	/***
	 * 获取表的信息
	 * 
	 * @return
	 */
	List<TableInfo> tableInfoList();

}
