package cucumber.framework.scenariotest.siloam;

/*
created_by : Adit
created_date : 01/10/2022
updated_by : -
updated_date : -
*/

public enum SiloamViewExportInvalid {

	T1("Siloam070 Admin Melihat Data Karyawan Invalid Empty");
	
	private String testName;
	
	private SiloamViewExportInvalid(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
