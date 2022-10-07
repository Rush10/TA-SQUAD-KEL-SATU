#created_by : Novri
#created_date : 06/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen After Valid
  
  Scenario: Siloam390001 Sales klik tombol modal upload foto after
    When Siloam390001 Sales login dan masuk ke halaman upload dokumen
    And Siloam390001 Sales tekan tombol modal upload foto after
    Then Siloam390001 Validasi judul modal upload foto after
    
   Scenario: Siloam390002 Sales klik tombol cancel di modal upload foto after
    When Siloam390002 Sales tekan tombol cancel modal upload foto after
    Then Siloam390002 Validasi judul upload dokumen
    
   Scenario: Siloam390003 Sales klik tombol keluar di modal upload foto after
    When Siloam390003 Sales tekan tombol modal upload foto after
    And Siloam390003 Sales tekan tombol keluar modal upload foto after
    Then Siloam390003 Validasi judul upload dokumen
    
   Scenario: Siloam390004 Sales memilih foto after dari lokal
    When Siloam390004 Sales tekan tombol modal upload foto after
    And Siloam390004 Sales memilih foto after
    Then Siloam390004 Validasi preview foto
    
   Scenario: Siloam390005 Sales klik tombol cancel di modal upload foto after
    When Siloam390005 Sales tekan tombol cancel modal upload foto after
    Then Siloam390005 Validasi judul upload dokumen
    
   Scenario: Siloam390006 Sales klik tombol keluar di modal upload foto after
    When Siloam390006 Sales tekan tombol modal upload foto after
    And Siloam390006 Sales memilih foto after
    And Siloam390006 Sales klik tombol keluar modal upload foto after
    Then Siloam390006 Validasi judul upload dokumen
    
   Scenario: Siloam390007 Sales tekan tombol simpan foto after
    When Siloam390007 Sales tekan tombol modal upload foto after
    And Siloam390007 Sales memilih foto after
    And Siloam390007 Sales tekan tombol simpan foto after pada modal upload foto after
    And Siloam390007 Sales tekan tombol ok pada modal upload foto after berhasil
    Then Siloam390007 Validasi judul halaman ttd digital

