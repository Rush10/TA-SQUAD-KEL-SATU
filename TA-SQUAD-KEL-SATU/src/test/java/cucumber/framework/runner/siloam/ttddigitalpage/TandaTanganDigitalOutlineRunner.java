package cucumber.framework.runner.siloam.ttddigitalpage;

//#created_by : Alamanda
//#created_date : 31/09/2022
//#updated_by : Alamanda
//#updated_date : 3/10/2022 

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/features/siloam-outline/101SalesHapusFileUploadBefore.feature",
		"src/test/resources/features/siloam-outline/102SalesHapusFileUploadAfter.feature",
		"src/test/resources/features/siloam-outline/103SalesHapusFileUploadTTD.feature",
		
		"src/test/resources/features/siloam-outline/104UpdateDataSalesSatuKombinasi.feature",
		"src/test/resources/features/siloam-outline/105UpdateDataSalesDuaKombinasi.feature",
		"src/test/resources/features/siloam-outline/110UpdateDataSalesTigaKombinasi.feature",
		"src/test/resources/features/siloam-outline/115UpdateDataSalesEmpatKombinasi.feature",
		"src/test/resources/features/siloam-outline/120UpdateDataSalesLimaKombinasi.feature",
		
		"src/test/resources/features/siloam-outline/125SalesInvalidEditDataSatuKombinasiKosong.feature",
		"src/test/resources/features/siloam-outline/130SalesInvalidEditDataDuaKombinasiKosong.feature",
		"src/test/resources/features/siloam-outline/135SalesInvalidEditDataTigaKombinasiKosong.feature",
		"src/test/resources/features/siloam-outline/140SalesInvalidEditDataEmpatKombinasiKosong.feature",
		"src/test/resources/features/siloam-outline/145SalesInvalidEditDataLimaKombinasiKosong.feature",
		"src/test/resources/features/siloam-outline/150SalesInvalidEditDataBPJSKurangKarakter.feature",
		"src/test/resources/features/siloam-outline/155SalesInvalidEditDataNoKTPKurangKarakter.feature",
		
		"src/test/resources/features/siloam-outline/210TTDDigitalFiturDocument.feature",
		"src/test/resources/features/siloam-outline/215TTDDigitalFiturFileUpload.feature",
		
		"src/test/resources/features/siloam-outline/220TTDDigitalMenekanSubmit.feature",
		
		"src/test/resources/features/siloam-outline/385SalesUploadDokumenBeforeValid.feature",
		"src/test/resources/features/siloam-outline/390SalesUploadDokumenAfterValid.feature",
		"src/test/resources/features/siloam-outline/395SalesUploadDokumenTTDDigitalValid.feature",
		
		"src/test/resources/features/siloam-outline/400SalesUploadDokumenBeforeInvalid.feature",
		"src/test/resources/features/siloam-outline/405SalesUploadDokumenAfterInvalid.feature",
		"src/test/resources/features/siloam-outline/410SalesUploadDokumenTTDDigitalInvalid.feature",
		},
glue = "cucumber.framework.runner.siloam.ttddigitalpage",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/TTDDigitalRunnerOutline.html",
		"json:target/siloam/jsonreport/TTDDigitalRunnerOutline.json",
		"junit:target/siloam/junitreport/TTDDigitalRunnerOutline.xml"})

public class TandaTanganDigitalOutlineRunner extends AbstractTestNGCucumberTests{}

