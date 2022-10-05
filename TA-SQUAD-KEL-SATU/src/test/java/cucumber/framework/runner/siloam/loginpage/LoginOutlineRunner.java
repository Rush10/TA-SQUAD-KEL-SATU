package cucumber.framework.runner.siloam.loginpage;

/*
created_by : Novri
created_date : 29/09/2022
updated_by : Manda
updated_date : 30/09/2022
*/

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/test/resources/features/siloam-outline/001ValidAdminLogin.feature",
		"src/test/resources/features/siloam-outline/005ValidSalesLogin.feature",
		"src/test/resources/features/siloam-outline/010InvalidAdminLogin.feature",
		"src/test/resources/features/siloam-outline/015InvalidAdminLoginEmpty.feature",
		"src/test/resources/features/siloam-outline/018InvalidSalesLogin.feature",
		"src/test/resources/features/siloam-outline/019InvalidSalesLoginEmpty.feature",
		},
glue = "cucumber.framework.runner.siloam.loginpage",
monochrome=true,
plugin = {"pretty","html:target/siloam/htmlreport/LoginRunnerOutline.html",
		"json:target/siloam/jsonreport/LoginRunnerOutline.json",
		"junit:target/siloam/junitreport/LoginRunnerOutline.xml"})
public class LoginOutlineRunner extends AbstractTestNGCucumberTests{}