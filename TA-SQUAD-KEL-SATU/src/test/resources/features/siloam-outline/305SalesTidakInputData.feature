#created_by : Novri
#created_date : 03/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Tidak Input Data

	Scenario: Siloam305 Sales langsung menekan tombol simpan
		When Siloam305001 Sales Mengakses Halaman Website
    And Siloam305001 Sales tekan tombol simpan data invalid
    Then Siloam305001 Validasi pesan error isi input nama

  Scenario: Siloam305 Sales input data karyawan kosong semua 
    When Siloam305002 Sales input data <nama>, <nomorBPJS>, <nomorKTP>, <address>, <kotaKTP>, <faskesAwal>, <faskesTujuan>, dan <alasan> valid
    And Siloam305002 Sales tekan tombol simpan data invalid
    Then Siloam305002 Validasi pesan error isi input nama
   
#1 data
  Examples: 
    |nama|nomorBPJS|nomorKTP|address|kotaKTP|faskesAwal|faskesTujuan|alasan|
		||||||||| 