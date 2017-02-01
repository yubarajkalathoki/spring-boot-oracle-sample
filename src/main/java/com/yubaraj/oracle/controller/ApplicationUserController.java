package com.yubaraj.oracle.controller;
import com.yubaraj.oracle.dto.ApplicationUserDto;
import com.yubaraj.oracle.service.ApplicationUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
/**
 * Created by Yubaraj on 2/1/2017.
 */
@RestController
@RequestMapping("/rest/v1/user")
public class ApplicationUserController {
  private  static  final Logger LOGGER = LoggerFactory.getLogger(ApplicationUserController.class);

  @Autowired
  private ApplicationUserService userService;

  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<Object> createUser(@Valid @RequestBody ApplicationUserDto userDto){
    LOGGER.info("Request accepted to create user.");
    userService.createUser(userDto);
    return new ResponseEntity<Object >(HttpStatus.OK);
  }
}
