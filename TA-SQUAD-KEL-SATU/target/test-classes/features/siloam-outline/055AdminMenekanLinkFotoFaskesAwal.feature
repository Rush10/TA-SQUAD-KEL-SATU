#created_by : Adit
#created_date : 30/09/2022
#updated_by : -
#updated_date : -

Feature: Admin Menekan Link Foto Faskes Awal

  Scenario: Siloam055 Admin Tekan Faskes Awal
  	Given Siloam055 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter 
		When Siloam055 Admin Tekan Link Faskes Awal
    Then Siloam055 Validasi Gambar Faskes Awal 