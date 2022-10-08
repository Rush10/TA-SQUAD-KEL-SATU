#created_by : Novri
#created_date : 05/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Hapus File Upload TTD
  
  Scenario: Siloam380001 Sales tekan tombol hapus file upload ttd dan klik cancel
    When Siloam380001 Sales login dan masuk ke halaman ttd digital
    And Siloam380001 Sales tekan tombol hapus file upload ttd
    And Siloam380001 Klik cancel di alert konfirmasi hapus file upload ttd
    Then Siloam380001 Validasi judul halaman ttd digital
    
   Scenario: Siloam380002 Sales tekan tombol hapus file upload ttd dan klik ok
    When Siloam380002 Sales tekan tombol hapus file upload ttd
    And Siloam380002 Klik ok di alert konfirmasi hapus file upload ttd
    Then Siloam380002 Validasi judul halaman ttd digital dan pesan dokumen berhasil dihapus