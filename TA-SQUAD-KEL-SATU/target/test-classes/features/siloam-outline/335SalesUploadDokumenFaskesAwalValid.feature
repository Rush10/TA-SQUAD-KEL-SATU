#created_by : Novri
#created_date : 04/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen Faskes Awal Valid
  
  Scenario: Siloam335001 Sales klik tombol modal upload foto faskes awal
    When Siloam335001 Sales login dan masuk ke halaman upload dokumen
    And Siloam335001 Sales tekan tombol modal upload foto faskes awal
    Then Siloam335001 Validasi judul modal upload foto faskes awal
    
   Scenario: Siloam335002 Sales klik tombol cancel di modal upload foto faskes awal
    When Siloam335002 Sales tekan tombol cancel modal upload foto faskes awal
    Then Siloam335002 Validasi judul halaman upload dokumen
    
   Scenario: Siloam335003 Sales klik tombol keluar di modal upload foto faskes awal
    When Siloam335003 Sales tekan tombol modal upload foto faskes awal
    And Siloam335003 Sales tekan tombol keluar modal upload foto faskes awal
    Then Siloam335003 Validasi judul halaman upload dokumen
    
   Scenario: Siloam335004 Sales memilih foto faskes awal dari lokal
    When Siloam335004 Sales tekan tombol modal upload foto faskes awal
    And Siloam335004 Sales memilih foto faskes awal
    Then Siloam335004 Validasi preview foto
    
   Scenario: Siloam335005 Sales klik tombol cancel di modal upload foto faskes awal
    When Siloam335005 Sales tekan tombol cancel modal upload foto faskes awal
    Then Siloam335005 Validasi judul halaman upload dokumen dan preview foto
    
   Scenario: Siloam335006 Sales klik tombol keluar di modal upload foto faskes awal
    When Siloam335006 Sales tekan tombol modal upload foto faskes awal
    And Siloam335006 Sales memilih foto faskes awal
    And Siloam335006 Sales klik tombol keluar modal upload foto faskes awal
    Then Siloam335006 Validasi judul halaman upload dokumen dan preview foto
    
   Scenario: Siloam335007 Sales tekan tombol simpan foto faskes awal
    When Siloam335007 Sales tekan tombol modal upload foto faskes awal
    And Siloam335007 Sales memilih foto faskes awal
    And Siloam335007 Sales tekan tombol simpan foto faskes awal pada modal upload foto faskes awal
    And Siloam335007 Sales tekan tombol ok pada modal upload foto faskes awal berhasil
    Then Siloam335007 Validasi judul halaman upload dokumen dan preview foto

