package cucumber.framework.scenariotest.siloam;

/*
created_by : Manda
created_date : 02/10/2022
updated_by : Novri
updated_date : 07/10/2022
*/

public enum SiloamTTDDigital {
	
		T01("Siloam370001 Sales tekan tombol hapus file upload before dan klik cancel"),
	    T02("Siloam370002 Sales tekan tombol hapus file upload before dan klik ok"),
	 	T03("Siloam375001 Sales tekan tombol hapus file upload after dan klik cancel"),
	 	T04("Siloam375002 Sales tekan tombol hapus file upload after dan klik ok"),
	 	T05("Siloam380001 Sales tekan tombol hapus file upload ttd dan klik cancel"),
	 	T06("Siloam380002 Sales tekan tombol hapus file upload ttd dan klik ok"),
	
		T07("Siloam100 Sales Update Data Satu Kombinasi"),
	    T08("Siloam105 Sales Update Data Dua Kombinasi"),
	 	T09("Siloam110 Sales Update Data Tiga Kombinasi"),
		T10("Siloam115 Sales Update Data Empat Kombinasi"),
		T11("Siloam120 Sales Update Data Lima Kombinasi"),
		
		T12("Siloam125 Sales Invalid Edit Data Satu Kombinasi Kosong"),
		T13("Siloam130 Sales Invalid Edit Data Dua Kombinasi Kosong"),
		T14("Siloam135 Sales Invalid Edit Data Tiga Kombinasi Kosong"),
		T15("Siloam140 Sales Invalid Edit Data Empat Kombinasi Kosong"),
		T16("Siloam145 Sales Invalid Edit Data Lima Kombinasi Kosong"),
		T17("Siloam150 Sales Invalid Edit Data BPJS Kurang Karakter"),
		T18("Siloam155 Sales Invalid Edit Data No KTP Kurang Karakter"),
		
		T19("Siloam210 Sales Menekan Gambar Before Fitur Document"),
		T20("Siloam210 Sales Menekan Gambar After Fitur Document"),
		T21("Siloam210 Sales Menekan Gambar TTD Digital Fitur Document"),
		
		T22("Siloam215 Sales Menekan Gambar Before Fitur File Upload"),
		T23("Siloam215 Sales Menekan Gambar After Fitur File Upload"),
		T24("Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload"),
		
		T25("Siloam220 Sales Menekan Tombol Submit"),

	 	T26("Siloam385001 Sales klik tombol modal upload foto before"),
		T27("Siloam385002 Sales klik tombol cancel di modal upload foto before"),
		T28("Siloam385003 Sales klik tombol keluar di modal upload foto before"),
		T29("Siloam385004 Sales memilih foto before dari lokal"),
		T30("Siloam385005 Sales klik tombol cancel di modal upload foto before"),
		T31("Siloam385006 Sales klik tombol keluar di modal upload foto before"),
		T32("Siloam385007 Sales tekan tombol simpan foto before"),
		
		T33("Siloam390001 Sales klik tombol modal upload foto after"),
		T34("Siloam390002 Sales klik tombol cancel di modal upload foto after"),
		T35("Siloam390003 Sales klik tombol keluar di modal upload foto after"),
		T36("Siloam390004 Sales memilih foto after dari lokal"),
		T37("Siloam390005 Sales klik tombol cancel di modal upload foto after"),
		T38("Siloam390006 Sales klik tombol keluar di modal upload foto after"),
		T39("Siloam390007 Sales tekan tombol simpan foto after"),
		
		T40("Siloam395001 Sales klik tombol modal upload foto ttd digital"),
		T41("Siloam395002 Sales klik tombol cancel di modal upload foto ttd digital"),
		T42("Siloam395003 Sales klik tombol keluar di modal upload foto ttd digital"),
		T43("Siloam395004 Sales memilih foto ttd digital dari lokal"),
		T44("Siloam395005 Sales klik tombol cancel di modal upload foto ttd digital"),
		T45("Siloam395006 Sales klik tombol keluar di modal upload foto ttd digital"),
		T46("Siloam395007 Sales tekan tombol simpan foto ttd digital"),
		
		T47("Siloam400001 Sales langsung menekan tombol simpan foto before"),
		T48("Siloam400002 Sales pilih file before tidak sesuai format"),
		T49("Siloam400003 Sales upload file before tidak sesuai format"),
		T50("Siloam400004 Sales upload foto before dengan size lebih dari lima mb"),
		
		T51("Siloam405001 Sales langsung menekan tombol simpan foto after"),
		T52("Siloam405002 Sales pilih file after tidak sesuai format"),
		T53("Siloam405003 Sales upload file after tidak sesuai format"),
		T54("Siloam405004 Sales upload foto after dengan size lebih dari lima mb"),
		
		T55("Siloam410001 Sales langsung menekan tombol simpan foto ttd digital"),
		T56("Siloam410002 Sales pilih file ttd digital tidak sesuai format"),
		T57("Siloam410003 Sales upload file ttd digital tidak sesuai format"),
		T58("Siloam410004 Sales upload foto ttd digital dengan size lebih dari lima mb"),
		;
		
		private String testName;
		
		private SiloamTTDDigital(String value) {
			testName = value;
		}
		
		public String getTestName() {
			return testName;
		}	

}
