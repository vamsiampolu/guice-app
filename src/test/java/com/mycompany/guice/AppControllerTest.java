package com.mycompany.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.AbstractModule;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

import com.mycompany.guice.controllers.AppController;
import com.mycompany.guice.services.MessageService;
import com.mycompany.guice.mocks.MockService;

public class AppControllerTest {

  private Injector injector;

  @Before
  public void setup() throws Exception {
    injector = Guice.createInjector(new AbstractModule(){
      @Override
      protected void configure() {
        bind(MessageService.class).to(MockService.class);
      }
    });
  }

  @After
  public void teardown() throws Exception {
    injector = null;
  }

  @Test
  public void should_call_message_service_with_message_and_email() {
    AppController subject = injector.getInstance(AppController.class);
    Assert.assertEquals(true, subject.doSomething());
  }

}


