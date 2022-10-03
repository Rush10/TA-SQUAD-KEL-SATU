package cucumber.framework.scenariotest.siloam;

/*
created_by : Novri
created_date : 29/09/2022
updated_by : Manda
updated_date : 30/09/2022
*/

public enum SiloamInputData {

	T1("Siloam300 Sales Input Data Valid"),
	T2("Siloam305 Sales langsung menekan tombol simpan"),
	T3("Siloam305 Sales input data karyawan kosong semua "),
	T4("Siloam310 Sales input data karyawan nomor BPJS kurang dari tiga belas angka"),
	T5("Siloam310 Sales input data karyawan nomor KTP angka kurang dari enam belas angka"),
	;
	
	private String testName;
	
	private SiloamInputData(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
