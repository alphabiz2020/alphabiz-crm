package jp.co.alphabiz.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemberForm implements Serializable {

	  private String actorId;
	  private String name;
	  private String height;
	  private String blood;
	  private String birthday;
	  private String birthplaceId;
}
