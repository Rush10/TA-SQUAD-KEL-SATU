#created_by : Adit
#created_date : 4/10/2022
#updated_by : -
#updated_date : -
Feature: Sales Menekan Gambar Pada Fitur Document

  Scenario: Siloam210 Sales Menekan Gambar Before Fitur Document
    When Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document
    And Siloam210 Sales Menekan Gambar Before Fitur Document
    Then Siloam210 Validasi Gambar Before Fitur Document

  Scenario: Siloam210 Sales Menekan Gambar After Fitur Document
    When Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document After
    And Siloam210 Sales Menekan Gambar After Fitur Document
    Then Siloam210 Validasi Gambar After Fitur Document

  Scenario: Siloam210 Sales Menekan Gambar TTD Digital Fitur Document
    When Siloam210 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur Document TTD Digital
    And Siloam210 Sales Menekan Gambar TTD Digital Fitur Document
    Then Siloam210 Validasi Gambar TTD Digital Fitur Document
