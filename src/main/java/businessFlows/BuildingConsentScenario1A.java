package businessFlows;

import org.testng.annotations.Test;
import planSAUtility.ApplicationLogins;
import ReusableClassesV2.RA_Verification;

public class BuildingConsentScenario1A {

@Test
public void testFlow() throws Exception {
ApplicationLogins.login("UAT","chrome");
System.out.println("Adding a sys out statement for git commit");
RA_Verification.verifyConsent("1","","","","","","","","","","","","","","","","","","","","","");
}
}
