package jp.co.alphabiz.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Actor {

  private String actorId;
  private String name;
  private Integer height;
  private String blood;
  private Date birthday;
  private Integer birthplaceId;
  private Date updateTime;
  private Date createTime;
  private String deleteFlg;
  private String updateUser;
  private String createUser;
}
