package cucumber.framework.runner.siloam.uploaddokumenpage;

/*
created_by : Novri
created_date : 03/10/2022
updated_by : -
updated_date : -
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/features/siloam-outline/335SalesUploadDokumenFaskesAwalValid.feature",
		"src/test/resources/features/siloam-outline/340SalesUploadDokumenFaskesTujuanValid.feature",
		"src/test/resources/features/siloam-outline/345SalesUploadDokumenTTDValid.feature",
		"src/test/resources/features/siloam-outline/350SalesUploadSemuaDokumenValid.feature",
		"src/test/resources/features/siloam-outline/355SalesUploadDokumenFaskesAwalInvalid.feature",
		"src/test/resources/features/siloam-outline/360SalesUploadDokumenFaskesTujuanInvalid.feature",
		"src/test/resources/features/siloam-outline/365SalesUploadDokumenTTDInvalid.feature",
		},
glue = "cucumber.framework.runner.siloam.uploaddokumenpage",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/UploadDocumentRunnerOutline.html",
		"json:target/siloam/jsonreport/UploadDocumentRunnerOutline.json",
		"junit:target/siloam/junitreport/UploadDocumentRunnerOutline.xml"})
public class UploadDokumenOutlineRunner extends AbstractTestNGCucumberTests{}