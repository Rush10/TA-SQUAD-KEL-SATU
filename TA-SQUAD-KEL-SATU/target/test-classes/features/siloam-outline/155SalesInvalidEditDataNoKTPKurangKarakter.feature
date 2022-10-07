#created_by : Adit
#created_date : 5/10/2022
#updated_by : 
#updated_date : 

Feature: Sales Invalid Edit Data NoKTP Kurang Karakter

  #Scenario: Siloam155 Sales Login
    #When Siloam155 Sales Mengakses Halaman Website
    #Then Siloam155 Validasi Sales Masuk Ke Halaman TTD Digital

  Scenario: Siloam155 Sales Invalid Edit Data No KTP Kurang Karakter
    When Siloam155 Sales Tekan Tombol Edit
    And Siloam155 Sales Melakukan Update Pada <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan>
    And Siloam155 Sales tekan tombol Simpan
    Then Siloam155 Validasi Required
    
   Examples: 
  |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
	|||657182930481756||||||