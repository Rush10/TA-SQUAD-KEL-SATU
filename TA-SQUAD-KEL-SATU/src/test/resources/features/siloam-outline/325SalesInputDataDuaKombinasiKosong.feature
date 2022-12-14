#created_by : Novri
#created_date : 04/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Input Data Dua Kombinasi Kosong
  
  Scenario: Siloam325 Sales input data karyawan dua kombinasi kosong
    When Siloam325 Sales input data <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> dua kosong
    And Siloam325 Sales tekan tombol simpan data invalid
    Then Siloam325 Validasi pesan isi data
   
  #28 data
  Examples: 
    |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
		|||1212121212121210|Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB| #1
		||6767676767678||Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB| #2
		||6767676767679|1212121212121210||Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB| #3
		||6767676767680|1212121212121210|Jl.Test NB|kota|Faskes Test NB|Meikarta|Test Alasan NB| #4
		||6767676767681|1212121212121210|Jl.Test NB|Luwu Timur||Meikarta|Test Alasan NB| #5
		||6767676767682|1212121212121210|Jl.Test NB|Luwu Timur|Faskes Test NB|faskes|Test Alasan NB| #6
		||6767676767683|1212121212121220|Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|| #7
		|NB|||Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB| #8
		|NB||1212121212121220||Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB| #9
		|NB||1212121212121220|Jl.Test NB|kota|Faskes Test NB|Meikarta|Test Alasan NB| #10
		|NB||1212121212121220|Jl.Test NB|Luwu Timur||Meikarta|Test Alasan NB| #11
		|NB||1212121212121220|Jl.Test NB|Luwu Timur|Faskes Test NB|faskes|Test Alasan NB| #12
		|NB||1212121212121220|Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|| #13
		|NB|6767676767690|||Luwu Timur|Faskes Test NB|Meikarta|Test Alasan NB| #14
		|NB|6767676767691||Jl.Test NB|kota|Faskes Test NB|Meikarta|Test Alasan NB| #15
		|NB|6767676767692||Jl.Test NB|Luwu Timur||Meikarta|Test Alasan NB| #16
		|NB|6767676767693||Jl.Test NB|Luwu Timur|Faskes Test NB|faskes|Test Alasan NB| #17
		|NB|6767676767694||Jl.Test NB|Luwu Timur|Faskes Test NB|Meikarta|| #18
		|NB|6767676767695|1212121212121230||kota|Faskes Test NB|Meikarta|Test Alasan NB| #19
		|NB|6767676767696|1212121212121230||Luwu Timur||Meikarta|Test Alasan NB| #20
		|NB|6767676767697|1212121212121230||Luwu Timur|Faskes Test NB|faskes|Test Alasan NB| #21
		|NB|6767676767698|1212121212121230||Luwu Timur|Faskes Test NB|Meikarta|| #22
		|NB|6767676767699|1212121212121230|Jl.Test NB|kota||Meikarta|Test Alasan NB| #23
		|NB|6767676767700|1212121212121230|Jl.Test NB|kota|Faskes Test NB|faskes|Test Alasan NB| #24
		|NB|6767676767701|1212121212121230|Jl.Test NB|kota|Faskes Test NB|Meikarta|| #25
		|NB|6767676767702|1212121212121230|Jl.Test NB|Luwu Timur||faskes|Test Alasan NB| #26
		|NB|6767676767703|1212121212121240|Jl.Test NB|Luwu Timur||Meikarta|| #27
		|NB|6767676767704|1212121212121240|Jl.Test NB|Luwu Timur|Faskes Test NB|faskes|| #28