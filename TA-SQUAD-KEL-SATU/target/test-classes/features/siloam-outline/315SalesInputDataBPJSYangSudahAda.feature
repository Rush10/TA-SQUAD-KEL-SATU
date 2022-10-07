#created_by : Novri
#created_date : 03/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Input Data BPJS Yang Sudah Ada
    
  Scenario: Siloam315 Sales input data karyawan nomor BPJS yang sudah ada
    When Siloam315 Sales input data <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> nomor bpjs sudah ada
    And Siloam315 Sales tekan tombol simpan data invalid
    Then Siloam315 Validasi pesan nomor BPJS sudah ada atau dipakai
   
  #1 data
  Examples: 
    |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
		|NB|6767676767677|1212121212121212|Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB|