package cucumber.framework.runner.siloam.viewexportpageoutline;

/*
created_by : Adit
created_date : 01/10/2022
updated_by : Adit
updated_date : 03/10/2022
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/features/siloam-outline/020AdminMelihatDataKaryawan.feature", 
		"src/test/resources/features/siloam-outline/025AdminMelakukanRefresh.feature",
		"src/test/resources/features/siloam-outline/030AdminMelakukanDownload.feature",
		"src/test/resources/features/siloam-outline/035AdminMelakukanExport.feature",
		"src/test/resources/features/siloam-outline/040AdminMenekanView.feature",
		"src/test/resources/features/siloam-outline/045AdminMenekanTombolBack.feature",
		"src/test/resources/features/siloam-outline/050AdminMenekanPreviewData.feature",			
//		"src/test/resources/features/siloam-outline/055AdminMenekanLinkFotoFaskesAwal.feature",
//		"src/test/resources/features/siloam-outline/060AdminMenekanLinkFotoFaskesTujuan.feature",
		"src/test/resources/features/siloam-outline/065AdminMenekanLinkPDFAgreement.feature",
		"src/test/resources/features/siloam-outline/075AdminMenekanTombolExportInvalid.feature",
		"src/test/resources/features/siloam-outline/080AdminMenekanTombolDownload.feature",
		"src/test/resources/features/siloam-outline/070AdminMelihatDataKaryawanInvalid.feature",
		"src/test/resources/features/siloam-outline/200AdminMenekanTombolLogout.feature",
		},
glue = "cucumber.framework.runner.siloam.viewexportpageoutline",
monochrome=true,
plugin = {"pretty","html:target/siloamoutline/htmlreport/ViewExportPageInvalid.html",
		"json:target/siloamoutline/jsonreport/ViewExportPageInvalid.json",
		"junit:target/siloamoutline/junitreport/ViewExportPageInvalid.xml"})

public class ViewExportRunnerOutline extends AbstractTestNGCucumberTests {}
