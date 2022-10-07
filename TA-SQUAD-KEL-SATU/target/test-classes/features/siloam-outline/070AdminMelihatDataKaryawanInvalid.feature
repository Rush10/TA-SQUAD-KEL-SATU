#created_by : Adit
#created_date : 1/10/2022
#updated_by : -
#updated_date : -

Feature: Admin Melihat Data Karyawan Invalid

  Scenario: Siloam070 Admin Melihat Data Karyawan Invalid Empty
		When Siloam070 Admin Sudah Login Dan Berada Di Dalam Halaman View Dan Export
    And Siloam070 Admin Memasukkan <startdate> <enddate>
    And Siloam070 Admin Klik Tombol Filter
    Then Siloam070 Validasi Start Date End Date Kosong 
    
   #3 data
  Examples: 
  |startdate|enddate|
	|||
	|2022-09-14||
	||2022-09-18|
	