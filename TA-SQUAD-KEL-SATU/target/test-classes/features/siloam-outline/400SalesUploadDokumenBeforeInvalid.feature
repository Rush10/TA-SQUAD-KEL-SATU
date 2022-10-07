#created_by : Novri
#created_date : 06/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen Before Invalid
  
  Scenario: Siloam400001 Sales langsung menekan tombol simpan foto before
    When Siloam400001 Sales login dan masuk ke halaman ttd digital
    And Siloam400001 Sales tekan tombol simpan foto before invalid
    Then Siloam400001 Validasi pesan error belum memilih foto before
    
   Scenario: Siloam400002 Sales pilih file before tidak sesuai format
    When Siloam400002 Sales memilih file before yang tidak sesuai ekstensi
    Then Siloam400002 Validasi catatan error
    
   Scenario: Siloam400003 Sales upload file before tidak sesuai format
    When Siloam400003 Sales tekan tombol simpan foto before invalid
    Then Siloam400003 Validasi pesan error
    
   Scenario: Siloam400004 Sales upload foto before dengan size lebih dari lima mb
    When Siloam400004 Sales memilih file before dengan size lima mb
    And Siloam400004 Sales tekan tombol simpan foto before invalid
    Then Siloam400004 Validasi pesan error