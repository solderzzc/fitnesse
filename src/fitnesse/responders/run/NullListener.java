package fitnesse.responders.run;

import java.io.IOException;

import fitnesse.testrunner.CompositeExecutionLog;
import fitnesse.testrunner.ResultsListener;
import fitnesse.testsystems.TestSummary;
import fitnesse.testsystems.TestSystem;
import fitnesse.testrunner.WikiTestPage;
import fitnesse.testsystems.slim.results.ExceptionResult;
import fitnesse.testsystems.slim.results.TestResult;
import fitnesse.testsystems.slim.tables.Assertion;
import util.TimeMeasurement;

public class NullListener implements ResultsListener {
  @Override
  public void allTestingComplete(TimeMeasurement totalTimeMeasurement) throws IOException {}

  @Override
  public void setExecutionLogAndTrackingId(String stopResponderId, CompositeExecutionLog log) {}

  @Override
  public void announceNumberTestsToRun(int testsToRun) {}

  @Override
  public void testSystemStarted(TestSystem testSystem) {}

  @Override
  public void newTestStarted(WikiTestPage test, TimeMeasurement timeMeasurement) throws IOException {}

  @Override
  public void testOutputChunk(String output) throws IOException {}

  @Override
  public void testAssertionVerified(Assertion assertion, TestResult testResult) {}

  @Override
  public void testExceptionOccurred(Assertion assertion, ExceptionResult exceptionResult) {}

  @Override
  public void testComplete(WikiTestPage test, TestSummary testSummary, TimeMeasurement timeMeasurement) throws IOException {}

  @Override
  public void errorOccured() {}
}
