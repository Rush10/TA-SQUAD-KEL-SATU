#created_by : Novri
#created_date : 05/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Hapus File Upload Before
  
  Scenario: Siloam370001 Sales tekan tombol hapus file upload before dan klik cancel
    When Siloam370001 Sales login dan masuk ke halaman ttd digital
    And Siloam370001 Sales tekan tombol hapus file upload before
    And Siloam370001 Klik cancel di alert konfirmasi hapus file upload before
    Then Siloam370001 Validasi judul halaman ttd digital
    
   Scenario: Siloam370002 Sales tekan tombol hapus file upload before dan klik ok
    When Siloam370002 Sales tekan tombol hapus file upload before
    And Siloam370002 Klik ok di alert konfirmasi hapus file upload before
    Then Siloam370002 Validasi judul halaman ttd digital dan pesan dokumen berhasil dihapus