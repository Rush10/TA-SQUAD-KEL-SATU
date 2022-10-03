#created_by : Adit
#created_date : 29/09/2022
#updated_by : -
#updated_date : -

Feature: Admin Melakukan Refresh

  Scenario: Siloam025 Admin Tekan Refresh
  	Given Siloam025 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter 
		When Siloam025 Admin Tekan Tombol Refresh
    Then Siloam025 Validasi view & export pada halaman view & export