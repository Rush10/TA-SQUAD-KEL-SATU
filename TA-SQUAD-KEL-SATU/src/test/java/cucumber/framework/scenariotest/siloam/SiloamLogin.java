package cucumber.framework.scenariotest.siloam;

/*
created_by : Novri
created_date : 29/09/2022
updated_by : Manda
updated_date : 30/09/2022
*/

public enum SiloamLogin {

	T1("Siloam001 Admin Valid Login"),
	T2("Siloam005 Sales Valid Login"),
	T3("Siloam010 Admin Invalid Login"),
	T4("Siloam015 Admin Invalid Login Empty"),
	T5("Siloam010 Sales Invalid Login"),
	T6("Siloam015 Sales Invalid Login Empty"),
	;
	
	private String testName;
	
	private SiloamLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
