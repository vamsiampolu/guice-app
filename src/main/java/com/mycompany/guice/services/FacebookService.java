package com.mycompany.guice.services;

import com.mycompany.guice.services.MessageService;
import javax.inject.Singleton;

@Singleton
public class FacebookService implements MessageService {
  public boolean sendMessage(String msg, String recepient) {
    System.out.println("Send the facebook message");
    return true;
  }
}
