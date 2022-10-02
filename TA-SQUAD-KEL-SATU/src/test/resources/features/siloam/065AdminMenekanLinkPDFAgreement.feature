#created_by : Adit
#created_date : 30/09/2022
#updated_by : -
#updated_date : -

Feature: Admin Menekan Link PDF Agreement

  Scenario: Siloam065 Admin Tekan PDF Agreement
  	Given Siloam065 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter 
		When Siloam065 Admin Tekan Link PDF Agreement
    Then Siloam065 Validasi PDF Agreement