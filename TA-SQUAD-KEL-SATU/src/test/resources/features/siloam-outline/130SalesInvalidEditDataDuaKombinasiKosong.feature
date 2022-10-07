#created_by : Adit
#created_date : 5/10/2022
#updated_by :
#updated_date :
Feature: Sales Invalid Edit Data Dua Kombinasi Kosong

  #Scenario: Siloam130 Sales Login
    #When Siloam130 Sales Mengakses Halaman Website
    #Then Siloam130 Validasi Sales Masuk Ke Halaman TTD Digital

  Scenario: Siloam130 Sales Invalid Edit Data Dua Kombinasi Kosong
    When Siloam130 Sales Tekan Tombol Edit
    And Siloam130 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan>
    And Siloam130 Sales tekan tombol Simpan
    Then Siloam130 Validasi Pesan Harus Isi Field

    
#9 Data    
    Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
  |Pamungkas|||Bandung|KOTA BANDUNG|Klinik TA|Kota Bekasi|Test TA|
	|Pamungkas||6571829304817563||KOTA BANDUNG|Klinik TA|Kota Bekasi|Test TA|
	|Pamungkas||6571829304817563|Bandung|KOTA BANDUNG||Kota Bekasi|Test TA|
	|Pamungkas||6571829304817563|Bandung|KOTA BANDUNG|Klinik TA|Kota Bekasi||
	|Pamungkas|8273648910293|||KOTA BANDUNG|Klinik TA|Kota Bekasi|Test TA|
	|Pamungkas|8273648910293||Bandung|KOTA BANDUNG||Kota Bekasi|Test TA|
	|Pamungkas|8273648910293||Bandung|KOTA BANDUNG|Klinik TA|Kota Bekasi||
	|Pamungkas|8273648910293|6571829304817563||KOTA BANDUNG||Kota Bekasi|Test TA|
	|Pamungkas|8273648910293|6571829304817563||KOTA BANDUNG|Klinik TA|Kota Bekasi||
	|Pamungkas|8273648910293|6571829304817563|Bandung|KOTA BANDUNG||Kota Bekasi||