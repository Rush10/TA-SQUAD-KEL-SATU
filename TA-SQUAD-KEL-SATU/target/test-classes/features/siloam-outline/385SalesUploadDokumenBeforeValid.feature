#created_by : Novri
#created_date : 06/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen Before Valid
  
  Scenario: Siloam385001 Sales klik tombol modal upload foto before
    When Siloam385001 Sales login dan masuk ke halaman upload dokumen
    And Siloam385001 Sales tekan tombol modal upload foto before
    Then Siloam385001 Validasi judul modal upload foto before
    
   Scenario: Siloam385002 Sales klik tombol cancel di modal upload foto before
    When Siloam385002 Sales tekan tombol cancel modal upload foto before
    Then Siloam385002 Validasi judul upload dokumen
    
   Scenario: Siloam385003 Sales klik tombol keluar di modal upload foto before
    When Siloam385003 Sales tekan tombol modal upload foto before
    And Siloam385003 Sales tekan tombol keluar modal upload foto before
    Then Siloam385003 Validasi judul upload dokumen
    
   Scenario: Siloam385004 Sales memilih foto before dari lokal
    When Siloam385004 Sales tekan tombol modal upload foto before
    And Siloam385004 Sales memilih foto before
    Then Siloam385004 Validasi preview foto
    
   Scenario: Siloam385005 Sales klik tombol cancel di modal upload foto before
    When Siloam385005 Sales tekan tombol cancel modal upload foto before
    Then Siloam385005 Validasi judul upload dokumen
    
   Scenario: Siloam385006 Sales klik tombol keluar di modal upload foto before
    When Siloam385006 Sales tekan tombol modal upload foto before
    And Siloam385006 Sales memilih foto before
    And Siloam385006 Sales klik tombol keluar modal upload foto before
    Then Siloam385006 Validasi judul upload dokumen
    
   Scenario: Siloam385007 Sales tekan tombol simpan foto before
    When Siloam385007 Sales tekan tombol modal upload foto before
    And Siloam385007 Sales memilih foto before
    And Siloam385007 Sales tekan tombol simpan foto before pada modal upload foto before
    And Siloam385007 Sales tekan tombol ok pada modal upload foto before berhasil
    Then Siloam385007 Validasi judul halaman ttd digital

