#created_by : Novri
#created_date : 03/10/2022
#updated_by : -
#updated_date : -

Feature: Valid Sales Input Data

  Scenario: Siloam300 Sales Input Data Valid 
	When Siloam300 Sales Mengakses Halaman Website
    And Siloam300 Sales input data <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> valid
    And Siloam300 Sales tekan tombol simpan data valid
    Then Siloam300 Validasi pesan input data berhasil
   
#1 data
  Examples: 
    |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
	|NB Test 3|6767676767677|6767676767676767|Jl.Test|Luwu Timur|Faskes Test|Meikarta|Test Alasan| #change to the new one