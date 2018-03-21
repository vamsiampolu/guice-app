package com.mycompany.guice.mocks;

import com.mycompany.guice.services.MessageService;

// this is not a mock, this is a stub
public class MockService  implements MessageService {
  public boolean sendMessage(String msg, String recepient) {
    return true;
  }
}
