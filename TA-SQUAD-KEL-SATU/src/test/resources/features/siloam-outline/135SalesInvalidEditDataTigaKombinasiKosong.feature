#created_by : Adit
#created_date : 5/10/2022
#updated_by : 
#updated_date : 

Feature: Sales Invalid Edit Data Tiga Kombinasi Kosong

  #Scenario: Siloam135 Sales Login
    #When Siloam135 Sales Mengakses Halaman Website
    #Then Siloam135 Validasi Sales Masuk Ke Halaman TTD Digital

  Scenario: Siloam135 Sales Invalid Edit Data Tiga Kombinasi Kosong
    When Siloam135 Sales Tekan Tombol Edit
    And Siloam135 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan>
    And Siloam135 Sales tekan tombol Simpan
    Then Siloam135 Validasi Pesan Harus Isi Field
   

#10 Data    
   Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
  |Pamungkas||||KOTA BANDUNG|Klinik TA|Kota Bekasi|Test TA|
	|Pamungkas|||Bandung|KOTA BANDUNG||Kota Bekasi|Test TA|
	|Pamungkas|||Bandung|KOTA BANDUNG|Klinik TA|Kota Bekasi||
	|Pamungkas||6571829304817563||KOTA BANDUNG||Kota Bekasi|Test TA|
	|Pamungkas||6571829304817563||KOTA BANDUNG|Klinik TA|Kota Bekasi||
	|Pamungkas||6571829304817563|Bandung|KOTA BANDUNG||Kota Bekasi||
	|Pamungkas|8273648910293|||KOTA BANDUNG||Kota Bekasi|Test TA|
	|Pamungkas|8273648910293|||KOTA BANDUNG|Klinik TA|Kota Bekasi||
	|Pamungkas|8273648910293||Bandung|KOTA BANDUNG||Kota Bekasi||
	|Pamungkas|8273648910293|6571829304817563||KOTA BANDUNG||Kota Bekasi||