#created_by : Novri
#created_date : 06/10/2022
#updated_by : -
#updated_date : -

Feature: Sales Upload Dokumen After Invalid
  
  Scenario: Siloam405001 Sales langsung menekan tombol simpan foto after
    When Siloam405001 Sales login dan masuk ke halaman ttd digital
    And Siloam405001 Sales tekan tombol simpan foto after invalid
    Then Siloam405001 Validasi pesan error belum memilih foto after
    
   Scenario: Siloam405002 Sales pilih file after tidak sesuai format
    When Siloam405002 Sales memilih file after yang tidak sesuai ekstensi
    Then Siloam405002 Validasi catatan error
    
   Scenario: Siloam405003 Sales upload file after tidak sesuai format
    When Siloam405003 Sales tekan tombol simpan foto after invalid
    Then Siloam405003 Validasi pesan error
    
   Scenario: Siloam405004 Sales upload foto after dengan size lebih dari lima mb
    When Siloam405004 Sales memilih file after dengan size lima mb
    And Siloam405004 Sales tekan tombol simpan foto after invalid
    Then Siloam405004 Validasi pesan error