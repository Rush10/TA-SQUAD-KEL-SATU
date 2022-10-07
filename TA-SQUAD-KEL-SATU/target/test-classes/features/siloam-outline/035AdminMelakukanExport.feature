#created_by : Adit
#created_date : 30/09/2022
#updated_by : -
#updated_date : -

Feature: Admin Melakukan Export

  Scenario: Siloam035 Admin Tekan Export
  	Given Siloam035 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter 
		When Siloam035 Admin Tekan Tombol Export
    Then Siloam035 Validasi Sukses Export 