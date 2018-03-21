package com.mycompany.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

import com.mycompany.guice.modules.AppModule;
import com.mycompany.guice.controllers.AppController;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Injector injector = Guice.createInjector(new AppModule());
      AppController ctrl = injector.getInstance(AppController.class);
      ctrl.doSomething();
    }
}
