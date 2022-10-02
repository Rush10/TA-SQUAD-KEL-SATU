#created_by : Adit
#created_date : 30/09/2022
#updated_by : -
#updated_date : -

Feature: Admin Menekan Link Foto Faskes Tujuan

  Scenario: Siloam060 Admin Tekan Faskes Tujuan
  	Given Siloam060 Admin Berada Di Halaman View Export Dan Sudah Tekan Filter 
		When Siloam060 Admin Tekan Link Faskes Tujuan
    Then Siloam060 Validasi Gambar Faskes Tujuan