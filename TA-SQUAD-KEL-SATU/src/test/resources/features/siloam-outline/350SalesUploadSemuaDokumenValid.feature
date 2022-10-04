#created_by : Novri
#created_date : 04/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen TTD Valid
  
  Scenario: Siloam350001 Sales tekan tombol selanjutnya dan klik cancel
    When Siloam350001 Sales login dan masuk ke halaman upload dokumen
    And Siloam350001 Sales tekan tombol selanjutnya
    And Siloam350001 Klik cancel di alert lanjut ke tahap selanjutnya
    Then Siloam350001 Validasi judul halaman upload dokumen
    
   Scenario: Siloam350002 Sales tekan tombol selanjutnya dan klik ok
    When Siloam350002 Sales tekan tombol selanjutnya
    And Siloam350002 Klik ok di alert lanjut ke tahap selanjutnya
    Then Siloam350002 Validasi judul halaman ttd digital
    
    
    




