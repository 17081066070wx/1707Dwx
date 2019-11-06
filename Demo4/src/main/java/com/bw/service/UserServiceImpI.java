/**
 * <br>包描述:TODO
 * <br>创建日期:2019年11月6日
 */
package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.User;
import com.bw.mapper.UserMapper;

/**
 * <br>类型标题:TODO
 * <br>类型描述:TODO
 * <br>创建日期:2019年11月6日
 */
@Service
@Transactional
public class UserServiceImpI implements UserService {

  @Autowired
  private UserMapper mapper;

  /**
   * <br>重写方法描述:TODO
   * <br>创建日期:2019年11月6日
   * @see com.bw.service.UserService#getList()
   */
  @Override
  public List<User> getList() {
    // TODO Auto-generated method stub
    return mapper.getList();
  }

}
