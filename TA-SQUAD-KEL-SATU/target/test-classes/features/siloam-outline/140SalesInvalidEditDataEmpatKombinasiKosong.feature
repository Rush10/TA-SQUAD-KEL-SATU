#created_by : Adit
#created_date : 5/10/2022
#updated_by : 
#updated_date : 

Feature: Sales Invalid Edit Data Empat Kombinasi Kosong

  #Scenario: Siloam140 Sales Login
    #When Siloam140 Sales Mengakses Halaman Website
    #Then Siloam140 Validasi Sales Masuk Ke Halaman TTD Digital

  Scenario: Siloam140 Sales Invalid Edit Data Empat Kombinasi Kosong
    When Siloam140 Sales Tekan Tombol Edit
    And Siloam140 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan>
    And Siloam140 Sales tekan tombol Simpan
    Then Siloam140 Validasi Pesan Harus Isi Field
    

#5 Data    
   Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
  |Pamungkas||||KOTA BANDUNG||Kota Bekasi|Test TA|
	|Pamungkas||||KOTA BANDUNG|Klinik TA|Kota Bekasi||
	|Pamungkas|||Bandung|KOTA BANDUNG||Kota Bekasi||
	|Pamungkas||6571829304817563||KOTA BANDUNG||Kota Bekasi||
	|Pamungkas|8273648910293|||KOTA BANDUNG||Kota Bekasi||