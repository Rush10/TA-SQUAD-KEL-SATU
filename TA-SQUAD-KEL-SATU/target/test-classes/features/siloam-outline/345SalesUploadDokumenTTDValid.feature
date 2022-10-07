#created_by : Novri
#created_date : 04/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen TTD Valid
  
  Scenario: Siloam345001 Sales klik tombol modal upload foto ttd
    When Siloam345001 Sales login dan masuk ke halaman upload dokumen
    And Siloam345001 Sales tekan tombol modal upload foto ttd
    Then Siloam345001 Validasi judul modal upload foto ttd
    
   Scenario: Siloam345002 Sales klik tombol cancel di modal upload foto ttd
    When Siloam345002 Sales tekan tombol cancel modal upload foto ttd
    Then Siloam345002 Validasi judul halaman upload dokumen
    
   Scenario: Siloam345003 Sales klik tombol keluar di modal upload foto ttd
    When Siloam345003 Sales tekan tombol modal upload foto ttd
    And Siloam345003 Sales tekan tombol keluar modal upload foto ttd
    Then Siloam345003 Validasi judul halaman upload dokumen
    
   Scenario: Siloam345004 Sales memilih foto ttd dari lokal
    When Siloam345004 Sales tekan tombol modal upload foto ttd
    And Siloam345004 Sales memilih foto ttd
    Then Siloam345004 Validasi preview foto
    
   Scenario: Siloam345005 Sales klik tombol cancel di modal upload foto ttd
    When Siloam345005 Sales tekan tombol cancel modal upload foto ttd
    Then Siloam345005 Validasi judul halaman upload dokumen dan preview foto
    
   Scenario: Siloam345006 Sales klik tombol keluar di modal upload foto ttd
    When Siloam345006 Sales tekan tombol modal upload foto ttd
    And Siloam345006 Sales memilih foto ttd
    And Siloam345006 Sales klik tombol keluar modal upload foto ttd
    Then Siloam345006 Validasi judul halaman upload dokumen dan preview foto
    
   Scenario: Siloam345007 Sales tekan tombol simpan foto ttd
    When Siloam345007 Sales tekan tombol modal upload foto ttd
    And Siloam345007 Sales memilih foto ttd
    And Siloam345007 Sales tekan tombol simpan foto ttd pada modal upload foto ttd
    And Siloam345007 Sales tekan tombol ok pada modal upload foto ttd berhasil
    Then Siloam345007 Validasi judul halaman upload dokumen dan preview foto