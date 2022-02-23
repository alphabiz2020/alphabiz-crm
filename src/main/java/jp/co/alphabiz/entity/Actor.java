package jp.co.alphabiz.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Actor {

  private Integer id;
  private String name;
  private Integer height;
  private String blood;
  private Date birthday;
  private Integer birthplaceId;
  private Date updateAt;
}
