package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.TestHomePage;

@RunWith(Suite.class)
@SuiteClasses({TestHomePage.class})
public class AllTests {

}
