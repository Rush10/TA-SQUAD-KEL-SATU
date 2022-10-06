#created_by : Novri
#created_date : 06/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen TTD Digital Invalid
  
  Scenario: Siloam410001 Sales langsung menekan tombol simpan foto ttd digital
    When Siloam410001 Sales login dan masuk ke halaman ttd digital
    And Siloam410001 Sales tekan tombol simpan foto ttd digital invalid
    Then Siloam410001 Validasi pesan error belum memilih foto ttd digital
    
   Scenario: Siloam410002 Sales pilih file ttd digital tidak sesuai format
    When Siloam410002 Sales memilih file ttd digital yang tidak sesuai ekstensi
    Then Siloam410002 Validasi catatan error
    
   Scenario: Siloam410003 Sales upload file ttd digital tidak sesuai format
    When Siloam410003 Sales tekan tombol simpan foto ttd digital invalid
    Then Siloam410003 Validasi pesan error
    
   Scenario: Siloam410004 Sales upload foto ttd digital dengan size lebih dari lima mb
    When Siloam410004 Sales memilih file ttd digital dengan size lima mb
    And Siloam410004 Sales tekan tombol simpan foto ttd digital invalid
    Then Siloam410004 Validasi pesan error