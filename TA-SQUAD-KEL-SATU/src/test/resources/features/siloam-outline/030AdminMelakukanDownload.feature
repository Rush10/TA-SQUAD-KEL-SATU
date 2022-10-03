#created_by : Adit
#created_date : 30/09/2022
#updated_by : -
#updated_date : -

Feature: Admin Melakukan Download

  Scenario: Siloam030 Admin Tekan Download
  	Given Siloam030 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter 
		When Siloam030 Admin Tekan Tombol Download
    Then Siloam030 Validasi An uncaught Exception was encountered 