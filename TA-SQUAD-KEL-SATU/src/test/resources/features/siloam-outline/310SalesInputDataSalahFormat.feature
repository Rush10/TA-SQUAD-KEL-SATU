#created_by : Novri
#created_date : 03/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Input Data Salah Format
    
  Scenario: Siloam310 Sales input data karyawan nomor BPJS kurang dari tiga belas angka
    When Siloam310001 Sales input data <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> nomor bpjs format invalid
    And Siloam310001 Sales tekan tombol simpan data invalid
    Then Siloam310001 Validasi pesan error nomor BPJS angka harus tiga belas
   
  #1 data
  Examples: 
    |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
		|NB Test 3|67676767676|6767676767676767|Jl.Test|Luwu Timur|Faskes Test|Meikarta|Test Alasan|

  Scenario: Siloam310 Sales input data karyawan nomor KTP angka kurang dari enam belas angka
    When Siloam310002 Sales input data <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> nomor ktp format invalid
    And Siloam310002 Sales tekan tombol simpan data invalid
    Then Siloam310002 Validasi pesan error nomor KTP angka harus enam belas
   
#1 data
  Examples: 
    |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
		|NB Test 3|6767676767676|676767676767|Jl.Test|Luwu Timur|Faskes Test|Meikarta|Test Alasan| 