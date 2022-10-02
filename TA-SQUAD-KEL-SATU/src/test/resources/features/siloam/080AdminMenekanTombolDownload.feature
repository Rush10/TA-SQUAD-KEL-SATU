#created_by : Adit
#created_date : 2/10/2022
#updated_by : -
#updated_date : -

Feature: Admin Menekan Download Invalid

   Scenario: Siloam080 Admin Tekan Download Start End Date Empty
  	Given Siloam080 Admin Berada Di Halaman View Export 
		When Siloam080 Admin Tekan Tombol Download Start End Date Empty
    Then Siloam080 Validasi Sukses Export Start End Date Empty
    
    Scenario: Siloam080 Admin Tekan Download Data Empty
  	Given Siloam080 Admin Berada Di Halaman View Export Dan Memasukkan Start End Date Dan Tekan Filter 
		When Siloam080 Admin Tekan Tombol Download Data Empty
    Then Siloam080 Validasi Sukses Download Data Empty