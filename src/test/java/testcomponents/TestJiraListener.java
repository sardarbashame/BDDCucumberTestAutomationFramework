package testcomponents;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import commonutilities.JiraPolicy;
import commonutilities.JiraServiceProvider;



public class TestJiraListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {

		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = true;
		if (isTicketReady) {
			// raise jira ticket:
			System.out.println("is ticket ready for JIRA: " + isTicketReady);
		//	JiraServiceProvider jiraSp = new JiraServiceProvider("https://sardarbashame.atlassian.net",
					"sardarbashame@gmail.com", "ATATT3xFfGF0cRaw37em-cXMnZUosgUlf6Z5W7DMROdd3MAYFe9DfCeiY9H5oIduHR9iMw6vE-kHRl98uJruJy_6g-niBSevMNFRoMYlqbs2dPUXGipP3NG1t5zCmjPSaHB4rLILl-h6nlLFC-4J-4itHmO-jRf5iF1sYKW6gOckH21-ksPI-AI=F1E5043F", "TA");
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()
					+ "got failed due to some assertion or exception";
			String issueDescription = result.getThrowable().getMessage() + "\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));

			jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "sardar");
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
