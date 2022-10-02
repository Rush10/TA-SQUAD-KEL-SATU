#created_by : Adit
#created_date : 30/09/2022
#updated_by : -
#updated_date : -

Feature: Admin Menekan Preview Data

  Scenario: Siloam050 Admin Menekan Preview Data
  	Given Siloam050 Admin Sudah Login Dan Berada Di Halaman View Data 
		When Siloam050 Admin Tekan Tombol Preview Data
    Then Siloam050 Validasi Data Pada Dokumen PDF