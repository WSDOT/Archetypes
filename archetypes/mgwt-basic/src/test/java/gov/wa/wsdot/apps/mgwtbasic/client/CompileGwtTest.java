package gov.wa.wsdot.apps.mgwtbasic.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "gov.wa.wsdot.apps.mgwtbasic.Basic";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
