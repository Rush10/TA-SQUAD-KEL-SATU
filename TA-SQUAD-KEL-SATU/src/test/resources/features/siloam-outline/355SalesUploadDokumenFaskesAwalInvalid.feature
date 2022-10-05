#created_by : Novri
#created_date : 05/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen Faskes Awal Invalid
  
  Scenario: Siloam355001 Sales langsung menekan tombol simpan foto faskes awal
    When Siloam355001 Sales login dan masuk ke halaman upload dokumen
    And Siloam355001 Sales tekan tombol simpan foto faskes awal invalid
    Then Siloam355001 Validasi pesan error belum memilih foto faskes awal
    
   Scenario: Siloam355002 Sales pilih file faskes awal tidak sesuai format
    When Siloam355002 Sales memilih file faskes awal yang tidak sesuai ekstensi
    Then Siloam355002 Validasi catatan error
    
   Scenario: Siloam355003 Sales upload file faskes awal tidak sesuai format
    When Siloam355003 Sales tekan tombol simpan foto faskes awal invalid
    Then Siloam355003 Validasi pesan error
    
   Scenario: Siloam355004 Sales upload foto faskes awal dengan size lebih dari lima mb
    When Siloam355004 Sales memilih file faskes awal dengan size lima mb
    And Siloam355004 Sales tekan tombol simpan foto faskes awal invalid
    Then Siloam355004 Validasi pesan error
    
  









