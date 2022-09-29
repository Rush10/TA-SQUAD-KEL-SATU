#created_by : Novri
#created_date : 29/09/2022
#updated_by : -
#updated_date : -

Feature: Valid Admin Login

	Given Siloam strip Satu strip Satu strip Admin Mengakses Halaman Website

  Scenario: Siloam001001 Admin Valid Login Username Lower Case
    When Siloam001001 Admin Input Username dan Password Valid
    And Siloam001001 Admin Menekan Tombol Login
    Then Siloam001001 Validasi Nama Admin di Halaman Home Page
    
  Scenario: Siloam001002 Admin Valid Login Username Lower Case Upper Case
    When Siloam001002 Admin Input Username dan Password Valid
    And Siloam001002 Admin Menekan Tombol Login
    Then Siloam001002 Validasi Nama Admin di Halaman Home Page
