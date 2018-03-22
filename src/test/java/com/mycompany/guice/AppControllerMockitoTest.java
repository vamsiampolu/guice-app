package com.mycompany.guice;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.anyString;

import com.mycompany.guice.controllers.AppController;
import com.mycompany.guice.services.MessageService;

@RunWith(MockitoJUnitRunner.class)
public class AppControllerMockitoTest {
  @Mock(name="msgSvc") private MessageService service;
  private AppController subject;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
  }


  @Test
  public void should_call_message_service_with_message_and_email() {
    String recepient = "someone@somewhere.com";
    String message = "Where are the awesome swiss watches?";
    when(service.sendMessage(recepient, message)).thenReturn(true);
    subject = new AppController(service);

    boolean received = subject.doSomething();
    Assert.assertEquals(true, received);
    verify(service, times(1)).sendMessage(anyString(), anyString());
  }
}
