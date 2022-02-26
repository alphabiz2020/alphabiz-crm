package jp.co.alphabiz.dto.member;

import java.util.Date;

import lombok.Data;

@Data
public class ActorDto {

  private String actorId;
  private String name;
  private Integer height;
  private String blood;
  private Date birthday;
  private Integer birthplaceId;
  private String birthplaceName;
  private Date updateTime;
  private Date createTime;
  private String deleteFlg;
  private String updateUser;
  private String createUser;
}
