package cucumber.framework.scenariotest.siloam;

/*
created_by : Manda
created_date : 02/10/2022
updated_by : 
updated_date : 
*/

public enum SiloamTTDDigital {
	
		T1("Siloam370001 Sales tekan tombol hapus file upload before dan klik cancel"),
	    T2("Siloam370002 Sales tekan tombol hapus file upload before dan klik ok"),
	 	T3("Siloam375001 Sales tekan tombol hapus file upload after dan klik cancel"),
	 	T4("Siloam375002 Sales tekan tombol hapus file upload after dan klik ok"),
	 	T5("Siloam380001 Sales tekan tombol hapus file upload ttd dan klik cancel"),
	 	T6("Siloam380002 Sales tekan tombol hapus file upload ttd dan klik ok"),
		;
		
		private String testName;
		
		private SiloamTTDDigital(String value) {
			testName = value;
		}
		
		public String getTestName() {
			return testName;
		}	

}
