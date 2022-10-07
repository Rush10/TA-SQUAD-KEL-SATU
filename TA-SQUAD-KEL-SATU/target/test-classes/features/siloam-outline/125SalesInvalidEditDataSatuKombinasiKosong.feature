#created_by : Adit
#created_date : 5/10/2022
#updated_by :
#updated_date :
Feature: Sales Invalid Edit Data Satu Kombinasi Kosong

  #Scenario: Siloam125 Sales Login
    #When Siloam125 Sales Mengakses Halaman Website
    #Then Siloam125 Validasi Sales Masuk Ke Halaman TTD Digital

  Scenario: Siloam125 Sales Invalid Edit Data Satu Kombinasi Kosong
    When Siloam125 Sales Tekan Tombol Edit
    And Siloam125 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan>
    And Siloam125 Sales tekan tombol Simpan
    Then Siloam125 Validasi Pesan Harus Isi Field


#5 Data    
    Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
  |Pamungkas||6571829304817563|Bandung|KOTA BANDUNG|Klinik TA|Kota Bekasi|Test TA|
	|Pamungkas|8273648910293||Bandung|KOTA BANDUNG|Klinik TA|Kota Bekasi|Test TA|
	|Pamungkas|8273648910293|6571829304817563||KOTA BANDUNG|Klinik TA|Kota Bekasi|Test TA|
	|Pamungkas|8273648910293|6571829304817563|Bandung|KOTA BANDUNG||Kota Bekasi|Test TA|
	|Pamungkas|8273648910293|6571829304817563|Bandung|KOTA BANDUNG|Klinik TA|Kota Bekasi||