package com.axellience.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GitTest implements EntryPoint {
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while "
      + "attempting to contact the server. Please check your network "
      + "connection and try again.";

  /**
   * Create a remote service proxy to talk to the server-side Greeting service.
   */
  private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

  private final Messages messages = GWT.create(Messages.class);

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
   VueGWT.init();
   Vue.attach("#app", AppComponent.class);
  }
}
