#created_by : Adit
#created_date : 4/10/2022
#updated_by : -
#updated_date : -
Feature: Sales Menekan Gambar Pada Fitur File Upload

  Scenario: Siloam215 Sales Menekan Gambar Before Fitur File Upload
    When Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload
    And Siloam215 Sales Menekan Gambar Before Fitur File Upload
    Then Siloam215 Validasi Gambar Before Fitur File Upload

  Scenario: Siloam215 Sales Menekan Gambar After Fitur File Upload
    When Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload After
    And Siloam215 Sales Menekan Gambar After Fitur File Upload
    Then Siloam215 Validasi Gambar After Fitur File Upload

  Scenario: Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload
    When Siloam215 Sales Sudah Login Dan Berada Di Halaman TTD Digital Fitur File Upload TTD Digital
    And Siloam215 Sales Menekan Gambar TTD Digital Fitur File Upload
    Then Siloam215 Validasi Gambar TTD Digital Fitur File Upload
