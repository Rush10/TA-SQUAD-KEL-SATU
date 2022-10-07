#created_by : Novri
#created_date : 04/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen Faskes Tujuan Valid
  
  Scenario: Siloam340001 Sales klik tombol modal upload foto faskes tujuan
    When Siloam340001 Sales login dan masuk ke halaman upload dokumen
    And Siloam340001 Sales tekan tombol modal upload foto faskes tujuan
    Then Siloam340001 Validasi judul modal upload foto faskes tujuan
    
   Scenario: Siloam340002 Sales klik tombol cancel di modal upload foto faskes tujuan
    When Siloam340002 Sales tekan tombol cancel modal upload foto faskes tujuan
    Then Siloam340002 Validasi judul halaman upload dokumen
    
   Scenario: Siloam340003 Sales klik tombol keluar di modal upload foto faskes tujuan
    When Siloam340003 Sales tekan tombol modal upload foto faskes tujuan
    And Siloam340003 Sales tekan tombol keluar modal upload foto faskes tujuan
    Then Siloam340003 Validasi judul halaman upload dokumen
    
   Scenario: Siloam340004 Sales memilih foto faskes tujuan dari lokal
    When Siloam340004 Sales tekan tombol modal upload foto faskes tujuan
    And Siloam340004 Sales memilih foto faskes tujuan
    Then Siloam340004 Validasi preview foto
    
   Scenario: Siloam340005 Sales klik tombol cancel di modal upload foto faskes tujuan
    When Siloam340005 Sales tekan tombol cancel modal upload foto faskes tujuan
    Then Siloam340005 Validasi judul halaman upload dokumen dan preview foto
    
   Scenario: Siloam340006 Sales klik tombol keluar di modal upload foto faskes tujuan
    When Siloam340006 Sales tekan tombol modal upload foto faskes tujuan
    And Siloam340006 Sales memilih foto faskes tujuan
    And Siloam340006 Sales klik tombol keluar modal upload foto faskes tujuan
    Then Siloam340006 Validasi judul halaman upload dokumen dan preview foto
    
   Scenario: Siloam340007 Sales tekan tombol simpan foto faskes tujuan
    When Siloam340007 Sales tekan tombol modal upload foto faskes tujuan
    And Siloam340007 Sales memilih foto faskes tujuan
    And Siloam340007 Sales tekan tombol simpan foto faskes tujuan pada modal upload foto faskes tujuan
    And Siloam340007 Sales tekan tombol ok pada modal upload foto faskes tujuan berhasil
    Then Siloam340007 Validasi judul halaman upload dokumen dan preview foto

