package pageObjects;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import helper.LoggerHelper;
import util.ManagerUtil;


       public class StrategyMap extends BasePage {
	    Logger log = LoggerHelper.getLogger(LoggerHelper.class);
		public StrategyMap(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
		//SaveDraft
		
		   @FindBy(how = How.XPATH, using = "//a[contains(text(),'Strategy map')]")
		   private WebElement strategyMap;
		 
		    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary ml-auto']")
		    private WebElement CreateStrategy;
		    
		    @FindBy(how = How.XPATH, using = "//input[@id='title']")
		    private WebElement CreateTitle;
		    
		    @FindBy(how = How.XPATH, using = "//textarea[@name='goal']")
		    private WebElement CreateGoal;
		    
		    @FindBy(how = How.XPATH, using = "//textarea[@name='objective']")
		    private WebElement CreateObjective;
		    
		    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add More')]")
		    private WebElement AddMorebutton;
		    
		    @FindBy(how = How.XPATH, using = "//input[@id='strategyLvl0']")
		    private WebElement Level1perpective;
		    
		    @FindBy(how = How.XPATH, using = "//input[@id='strategyLvl1']")
		    private WebElement Level2Theme;
		    
		    @FindBy(how = How.XPATH, using = "//input[@id='strategyLvl2']")
		    private WebElement Level3Objective;
		    
		    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
		    private WebElement SaveButton;
		   
		   @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Strategy')]")
		   private WebElement Strategylabel;
		   
           @FindBy(how = How.XPATH, using = "//input[@id='name']")
		   private WebElement Level1;
           
           @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
		   private WebElement AddButton;
           
           @FindBy(how = How.XPATH, using = "(//i[@class='fas fa-ellipsis-h ml-2'])[1]")
		   private WebElement Options1;
           
           @FindBy(how = How.XPATH, using = "(//i[@class='fas fa-ellipsis-h ml-2'])[last()]")
		   private WebElement Options2;
           
           @FindBy(how = How.XPATH, using = "//button[contains(text(),'Back')]")
		   private WebElement Backbutton;
           
           //EditStrategy with Update
           
           
           @FindBy(how = How.XPATH, using = "(//i[@id='dropdownMenuButton'])[1]")
		   private WebElement Edit1;
           
           @FindBy(how = How.XPATH, using = "(//i[@id='dropdownMenuButton'])[2]")
		   private WebElement Edit2;
           
           @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Edit')])[1]")
		   private WebElement Editbutton;
           
         
           @FindBy(how = How.XPATH, using = "//input[@id='name']")
		   private WebElement Editlabel;
           
           @FindBy(how = How.XPATH, using = "//button[contains(text(),'Update')]")
		   private WebElement Updatebutton;
           
           //Edit with continue
           
           @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
		   private WebElement Continuebutton;
           
           //View Details
           
           
           @FindBy(how = How.XPATH, using = "//button[contains(text(),'View Details')]")
		   private WebElement ViewDetailsbutton;
           
           @FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
		   private WebElement Cancelbutton;
           
           //Link 
           
           @FindBy(how = How.XPATH, using = "//a[contains(text(),'Link')]")
		   private WebElement Linkbutton;
           
           @FindBy(how = How.XPATH, using = "//div[@class='c-btn form-control']")
		   private WebElement SelectNodes;
           
           
           @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[1]")
		   private WebElement Checkbox;
           
           //Publish
           
           
           @FindBy(how = How.XPATH, using = "//button[contains(text(),'Publish')]")
		   private WebElement Publish;
           
           //Clone
           
           @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Clone')])[1]")
		   private WebElement Clonelabel;
           
           @FindBy(how = How.XPATH, using = "//input[@id='cloneName']")
		   private WebElement CloneName;
           
           @FindBy(how = How.XPATH, using = "//button[contains(text(),'Clone')]")
		   private WebElement Clonebutton;
           
           
           //Delete
           
           @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Delete')])[1]")
		   private WebElement Deletebutton;
           
           @FindBy(how = How.XPATH, using = " //button[contains(text(),'Confirm')]")
		   private WebElement Confirmbutton;
           
        
           
           
		 
		 
		 public void StrategyMapMethod() {
			    try {
			    	waitFor(9000);
			        click(strategyMap);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
		 }
		 
		 public void CreateStrategyMethod() {
			    try {
			    	waitFor(6000);
			        click(CreateStrategy);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
		 }
		 
		 
		 
		 public void TitleMethod(String text) {
			    try {
			    	waitFor(5000);
			        writeText(CreateTitle, text);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}

			public void GoalMethod(String text) {
			    try {
			        writeText(CreateGoal, text);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}
			public void ObjectiveMethod(String text) {
			    try {
			        writeText(CreateObjective, text);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}

			public void AddMoreClick() {
			    try {
			    	waitFor(5000);
			        click(AddMorebutton);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}

			public void EnterLevel0(String text) {
			    try {
			    	
			        writeText(Level1perpective, text);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}

			public void EnterLevel1(String text) {
			    try {
			    	waitFor(3000);
			    	//click(AddMorebutton);
			        writeText(Level2Theme, text);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}
			
			public void EnterLevel2(String text) {
			    try {
			    	waitFor(3000);
			    	click(AddMorebutton);
			        writeText(Level3Objective, text);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}
			

			public void SaveClick() {
			    try {
			    	
			        click(SaveButton);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
			}
			
			public void verifyStrategylabel() {
				try {
					log.info("Entered verifyCreateScorecardLable");
					Assert.assertEquals(Strategylabel.getText(), "Strategy",
							"Strategy lablel is not displaying hence >>> Failed");
					log.info("Executed StartegyLabel Successfully");
				} catch (Exception e) {
					log.error("Executed StrategyLabel Not Successfully");
					e.printStackTrace();
					throw e;
				}
			}
			
			public void AddPerspective(String Perspective)
			{
				WebElement ele = webDriver
						.findElement(By.xpath("//button[contains(text(),'Add "+ Perspective+"')]"));
				click(ele);
				
			}
			
			public void AddTheme(String Theme)
			{
				WebElement ele = webDriver
						.findElement(By.xpath("//a[contains(text(),'Add "+ Theme+"')]"));
				click(ele);
				
			}
			
//			public void AddPerspective1(String Perspective1)
//			{
//				WebElement ele = webDriver
//						.findElement(By.xpath("//button[contains(text(),'Add "+ Perspective1+"')]"));
//				click(ele);
//				
//			}
//			
			 public void CreateLevel1(String ele1) {
				    try {
				    	waitFor(5000);
				        click(Level1);
				        writeText(Level1,ele1);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 public void AddButtonprimary() {
				    try {
				    	waitFor(5000);
				        click(AddButton);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 } 
			 
			 public void ClickOption1() {
				 try {
			    	waitFor(5000);
			    	 clickOnElementByJs(Options1);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
		 } 
		 
			 public void ClickOption2() {
				 try {
			    	waitFor(5000);
			    	 clickOnElementByJs(Options2);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
		 } 

			 public void ClickBack() {
				 try {
			    	waitFor(5000);
			    	 click(Backbutton);
			    } catch (Exception e) {
			        e.printStackTrace();
			    }
		 } 
			 
			 //Edit Strategy with update
			 
			 public void Editdots() {
				 try {
				    	waitFor(5000);
				    	 click(Edit1);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 
			 public void Editdots2() {
				 try {
				    	waitFor(5000);
				    	 click(Edit2);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 
			 
			 public void Editbuttonlabel() {
				 try {
				    	waitFor(5000);
				    	 click(Editbutton);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 public void EditText(String text) {
				 try {
				    	waitFor(5000);
				    	click(Editlabel);
				    	 clear(Editlabel);
				    	 writeText(Editlabel, text);
				    	 } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 
			 public void Updatebuttonlabel() {
				 try {
				    	waitFor(5000);
				    	 click(Updatebutton);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 //Edit with continue
			 
			 public void Continuebuttonlabel() {
				 try {
				    	waitFor(5000);
				    	 click(Continuebutton);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 //View Details
			 
			 
			 public void Viewbuttonlabel() {
				 try {
				    	waitFor(5000);
				    	 click(ViewDetailsbutton);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 public void Cancelbuttonlabel() {
				 try {
				    	waitFor(5000);
				    	 click(Cancelbutton);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 //Link 
			 
			 public void Linkbuttonlabel() {
				 try {
				    	waitFor(5000);
				    	 click(Linkbutton);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 public void SelectNodes() {
				 try {
				    	waitFor(7000);
				    	 click(SelectNodes);
				    	 clickOnElementByJs(Checkbox);
				    	 click(SelectNodes);
				    } catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 
			 //Publish 
			 public void Publishbuttonlabel() {
				 try {
				    	waitFor(5000);
				    	 click(Publish);
				    	} catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 //Clone
			 
			 public void Clonelabel() {
				 try {
				    	waitFor(5000);
				    	 click(Clonelabel);
				    	} catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 public void CloneName(String text) {
				 try {
				    	waitFor(5000);
				    	 writeText(CloneName, text);
				    	} catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 public void Clonebutton() {
				 try {
				    	waitFor(5000);
				    	 click(Clonebutton);
				    	} catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 //Delete
			 
			 public void Deletebuttonlabel() {
				 try {
				    	waitFor(5000);
				    	 click(Deletebutton);
				    	} catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 
			 public void Confirmbuttonlabel() {
				 try {
				    	waitFor(5000);
				    	 click(Confirmbutton);
				    	} catch (Exception e) {
				        e.printStackTrace();
				    }
			 }
			 
			 
			 
			 
       }
       
		 