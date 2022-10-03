#created_by : Adit
#created_date : 29/09/2022
#updated_by : -
#updated_date : -

Feature: Admin Melihat Data Karyawan

  Scenario: Siloam020 Admin Memasukkan Start Date End Date Tekan Filter
		When Siloam020 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export
    And Siloam020 Admin Memasukkan Start Date
    And Siloam020 Admin Memasukkan End Date
    And Siloam020 Admin Klik Tombol Filter
    Then Siloam020 Validasi Tombol Filter 