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

	 	T7("Siloam335001 Sales klik tombol modal upload foto before"),
		T8("Siloam335002 Sales klik tombol cancel di modal upload foto before"),
		T9("Siloam335003 Sales klik tombol keluar di modal upload foto before"),
		T10("Siloam335004 Sales memilih foto before dari lokal"),
		T11("Siloam335005 Sales klik tombol cancel di modal upload foto before"),
		T12("Siloam335006 Sales klik tombol keluar di modal upload foto before"),
		T13("Siloam335007 Sales tekan tombol simpan foto before"),
		
		T14("Siloam340001 Sales klik tombol modal upload foto after"),
		T15("Siloam340002 Sales klik tombol cancel di modal upload foto after"),
		T16("Siloam340003 Sales klik tombol keluar di modal upload foto after"),
		T17("Siloam340004 Sales memilih foto after dari lokal"),
		T18("Siloam340005 Sales klik tombol cancel di modal upload foto after"),
		T19("Siloam340006 Sales klik tombol keluar di modal upload foto after"),
		T20("Siloam340007 Sales tekan tombol simpan foto after"),
		
		T21("Siloam345001 Sales klik tombol modal upload foto ttd digital"),
		T22("Siloam345002 Sales klik tombol cancel di modal upload foto ttd digital"),
		T23("Siloam345003 Sales klik tombol keluar di modal upload foto ttd digital"),
		T24("Siloam345004 Sales memilih foto ttd digital dari lokal"),
		T25("Siloam345005 Sales klik tombol cancel di modal upload foto ttd digital"),
		T26("Siloam345006 Sales klik tombol keluar di modal upload foto ttd digital"),
		T27("Siloam345007 Sales tekan tombol simpan foto ttd digital"),
		
		T28("Siloam355001 Sales langsung menekan tombol simpan foto before"),
		T29("Siloam355002 Sales pilih file before tidak sesuai format"),
		T30("Siloam355003 Sales upload file before tidak sesuai format"),
		T31("Siloam355004 Sales upload foto before dengan size lebih dari lima mb"),
		
		T32("Siloam360001 Sales langsung menekan tombol simpan foto after"),
		T33("Siloam360002 Sales pilih file after tidak sesuai format"),
		T34("Siloam360003 Sales upload file after tidak sesuai format"),
		T35("Siloam360004 Sales upload foto after dengan size lebih dari lima mb"),
		
		T36("Siloam365001 Sales langsung menekan tombol simpan foto ttd digital"),
		T37("Siloam365002 Sales pilih file ttd digital tidak sesuai format"),
		T38("Siloam365003 Sales upload file ttd digital tidak sesuai format"),
		T39("Siloam365004 Sales upload foto ttd digital dengan size lebih dari lima mb"),
		;
		
		private String testName;
		
		private SiloamTTDDigital(String value) {
			testName = value;
		}
		
		public String getTestName() {
			return testName;
		}	

}
