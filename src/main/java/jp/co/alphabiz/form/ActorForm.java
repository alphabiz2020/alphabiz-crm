package jp.co.alphabiz.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class ActorForm implements Serializable {


  private String name;
  private String birthplaceId;
}
