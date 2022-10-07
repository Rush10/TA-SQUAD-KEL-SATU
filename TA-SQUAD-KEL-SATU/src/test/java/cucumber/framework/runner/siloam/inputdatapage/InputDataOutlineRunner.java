package cucumber.framework.runner.siloam.inputdatapage;

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
		"src/test/resources/features/siloam-outline/299SalesTekanMenuInput.feature",
		"src/test/resources/features/siloam-outline/300ValidSalesInputData.feature",
		"src/test/resources/features/siloam-outline/305SalesTidakInputData.feature",
		"src/test/resources/features/siloam-outline/310SalesInputDataSalahFormat.feature",
		"src/test/resources/features/siloam-outline/315SalesInputDataBPJSYangSudahAda.feature",
		"src/test/resources/features/siloam-outline/320SalesInputDataSatuKombinasiKosong.feature",
		"src/test/resources/features/siloam-outline/325SalesInputDataDuaKombinasiKosong.feature",
		},
glue = "cucumber.framework.runner.siloam.inputdatapage",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/InputDataRunnerOutline.html",
		"json:target/siloam/jsonreport/InputDataRunnerOutline.json",
		"junit:target/siloam/junitreport/InputDataRunnerOutline.xml"})
public class InputDataOutlineRunner extends AbstractTestNGCucumberTests{}