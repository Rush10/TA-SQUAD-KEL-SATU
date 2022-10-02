package cucumber.framework.runner.siloam.viewexportpage;

/*
created_by : Adit
created_date : 29/09/2022
updated_by : -
updated_date : -
*/


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features = {
		"src/test/resources/features/siloam/020AdminMelihatDataKaryawan.feature", 
		"src/test/resources/features/siloam/025AdminMelakukanRefresh.feature",
		"src/test/resources/features/siloam/030AdminMelakukanDownload.feature",
		"src/test/resources/features/siloam/035AdminMelakukanExport.feature",
		"src/test/resources/features/siloam/040AdminMenekanView.feature",
		"src/test/resources/features/siloam/045AdminMenekanTombolBack.feature",
		"src/test/resources/features/siloam/050AdminMenekanPreviewData.feature",
//		"src/test/resources/features/siloam/055AdminMenekanLinkFotoFaskesAwal.feature",
//		"src/test/resources/features/siloam/060AdminMenekanLinkFotoFaskesTujuan.feature",
		"src/test/resources/features/siloam/065AdminMenekanLinkPDFAgreement.feature",
		"src/test/resources/features/siloam/075AdminMenekanTombolExportInvalid.feature",
		"src/test/resources/features/siloam/080AdminMenekanTombolDownload.feature"
		},
glue = "cucumber.framework.runner.siloam.viewexportpage",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/ViewExportPage.html",
		"json:target/siloam/jsonreport/ViewExportPage.json",
		"junit:target/siloam/junitreport/ViewExportPage.xml"})

public class ViewExportRunner extends AbstractTestNGCucumberTests{}
