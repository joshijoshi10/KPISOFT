package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CloneKpiPage extends BasePage {

	public CloneKpiPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(how = How.XPATH, using = "//b[text()='Take KPI From Supervisor']")
	private WebElement takeKpi_btn;

	@FindBy(how = How.XPATH, using = "//h5[text()='Take KPI From Supervisor ']")
	private WebElement takeKpi_lbl;

	@FindBy(how = How.XPATH, using = "//button[text()=' Clone ']")
	private WebElement clone_btn;

	@FindBy(how = How.XPATH, using = "(//div[@class='custom-control'])[6]//label")
	private WebElement Own_kpi_chkbox;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Own')]")
	private WebElement ownKpi_btn;

	@FindBy(how = How.XPATH, using = "//input[@class='form-control']")
	private WebElement perspective_txt;

    @FindBy(how = How.XPATH, using = "//input[@class='form-control']/../div/button")
    private List<WebElement> perspective_list;

	@FindBy(how = How.ID, using = "toast-container")
	private WebElement message;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Owned')])[2]")
	private WebElement owned_lbl;

	@FindBy(how = How.XPATH, using = "(//div[@class='custom-control'])[7]//label")
	private WebElement share_kpi_chkbox;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Share')]")
	private WebElement shareKpi_btn;

	@FindBy(how = How.XPATH, using = "(//span[contains(text(),'Shared')])[2]")
	private WebElement shared_lbl;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Support')]")
	private WebElement support_btn;

	@FindBy(how = How.XPATH, using = "(//div[@class='custom-control'])[8]//label")
	private WebElement support_kpi_chkbox;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Supporting')]")
	private WebElement supporting_lbl;

	public void clickOnTakeKpifromSupervisor() {
		try {
			log.info("clicking on take kpi from supervisor!!");
			waitFor(3000);
			click(takeKpi_btn);
			log.info("clicked on take kpi from supervisor!!");
		} catch (Exception e) {
			log.error("error clicking on take kpi from supervisor!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnCloneKpi() {
		try {
			log.info("clicking on clone kpi!!");
			waitFor(3000);
			click(clone_btn);
			log.info("clicked on clone kpi!!");
		} catch (Exception e) {
			log.error("error clicking on clone kpi!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectKpitoCloneOwn() {
		try {
			log.info("selecting kpi to clone!!");
			// waitUntilElementVisible(kpi_chkbox);
			waitFor(2000);
			clickOnElementByJs(Own_kpi_chkbox);
			log.info("selected kpi to clone!!");
		} catch (Exception e) {
			log.error("error selecting kpi to clone!!");
			e.printStackTrace();
			Assert.fail();
		}
	}
	public void setPerspective(String perspective) {
		try {
			log.info("Entered setPerspective");
            click(perspective_txt);
            for (int i = 0; i < perspective_list.size(); i++) {
                WebElement allwebElement = perspective_list.get(i);
                String prseptve = allwebElement.getText();

                if (perspective.equalsIgnoreCase(prseptve)) {
                    waitUntilElementToBeClickable(allwebElement);
                    click(allwebElement);
                } else {
                    System.out.println("Perspective field is not displayed");
                }
                log.info("entered perspective!!");
            }

			log.info("Executed setPerspective Successfully");
		} catch (Exception e) {
			log.error("Executed setPerspective Not Successfully");
			e.printStackTrace();
			throw e;
		}
	}

	public void clickonOwn() {
		try {
			log.info("clicking on own!!");
			waitUntilElementToBeClickable(ownKpi_btn);
			click(ownKpi_btn);
			log.info("clicked on own!!");
			waitFor(5000);
		} catch (Exception e) {
			log.error("error clicking on own!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickOnPerformanceProgramCard(String programName) {
		try {
			log.info("clicking on performance program card!! ");
			clickonCard(programName);
			log.info("clicked on performance program card!! ");
		} catch (Exception e) {
			log.error("error clicking on performance program card!! ");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifyOwnedLabel() {
		try {
			log.info("verifying owned label!!");
			verifyData("Owned", owned_lbl);
			log.info("verified owned label!!");
		} catch (Exception e) {
			log.error("error verifying owned label!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectKpitoCloneShare() {
		try {
			// waitUntilElementVisible(kpi_chkbox);
			waitFor(2000);
			log.info("selecting kpi to clone !!");
			clickOnElementByJs(share_kpi_chkbox);
			log.info("selected kpi to clone !!");
		} catch (Exception e) {
			log.error("error selecting kpi to clone !!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickonshare() {
		try {
			log.info("clicking on share!!");
			click(shareKpi_btn);
			log.info("clicked on share!!");
		} catch (Exception e) {
			log.error("error clicking on share!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifySharedLabel() {
		try {
			log.info("verifying shared label!!");
			waitFor(3000);
			verifyData("Shared", shared_lbl);
			log.info("verified shared label!!");
		} catch (Exception e) {
			log.error("error verifying shared label!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void clickonSupport() {
		try {
			log.info("clicking on support!!");
			click(support_btn);
			log.info("clicked on support!!");
		} catch (Exception e) {
			log.info("error clicking on support!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void selectKpitoCloneSupport() {
		try {
			log.info("selecting kpi to support!!");
			waitFor(2000);
			// waitUntilElementVisible(kpi_chkbox);
			clickOnElementByJs(support_kpi_chkbox);
			log.info("selected kpi to support!!");
		} catch (Exception e) {
			log.error("error selecting kpi to support!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void verifySupportLabel() {
		try {
			log.info("verifying support label");
			waitFor(3000);
			verifyData("Supporting", supporting_lbl);
			log.info("verified support label");
		} catch (Exception e) {
			log.error("error verifying support label");
			e.printStackTrace();
			Assert.fail();
		}
	}
}
