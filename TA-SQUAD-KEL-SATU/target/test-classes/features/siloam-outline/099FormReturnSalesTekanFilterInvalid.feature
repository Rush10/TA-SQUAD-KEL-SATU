#created_by : Adit
#created_date : 4/10/2022
#updated_by : -
#updated_date : -
Feature: Form Return Sales Tekan Filter Invalid

  Scenario: Siloam099 Form Return Sales Tekan Tombol Filter Invalid Pending
    When Siloam099 Sales Sudah Login Dan Berada Di Halaman Form Return Invalid Filter Pending
    And Siloam099 Sales Input Start Date Dan End Date Untuk Empty Data Pending
    And Siloam099 Sales Pilih Status Pending
    And Siloam099 Sales Tekan Filter Pending
    Then Siloam099 Validasi Data Status Pending Tidak Ada

  Scenario: Siloam099 Form Return Sales Tekan Tombol Filter Invalid Complete
    When Siloam099 Sales Tekan Reset Data Pending
    And Siloam099 Sales Input Start Date Dan End Date Untuk Empty Data Complete
    And Siloam099 Sales Pilih Status Complete
    And Siloam099 Sales Tekan Filter Complete
    Then Siloam099 Validasi Data Status Complete Tidak Ada
