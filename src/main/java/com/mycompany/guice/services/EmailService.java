package com.mycompany.guice.services;

import com.mycompany.guice.services.MessageService;
import javax.inject.Singleton;

@Singleton
public class EmailService implements MessageService {
  public boolean sendMessage(String msg, String recepient) {
    System.out.println("Send the email");
    return true;
  }
}
