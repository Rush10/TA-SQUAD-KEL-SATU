#created_by : Adit
#created_date : 3/10/2022
#updated_by : -
#updated_date : -

Feature: Form Return Sales Search

#Nama

   Scenario: Siloam093 Form Return Sales Search Nama
		When Siloam093 Sales Sudah Login Dan Berada Di Halaman Form Return Search Nama
		And  Siloam093 Sales Tekan Field Search Dan Input Nama
		And  Siloam093 Sales Tekan Search Nama
    Then Siloam093 Validasi Nama
    
    Scenario: Siloam093 Form Return Sales Reset Nama
		When Siloam093 Sales Tekan TOmbol Reset Nama
    Then Siloam093 Validasi Reset Nama 

#Nomor BPJS    
    
    Scenario: Siloam093 Form Return Sales Search Nomor BPJS
		When  Siloam093 Sales Tekan Field Search Dan Input Nomor BPJS
		And  Siloam093 Sales Tekan Search Nomor BPJS
    Then Siloam093 Validasi Nomor BPJS
    
    Scenario: Siloam093 Form Return Sales Reset Nomor BPJS
		When Siloam093 Sales Tekan Tombol Reset Nomor BPJS
    Then Siloam093 Validasi Reset Nomor BPJS

#kota KTP
    
    Scenario: Siloam093 Form Return Sales Search kota KTP
		When  Siloam093 Sales Tekan Field Search Dan Input kota KTP
		And  Siloam093 Sales Tekan Search kota KTP
    Then Siloam093 Validasi kota KTP
    
    Scenario: Siloam093 Form Return Sales Reset kota KTP
		When Siloam093 Sales Tekan Tombol Reset kota KTP
    Then Siloam093 Validasi Reset kota KTP
    
#Faskes Awal
    
    Scenario: Siloam093 Form Return Sales Search Faskes Awal
		When  Siloam093 Sales Tekan Field Search Dan Input Faskes Awal
		And  Siloam093 Sales Tekan Search Faskes Awal
    Then Siloam093 Validasi Faskes Awal
    
    Scenario: Siloam093 Form Return Sales Reset Faskes Awal
		When Siloam093 Sales Tekan Tombol Reset Faskes Awal
    Then Siloam093 Validasi Reset Faskes Awal
    
    
#Faskes Tujuan
    
    Scenario: Siloam093 Form Return Sales Search Faskes Tujuan
		When  Siloam093 Sales Tekan Field Search Dan Input Faskes Tujuan
		And  Siloam093 Sales Tekan Search Faskes Tujuan
    Then Siloam093 Validasi Faskes Tujuan
    
    Scenario: Siloam093 Form Return Sales Reset Faskes Tujuan
		When Siloam093 Sales Tekan Tombol Reset Faskes Tujuan
    Then Siloam093 Validasi Reset Faskes Tujuan    