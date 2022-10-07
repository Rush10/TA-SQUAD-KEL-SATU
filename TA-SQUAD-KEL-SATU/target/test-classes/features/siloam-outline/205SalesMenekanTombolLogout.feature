#created_by : Adit
#created_date : 4/10/2022
#updated_by : -
#updated_date : -

Feature: Sales LogOut

  Scenario: Siloam205 Sales Menekan Tombol LogOut 
    When Siloam205 Sales Sudah Login
    And Siloam205 Sales Menekan Tombol Akun Di Pojok Kanan Atas
    And Siloam205 Sales Menekan LogOut
    Then Siloam205 Validasi Sales LogOut Berhasil