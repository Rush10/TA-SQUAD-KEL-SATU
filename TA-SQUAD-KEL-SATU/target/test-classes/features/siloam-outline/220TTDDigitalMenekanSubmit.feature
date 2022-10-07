#created_by : Adit
#created_date : 4/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Submit

  Scenario: Siloam220 Sales Menekan Tombol Submit 
    When Siloam220 Sales Sudah Login
    And Siloam220 Sales Menekan Submit
    And Siloam220 Sales Menekan Tombol OK
    Then Siloam220 Validasi Sales Submit Berhasil