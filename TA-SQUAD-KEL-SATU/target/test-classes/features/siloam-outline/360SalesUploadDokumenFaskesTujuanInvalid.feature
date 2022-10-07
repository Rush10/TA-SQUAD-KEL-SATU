#created_by : Novri
#created_date : 05/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen Faskes Tujuan Invalid
  
  Scenario: Siloam360001 Sales langsung menekan tombol simpan foto faskes tujuan
    When Siloam360001 Sales login dan masuk ke halaman upload dokumen
    And Siloam360001 Sales tekan tombol simpan foto faskes tujuan invalid
    Then Siloam360001 Validasi pesan error belum memilih foto faskes tujuan
    
   Scenario: Siloam360002 Sales pilih file faskes tujuan tidak sesuai format
    When Siloam360002 Sales memilih file faskes tujuan yang tidak sesuai ekstensi
    Then Siloam360002 Validasi catatan error
    
   Scenario: Siloam360003 Sales upload file faskes tujuan tidak sesuai format
    When Siloam360003 Sales tekan tombol simpan foto faskes tujuan invalid
    Then Siloam360003 Validasi pesan error
    
   Scenario: Siloam360004 Sales upload foto faskes tujuan dengan size lebih dari lima mb
    When Siloam360004 Sales memilih file faskes tujuan dengan size lima mb
    And Siloam360004 Sales tekan tombol simpan foto faskes tujuan invalid
    Then Siloam360004 Validasi pesan error
    
  









