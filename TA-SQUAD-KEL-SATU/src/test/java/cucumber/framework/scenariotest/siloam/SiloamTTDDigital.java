package cucumber.framework.scenariotest.siloam;

/*
created_by : Manda
created_date : 02/10/2022
updated_by : 
updated_date : 
*/

public enum SiloamTTDDigital {
	
//		T1("Siloam370001 Sales tekan tombol hapus file upload before dan klik cancel"),
//	    T2("Siloam370002 Sales tekan tombol hapus file upload before dan klik ok"),
//	 	T3("Siloam375001 Sales tekan tombol hapus file upload after dan klik cancel"),
//	 	T4("Siloam375002 Sales tekan tombol hapus file upload after dan klik ok"),
//	 	T5("Siloam380001 Sales tekan tombol hapus file upload ttd dan klik cancel"),
//	 	T6("Siloam380002 Sales tekan tombol hapus file upload ttd dan klik ok"),
//
//	 	T7("Siloam385001 Sales klik tombol modal upload foto before"),
//		T8("Siloam385002 Sales klik tombol cancel di modal upload foto before"),
//		T9("Siloam385003 Sales klik tombol keluar di modal upload foto before"),
//		T10("Siloam385004 Sales memilih foto before dari lokal"),
//		T11("Siloam385005 Sales klik tombol cancel di modal upload foto before"),
//		T12("Siloam385006 Sales klik tombol keluar di modal upload foto before"),
//		T13("Siloam385007 Sales tekan tombol simpan foto before"),
//		
//		T14("Siloam390001 Sales klik tombol modal upload foto after"),
//		T15("Siloam390002 Sales klik tombol cancel di modal upload foto after"),
//		T16("Siloam390003 Sales klik tombol keluar di modal upload foto after"),
//		T17("Siloam390004 Sales memilih foto after dari lokal"),
//		T18("Siloam390005 Sales klik tombol cancel di modal upload foto after"),
//		T19("Siloam390006 Sales klik tombol keluar di modal upload foto after"),
//		T20("Siloam390007 Sales tekan tombol simpan foto after"),
//		
//		T21("Siloam395001 Sales klik tombol modal upload foto ttd digital"),
//		T22("Siloam395002 Sales klik tombol cancel di modal upload foto ttd digital"),
//		T23("Siloam395003 Sales klik tombol keluar di modal upload foto ttd digital"),
//		T24("Siloam395004 Sales memilih foto ttd digital dari lokal"),
//		T25("Siloam395005 Sales klik tombol cancel di modal upload foto ttd digital"),
//		T26("Siloam395006 Sales klik tombol keluar di modal upload foto ttd digital"),
//		T27("Siloam395007 Sales tekan tombol simpan foto ttd digital"),
//		
//		T28("Siloam400001 Sales langsung menekan tombol simpan foto before"),
//		T29("Siloam400002 Sales pilih file before tidak sesuai format"),
//		T30("Siloam400003 Sales upload file before tidak sesuai format"),
//		T31("Siloam400004 Sales upload foto before dengan size lebih dari lima mb"),
//		
//		T32("Siloam405001 Sales langsung menekan tombol simpan foto after"),
//		T33("Siloam405002 Sales pilih file after tidak sesuai format"),
//		T34("Siloam405003 Sales upload file after tidak sesuai format"),
//		T35("Siloam405004 Sales upload foto after dengan size lebih dari lima mb"),
//		
//		T36("Siloam410001 Sales langsung menekan tombol simpan foto ttd digital"),
//		T37("Siloam410002 Sales pilih file ttd digital tidak sesuai format"),
//		T38("Siloam410003 Sales upload file ttd digital tidak sesuai format"),
//		T39("Siloam410004 Sales upload foto ttd digital dengan size lebih dari lima mb"),
		
		T40("Siloam215 Sales Menekan Gambar Before Fitur File Upload"),
		T41("Siloam215 Sales Menekan Gambar After Fitur File Upload"),
		T42("Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload"),
		;
		
		private String testName;
		
		private SiloamTTDDigital(String value) {
			testName = value;
		}
		
		public String getTestName() {
			return testName;
		}	

}
