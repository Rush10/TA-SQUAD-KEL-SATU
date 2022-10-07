#created_by : Adit
#created_date : 3/10/2022
#updated_by : -
#updated_date : -

Feature: Form Return Sales Tekan Aksi

   Scenario: Siloam097 Form Return Sales Tekan Tombol Aksi
		When Siloam097 Sales Sudah Login Dan Berada Di Halaman Form Return Case Satu
		And  Siloam097 Sales Tekan Field Search Dan Input Nama Dan Tekan Search
		And  Siloam097 Sales Tekan Aksi
    Then Siloam097 Validasi tampil kata TTD DIgital pada halaman TTD Digital
    
	 Scenario: Siloam097 Form Return Sales Tekan Tombol Aksi Case Dua
		When Siloam097 Sales Sudah Login Dan Berada Di Halaman Form Return Case Dua
		And  Siloam097 Sales Tekan Field Search Dan Input Nama Dan Tekan Search Case Dua
		And  Siloam097 Sales Tekan Aksi Case Dua
    Then Siloam097 Validasi tampil kata Upload Document pada halaman Upload Document