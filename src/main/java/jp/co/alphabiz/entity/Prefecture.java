package jp.co.alphabiz.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Prefecture {

	private String id;
	private String name;
	private Date updateTime;
	private Date createTime;
	private String deleteFlg;
	private String updateUser;
	private String createUser;
}
