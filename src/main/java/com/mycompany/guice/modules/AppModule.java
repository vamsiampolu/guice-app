package com.mycompany.guice.modules;

import com.google.inject.AbstractModule;

import com.mycompany.guice.services.MessageService;
import com.mycompany.guice.services.EmailService;

public class AppModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(MessageService.class).to(EmailService.class);
  }
}

