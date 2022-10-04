#created_by : Adit
#created_date : 3/10/2022
#updated_by : -
#updated_date : -

Feature: Form Return Sales Search Invalid

#Nama

   Scenario: Siloam095 Form Return Sales Invalid Search Nama
		When Siloam095 Sales Sudah Login Dan Berada Di Halaman Form Return Search Nama Invalid
		And  Siloam095 Sales Tekan Field Search Dan Input Nama Invalid
		And  Siloam095 Sales Tekan Search Nama Invalid
    Then Siloam095 Validasi Nama Invalid
    
#Nomor BPJS

   Scenario: Siloam095 Form Return Sales Invalid Search Nomor BPJS
		When Siloam095 Sales Tekan Tombol Reset Nama
		And  Siloam095 Sales Tekan Field Search Dan Input Nomor BPJS Invalid
		And  Siloam095 Sales Tekan Search Nomor BPJS Invalid
    Then Siloam095 Validasi Nomor BPJS Invalid 
    
#Kota KTP

   Scenario: Siloam095 Form Return Sales Invalid Search Kota KTP
		When Siloam095 Sales Tekan Tombol Reset Nomor BPJS
		And  Siloam095 Sales Tekan Field Search Dan Input Kota KTP Invalid
		And  Siloam095 Sales Tekan Search Kota KTP Invalid
    Then Siloam095 Validasi Kota KTP Invalid     
    

#Faskes Awal

   Scenario: Siloam095 Form Return Sales Invalid Search Faskes Awal
		When Siloam095 Sales Tekan Tombol Reset Kota KTP
		And  Siloam095 Sales Tekan Field Search Dan Input Faskes Awal Invalid
		And  Siloam095 Sales Tekan Search Faskes Awal Invalid
    Then Siloam095 Validasi Faskes Awal Invalid 
    
#Faskes Tujuan

   Scenario: Siloam095 Form Return Sales Invalid Search Faskes Tujuan
		When Siloam095 Sales Tekan Tombol Reset Faskes Awal
		And  Siloam095 Sales Tekan Field Search Dan Input Faskes Tujuan Invalid
		And  Siloam095 Sales Tekan Search Faskes Tujuan Invalid
    Then Siloam095 Validasi Faskes Tujuan Invalid   
    
            