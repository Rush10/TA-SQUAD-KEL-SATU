package cucumber.framework.runner.siloam.viewexportpageoutline;

/*
created_by : Adit
created_date : 01/10/2022
updated_by : -
updated_date : -
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/siloam-outline/070AdminMelihatDataKaryawanInvalid.feature"},
glue = "cucumber.framework.runner.siloam.viewexportpageoutline",
monochrome=true,
plugin = {"pretty","html:target/siloamoutline/htmlreport/ViewExportPageInvalid.html",
		"json:target/siloamoutline/jsonreport/ViewExportPageInvalid.json",
		"junit:target/siloamoutline/junitreport/ViewExportPageInvalid.xml"})

public class ViewExportRunnerOutline extends AbstractTestNGCucumberTests {}
