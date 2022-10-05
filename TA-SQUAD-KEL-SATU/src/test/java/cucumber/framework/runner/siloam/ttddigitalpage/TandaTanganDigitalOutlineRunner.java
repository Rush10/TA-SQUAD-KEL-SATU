package cucumber.framework.runner.siloam.ttddigitalpage;

//#created_by : Alamanda
//#created_date : 31/09/2022
//#updated_by : Alamanda
//#updated_date : 3/10/2022 

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/features/siloam-outline/370SalesHapusFileUploadBefore.feature",
		"src/test/resources/features/siloam-outline/375SalesHapusFileUploadAfter.feature",
		"src/test/resources/features/siloam-outline/380SalesHapusFileUploadTTD.feature",
		},
glue = "cucumber.framework.runner.siloam.ttddigitalpage",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/TTDDigitalRunnerOutline.html",
		"json:target/siloam/jsonreport/TTDDigitalRunnerOutline.json",
		"junit:target/siloam/junitreport/TTDDigitalRunnerOutline.xml"})

public class TandaTanganDigitalOutlineRunner extends AbstractTestNGCucumberTests{}

