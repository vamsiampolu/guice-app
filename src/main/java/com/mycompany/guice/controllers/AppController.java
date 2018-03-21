package com.mycompany.guice.controllers;

import javax.inject.Inject;
import com.mycompany.guice.services.MessageService;

public class AppController {
  private final MessageService msgSvc;

  // constructor injection
  @Inject
  public AppController(MessageService msgSvc) {
    this.msgSvc = msgSvc;
  }

  public boolean doSomething() {
    final String recepient = "someone@somewhere.com";
    final String message = "Where are the awesome swiss watches?";
    return this.msgSvc.sendMessage(recepient, message);
  }
}
