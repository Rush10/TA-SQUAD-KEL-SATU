package cucumber.framework.scenariotest.siloam;

/*
created_by : Novri
created_date : 29/09/2022
updated_by : Manda
updated_date : 30/09/2022
*/

public enum SiloamInputData {

	T1("Siloam299 Sales menekan tombol menu input"),
	T2("Siloam300 Sales Input Data Valid"),
	T3("Siloam305 Sales langsung menekan tombol simpan"),
	T4("Siloam305 Sales input data karyawan kosong semua "),
	T5("Siloam310 Sales input data karyawan nomor BPJS kurang dari tiga belas angka"),
	T6("Siloam310 Sales input data karyawan nomor KTP angka kurang dari enam belas angka"),
	T7("Siloam315 Sales input data karyawan nomor BPJS yang sudah ada"),
	T8("Siloam320 Sales input data karyawan satu kombinasi kosong"),
	T9("Siloam325 Sales input data karyawan dua kombinasi kosong"),
	;
	
	private String testName;
	
	private SiloamInputData(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
