#created_by : Adit
#created_date : 4/10/2022
#updated_by : -
#updated_date : -

Feature: Admin LogOut

  Scenario: Siloam200 Admin Menekan Tombol LogOut 
    When Siloam200 Admin Sudah Login
    And Siloam200 Admin Menekan Tombol Akun Di Pojok Kanan Atas
    And Siloam200 Admin Menekan LogOut
    Then Siloam200 Validasi Admin LogOut Berhasil