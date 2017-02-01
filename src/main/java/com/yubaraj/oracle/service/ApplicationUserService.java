package com.yubaraj.oracle.service;
import com.yubaraj.oracle.dto.ApplicationUserDto;
import com.yubaraj.oracle.entity.ApplicationUser;
import com.yubaraj.oracle.repository.ApplicationUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by Yubaraj on 2/1/2017.
 */
@Service
public class ApplicationUserService {

  private  static  final Logger LOGGER = LoggerFactory.getLogger(ApplicationUserService.class);

  @Autowired
  private ApplicationUserRepository userRepository;

  public void createUser(ApplicationUserDto userDto) {
    LOGGER.info("Creating user...");
    ApplicationUser user = new ApplicationUser();
    user.setUsername(userDto.getUsername());
    user.setPassword(userDto.getPassword());
    userRepository.save(user);
    LOGGER.info("Created!");
  }
}
