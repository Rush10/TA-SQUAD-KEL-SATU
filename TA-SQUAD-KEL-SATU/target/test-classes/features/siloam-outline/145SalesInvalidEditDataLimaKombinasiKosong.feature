#created_by : Adit
#created_date : 5/10/2022
#updated_by : 
#updated_date : 

Feature: Sales Invalid Edit Data Lima Kombinasi Kosong

  #Scenario: Siloam145 Sales Login
    #When Siloam145 Sales Mengakses Halaman Website
    #Then Siloam145 Validasi Sales Masuk Ke Halaman TTD Digital

  Scenario: Siloam145 Sales Invalid Edit Data Lima Kombinasi Kosong
    When Siloam145 Sales Tekan Tombol Edit
    And Siloam145 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan>
    And Siloam145 Sales tekan tombol Simpan
    Then Siloam145 Validasi Pesan Harus Isi Field
    
#1 Data    
   Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
  |Pamungkas||||KOTA BANDUNG||Kota Bekasi||