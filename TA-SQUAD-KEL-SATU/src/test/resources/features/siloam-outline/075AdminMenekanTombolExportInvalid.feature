#created_by : Adit
#created_date : 2/10/2022
#updated_by : -
#updated_date : -

Feature: Admin Menekan Export Invalid

   Scenario: Siloam075 Admin Tekan Export Start End Date Empty
  	Given Siloam075 Admin Berada Di Halaman View Export 
		When Siloam075 Admin Tekan Tombol Export Start End Date Empty
    Then Siloam075 Validasi Sukses Export Start End Date Empty
    
    Scenario: Siloam075 Admin Tekan Export Data Empty
  	Given Siloam075 Admin Berada Di Halaman View Export Dan Memasukkan Start End Date Dan Tekan Filter 
		When Siloam075 Admin Tekan Tombol Export Data Empty
    Then Siloam075 Validasi Sukses Export Data Empty