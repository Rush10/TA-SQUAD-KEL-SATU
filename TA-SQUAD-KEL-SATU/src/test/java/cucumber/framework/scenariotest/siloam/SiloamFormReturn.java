package cucumber.framework.scenariotest.siloam;

/*
created_by : Adit
created_date : 02/10/2022
updated_by : -
updated_date : -
*/

public enum SiloamFormReturn {

	T1("Siloam085 Form Return Sales Input Start End Date Tekan Filter Complete"),
	T2("Siloam085 Form Return Sales Tekan Reset Complete"),
	T3("Siloam085 Form Return Sales Input Start End Date Tekan Filter Pending"),
	T4("Siloam085 Form Return Sales Tekan Reset Pending"),
	T5("Siloam085 Form Return Sales Input Start End Date Tekan Filter Pilih"),
	T6("Siloam085 Form Return Sales Tekan Reset Pilih"),
	T7("Siloam090 Form Return Sales Show Page Sepuluh"),
	T8("Siloam090 Form Return Sales Show Page Sepuluh Next"),
	T9("Siloam090 Form Return Sales Show Page Sepuluh Previous"),
	T10("Siloam090 Form Return Sales Show Page Dua Puluh Lima"),
	T11("Siloam090 Form Return Sales Show Page Dua Puluh Lima Next"),
	T12("Siloam090 Form Return Sales Show Page Dua Puluh Lima Previous"),
	T13("Siloam090 Form Return Sales Show Page Lima Puluh"),
	T14("Siloam090 Form Return Sales Show Page Lima Puluh Next"),
	T15("Siloam090 Form Return Sales Show Page Lima Puluh Previous"),
	T16("Siloam090 Form Return Sales Show Page Seratus"),
	T17("Siloam090 Form Return Sales Show Page Seratus Next"),
	T18("Siloam090 Form Return Sales Show Page Seratus Previous"),
	T19("Siloam093 Form Return Sales Search Nama"),
	T20("Siloam093 Form Return Sales Reset Nama"),
	T21("Siloam093 Form Return Sales Search Nomor BPJS"),
	T22("Siloam093 Form Return Sales Reset Nomor BPJS"),
	T23("Siloam093 Form Return Sales Search kota KTP"),
	T24("Siloam093 Form Return Sales Reset kota KTP"),
	T25("Siloam093 Form Return Sales Search Faskes Awal"),
	T26("Siloam093 Form Return Sales Reset Faskes Awal"),
	T27("Siloam093 Form Return Sales Search Faskes Tujuan"),
	T28("Siloam093 Form Return Sales Reset Faskes Tujuan"),
	T29("Siloam095 Form Return Sales Invalid Search Nama"),
	T30("Siloam095 Form Return Sales Invalid Search Nomor BPJS"),
	T31("Siloam095 Form Return Sales Invalid Search Kota KTP"),
	T32("Siloam095 Form Return Sales Invalid Search Faskes Awal"),
	T33("Siloam095 Form Return Sales Invalid Search Faskes Tujuan"),
	T34("Siloam097 Form Return Sales Tekan Tombol Aksi"),
	T35("Siloam097 Form Return Sales Tekan Tombol Aksi Case Dua"),
	T36("Siloam099 Form Return Sales Tekan Tombol Filter Invalid Pending"),
	T37("Siloam099 Form Return Sales Tekan Tombol Filter Invalid Complete"),
	T38("Siloam205 Sales Menekan Tombol LogOut"),
	;
	
	private String testName;
	
	private SiloamFormReturn(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
