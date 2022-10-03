#created_by : Novri
#created_date : 03/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Input Data Satu Kombinasi Kosong
  
  Scenario: Siloam320 Sales input data karyawan satu kombinasi kosong
    When Siloam320 Sales input data <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> salah satu kosong
    And Siloam320 Sales tekan tombol simpan data invalid
    Then Siloam320 Validasi pesan isi data
   
  #8 data
  Examples: 
    |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
		||6767676767677|1212121212121212|Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB|
		|NB||1212121212121212|Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB|
		|NB|6767676767677||Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB|
		|NB|6767676767677|1212121212121212||Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB|
		|NB|6767676767677|1212121212121212|Jl.Test NB|kota|Faskes Test NB|Meikarta|Test Alasan NB|
		|NB|6767676767677|1212121212121212|Jl.Test NB|Luwu Timur||Meikarta|Test Alasan NB|
		|NB|6767676767677|1212121212121212|Jl.Test NB|Luwu Timur|Faskes Test NB|faskes|Test Alasan NB|
		|NB|6767676767677|1212121212121212|Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta||