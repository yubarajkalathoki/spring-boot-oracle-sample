package com.yubaraj.oracle.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
/**
 * Created by Yubaraj on 2/1/2017.
 */
public class ApplicationUserDto implements Serializable {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("username")
  private  String username;

  @JsonProperty("password")
  private  String password;

  public ApplicationUserDto() {
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
}
