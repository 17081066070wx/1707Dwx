/**
 * <br>包描述:TODO
 * <br>创建日期:2019年11月6日
 */
package com.bw.bean;

/**
 * <br>类型标题:TODO
 * <br>类型描述:TODO
 * <br>创建日期:2019年11月6日
 */
public class User {

  private Integer uid;

  private String userName;

  private String pwd;

  public User(Integer uid, String userName, String pwd) {
    super();
    this.uid = uid;
    this.userName = userName;
    this.pwd = pwd;
  }

  public User() {
    super();
    // TODO Auto-generated constructor stub
  }

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    return "User [uid=" + uid + ", userName=" + userName + ", pwd=" + pwd + "]";
  }

}
