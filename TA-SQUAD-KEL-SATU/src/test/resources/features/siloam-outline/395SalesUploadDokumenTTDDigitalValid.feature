#created_by : Novri
#created_date : 06/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen TTD Digital Valid
  
  Scenario: Siloam395001 Sales klik tombol modal upload foto ttd digital
    When Siloam395001 Sales login dan masuk ke halaman upload dokumen
    And Siloam395001 Sales tekan tombol modal upload foto ttd digital
    Then Siloam395001 Validasi judul modal upload foto ttd digital
    
   Scenario: Siloam395002 Sales klik tombol cancel di modal upload foto ttd digital
    When Siloam395002 Sales tekan tombol cancel modal upload foto ttd digital
    Then Siloam395002 Validasi judul upload dokumen
    
   Scenario: Siloam395003 Sales klik tombol keluar di modal upload foto ttd digital
    When Siloam395003 Sales tekan tombol modal upload foto ttd digital
    And Siloam395003 Sales tekan tombol keluar modal upload foto ttd digital
    Then Siloam395003 Validasi judul upload dokumen
    
   Scenario: Siloam395004 Sales memilih foto ttd digital dari lokal
    When Siloam395004 Sales tekan tombol modal upload foto ttd digital
    And Siloam395004 Sales memilih foto ttd digital
    Then Siloam395004 Validasi preview foto
    
   Scenario: Siloam395005 Sales klik tombol cancel di modal upload foto ttd digital
    When Siloam395005 Sales tekan tombol cancel modal upload foto ttd digital
    Then Siloam395005 Validasi judul upload dokumen
    
   Scenario: Siloam395006 Sales klik tombol keluar di modal upload foto ttd digital
    When Siloam395006 Sales tekan tombol modal upload foto ttd digital
    And Siloam395006 Sales memilih foto ttd digital
    And Siloam395006 Sales klik tombol keluar modal upload foto ttd digital
    Then Siloam395006 Validasi judul upload dokumen
    
   Scenario: Siloam395007 Sales tekan tombol simpan foto ttd digital
    When Siloam395007 Sales tekan tombol modal upload foto ttd digital
    And Siloam395007 Sales memilih foto ttd digital
    And Siloam395007 Sales tekan tombol simpan foto ttd digital pada modal upload foto ttd digital
    And Siloam395007 Sales tekan tombol ok pada modal upload foto ttd digital berhasil
    Then Siloam395007 Validasi judul halaman ttd digital

