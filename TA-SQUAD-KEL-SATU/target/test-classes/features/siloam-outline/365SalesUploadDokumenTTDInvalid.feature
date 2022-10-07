#created_by : Novri
#created_date : 05/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen TTD Invalid
  
  Scenario: Siloam365001 Sales langsung menekan tombol simpan foto TTD
    When Siloam365001 Sales login dan masuk ke halaman upload dokumen
    And Siloam365001 Sales tekan tombol simpan foto TTD invalid
    Then Siloam365001 Validasi pesan error belum memilih foto TTD
    
   Scenario: Siloam365002 Sales pilih file TTD tidak sesuai format
    When Siloam365002 Sales memilih file TTD yang tidak sesuai ekstensi
    Then Siloam365002 Validasi catatan error
    
   Scenario: Siloam365003 Sales upload file TTD tidak sesuai format
    When Siloam365003 Sales tekan tombol simpan foto TTD invalid
    Then Siloam365003 Validasi pesan error
    
   Scenario: Siloam365004 Sales upload foto TTD dengan size lebih dari lima mb
    When Siloam365004 Sales memilih file TTD dengan size lima mb
    And Siloam365004 Sales tekan tombol simpan foto TTD invalid
    Then Siloam365004 Validasi pesan error
    
  









