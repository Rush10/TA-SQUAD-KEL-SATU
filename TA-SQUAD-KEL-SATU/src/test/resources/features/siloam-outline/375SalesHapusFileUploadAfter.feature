#created_by : Novri
#created_date : 05/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Hapus File Upload After
  
  Scenario: Siloam375001 Sales tekan tombol hapus file upload after dan klik cancel
    When Siloam375001 Sales login dan masuk ke halaman ttd digital
    And Siloam375001 Sales tekan tombol hapus file upload after
    And Siloam375001 Klik cancel di alert konfirmasi hapus file upload after
    Then Siloam375001 Validasi judul halaman ttd digital
    
   Scenario: Siloam375002 Sales tekan tombol hapus file upload after dan klik ok
    When Siloam375002 Sales tekan tombol hapus file upload after
    And Siloam375002 Klik ok di alert konfirmasi hapus file upload after
    Then Siloam375002 Validasi judul halaman ttd digital dan pesan dokumen berhasil dihapus