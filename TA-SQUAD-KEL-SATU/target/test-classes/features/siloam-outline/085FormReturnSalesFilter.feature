#created_by : Adit
#created_date : 2/10/2022
#updated_by : -
#updated_date : -

Feature: Form Return Sales Filter

   Scenario: Siloam085 Form Return Sales Input Start End Date Tekan Filter Complete
		When Siloam085 Sales Sudah Login Dan Berada Di Halaman Form Return Complete
		And  Siloam085 Sales Input Start Date Complete
		And  Siloam085 Sales Input End Date Complete
		And  Siloam085 Sales Input Status Complete
		And  Siloam085 Sales Tekan Tombol Filter Complete
    Then Siloam085 Validasi data complete tampil pada halaman form return 
    
    Scenario: Siloam085 Form Return Sales Tekan Reset Complete
		Given Siloam085 Sales Sudah Login Dan Sudah Input Start Date End Date Status Dan Tekan Tilter 
		When Siloam085 Sales Menekan Tombol Reset Complete
    Then Siloam085 Validasi Start Date End Date Kosong
    
    Scenario: Siloam085 Form Return Sales Input Start End Date Tekan Filter Pending
		Given Siloam085 Sales Sudah Login Dan Berada Di Halaman Form Return Pending
		When  Siloam085 Sales Input Start Date Pending
		And  Siloam085 Sales Input End Date Pending
		And  Siloam085 Sales Input Status Pending
		And  Siloam085 Sales Tekan Tombol Filter Pending
    Then Siloam085 Validasi Data Pending Tampil Pada Halaman Form Return
    
    Scenario: Siloam085 Form Return Sales Tekan Reset Pending
		Given Siloam085 Sales Sudah Login Dan Sudah Input Start Date End Date Status Dan Tekan Filter Pending 
		When Siloam085 Sales Menekan Tombol Reset Pending
    Then Siloam085 Validasi Start Date End Date Kosong Pending
    
    Scenario: Siloam085 Form Return Sales Input Start End Date Tekan Filter Pilih
		Given Siloam085 Sales Sudah Login Dan Berada Di Halaman Form Return Pilih
		When  Siloam085 Sales Input Start Date Pilih
		And  Siloam085 Sales Input End Date Pilih
		And  Siloam085 Sales Tekan Tombol Filter Pilih
    Then Siloam085 Validasi Data Pilih Tampil Pada Halaman Form Return
    
     Scenario: Siloam085 Form Return Sales Tekan Reset Pilih
		Given Siloam085 Sales Sudah Login Dan Sudah Input Start Date End Date Status Dan Tekan Filter Pilih 
		When Siloam085 Sales Menekan Tombol Reset Pilih
    Then Siloam085 Validasi Start Date End Date Kosong Pilih
    
  