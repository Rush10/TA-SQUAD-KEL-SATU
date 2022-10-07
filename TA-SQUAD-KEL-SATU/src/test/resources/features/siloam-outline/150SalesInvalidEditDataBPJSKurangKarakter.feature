#created_by : Adit
#created_date : 5/10/2022
#updated_by : 
#updated_date : 

Feature: Sales Invalid Edit Data BPJS Kurang Karakter

  #Scenario: Siloam150 Sales Login
    #When Siloam150 Sales Mengakses Halaman Website
    #Then Siloam150 Validasi Sales Masuk Ke Halaman TTD Digital

  Scenario: Siloam150 Sales Invalid Edit Data BPJS Kurang Karakter
    When Siloam150 Sales Tekan Tombol Edit
    And Siloam150 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan>
    And Siloam150 Sales tekan tombol Simpan
    Then Siloam150 Validasi Required
    
   Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
  ||827364891029|||||||