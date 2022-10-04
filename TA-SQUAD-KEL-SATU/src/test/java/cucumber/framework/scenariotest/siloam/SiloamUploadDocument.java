package cucumber.framework.scenariotest.siloam;

/*
created_by : Novri
created_date : 04/10/2022
updated_by : -
updated_date : -
*/

public enum SiloamUploadDocument {

	T1("Siloam335001 Sales klik tombol modal upload foto faskes awal"),
	T2("Siloam335002 Sales klik tombol cancel di modal upload foto faskes awal"),
	T3("Siloam335003 Sales klik tombol keluar di modal upload foto faskes awal"),
	T4("Siloam335004 Sales memilih foto faskes awal dari lokal"),
	T5("Siloam335005 Sales klik tombol cancel di modal upload foto faskes awal"),
	T6("Siloam335006 Sales klik tombol keluar di modal upload foto faskes awal"),
	T7("Siloam335007 Sales tekan tombol simpan foto faskes awal"),
	T8("Siloam340001 Sales klik tombol modal upload foto faskes tujuan"),
	T9("Siloam340002 Sales klik tombol cancel di modal upload foto faskes tujuan"),
	T10("Siloam340003 Sales klik tombol keluar di modal upload foto faskes tujuan"),
	T11("Siloam340004 Sales memilih foto faskes tujuan dari lokal"),
	T12("Siloam340005 Sales klik tombol cancel di modal upload foto faskes tujuan"),
	T13("Siloam340006 Sales klik tombol keluar di modal upload foto faskes tujuan"),
	T14("Siloam340007 Sales tekan tombol simpan foto faskes tujuan"),
	T15("Siloam345001 Sales klik tombol modal upload foto ttd"),
	T16("Siloam345002 Sales klik tombol cancel di modal upload foto ttd"),
	T17("Siloam345003 Sales klik tombol keluar di modal upload foto ttd"),
	T18("Siloam345004 Sales memilih foto ttd dari lokal"),
	T19("Siloam345005 Sales klik tombol cancel di modal upload foto ttd"),
	T20("Siloam345006 Sales klik tombol keluar di modal upload foto ttd"),
	T21("Siloam345007 Sales tekan tombol simpan foto ttd"),
	T22("Siloam350001 Sales tekan tombol selanjutnya dan klik cancel"),
	T23("Siloam350002 Sales tekan tombol selanjutnya dan klik ok"),
	;
	
	private String testName;
	
	private SiloamUploadDocument(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
