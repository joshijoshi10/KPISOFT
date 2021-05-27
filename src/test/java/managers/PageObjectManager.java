package managers;

import org.openqa.selenium.WebDriver;

import config.ConfigFileReader;
import pageObjects.*;

public class PageObjectManager {

	private WebDriver webDriver;
	private String baseURL;
	private LoginPage loginPage;
	private HomePage homePage;
	private PerformanceProgramPage performancePage;
	private PerformanceProgramListPage listPage;
	private PerformanceProgramMonitorPage monitorPage;
	private OrganizationListPage orgList;
	private CheckInCreationPage checkinPage;
	private CompetencyProgramPage compPage;
	private CreateTenantPage tenantpage;
	private ForgotPasswordPage forgotPage;;
	private MailTrapPage mailtrapPage;
	private AnnouncementsPage announcementsPage;
	private CreateKpiPage createKpi;
	private ReviewTheirScorecardPage reviewpage;
	private VerifyTheirScorecardPage verifypage;
	private ActualScorecardPage actualpage;
	private TriggerReviewPage triggerReviewPage;
	private SwitchUserPage switchuserPage;
	private SwitchUserPermissionPage switchuserpermissionPage;
	private RemovingSwitchUserAccessPage removingswitchuseraccessPage;
	private JobCategorypage jobCategorypage;
	private JobGradepage jobGradepage;
	private UserGrouppage userGrouppage;
	private ChangeLanguagepage changelanguagepage;
	private UserAnnouncementPage userannouncementpage;
	private OrgUnitTypePage orgunitypepage;
	private OrgCategory orgcategory;
	private PositionPage positionpage;
	private EmployeeCustomEntityPage employeecustomentity;
	private UOMPage uompage;
	private CustomerOnBoardingPage CustomeronBoarding;
	private MobileAppManagmentPage MobileAppManagementpage;
	private BulkImageUploadPage BulkImageUploadPage;
	private StrategyPage strategyPage;
	private Designation designationpage;
	private EmployementType employementypepage;
	private Roles_PermissionPage roles_permissionpage;
	private EmployeePage employeepage;
	private SubmitPerformancePage submitperformance;
	private ApproveReviewPage ApproveReviewPage;
	private AskKpiReviewPage AskKpiReviewpage;
	private VerifyReviewPage VerifyReviewPage;
	private ReviewScorecardPublishedPage ReviewScorecardPublishedPage;
	private TakeKpiFromSupervisorPage TakeKpiFromSupervisorPage;
	private KpiLibraryPage kpiLibrary;
	private BuildDetailsPage buildDetails;
    private Kpi_KpiRelationshipPage kpi_Kpi_RelationshipPage;
	private AggregrateTeamScorePage aggregrateTeamScorePage;
	private Like_Share_CommentPage like_Share_CommentPage;
	private CalibrationProgam calibrationcreation;
	private Email_NotificationPage email_NotificationPage;
	private TenantPreferencePage tenantPreferencepage;
	private CloneKpiPage cloneKpiPage;
	private SettingsPage settingsPage;
	private ProfilePage profilePage;
	private DBConnection dbConnectionPage;
	private ProgramManagement program;
//	private ScorecardPublishedPage scorecardPublishpage;
	


	public PageObjectManager(WebDriver webDriver, String baseURL) {
		this.webDriver = webDriver;
		this.baseURL = baseURL;
	}

	public LoginPage getLoginPage() {
		return (this.loginPage == null) ? new LoginPage(webDriver, this.baseURL) : this.loginPage;
				   
	}
	
	public DBConnection getdbConnectionPage() {
		return (this.dbConnectionPage == null) ? new DBConnection(webDriver) : this.dbConnectionPage;
				  
	}	
	
	public ProfilePage getProfilePage() {
		return (this.profilePage == null) ? new ProfilePage(webDriver) : this.profilePage;
				  
	}
	
	public ProgramManagement getProgramManagement() {
		return (this.program == null) ? new ProgramManagement(webDriver) : this.program;
				  
	}
	
	public HomePage getHomePage() {
		return (this.homePage == null) ? new HomePage(webDriver) : this.homePage;
				  
	}
	
	public SettingsPage getSettingsPage() {
		return (this.settingsPage == null) ? new SettingsPage(webDriver) : this.settingsPage;
				   
	}

	public PerformanceProgramPage getPerforamceProgram() {
		return (this.performancePage == null) ? new PerformanceProgramPage(webDriver) : this.performancePage;
									  
	}

	public PerformanceProgramListPage getPerformanceProgramListPage() {
		return (listPage == null) ? new PerformanceProgramListPage(webDriver) : listPage;
			 
	}

	public PerformanceProgramMonitorPage getPerformanceProgramMonitorPage() {
		return (monitorPage == null) ? new PerformanceProgramMonitorPage(webDriver) : monitorPage;

	}

	public CheckInCreationPage getCheckInCreationPage() {
		return (checkinPage == null) ? new CheckInCreationPage(webDriver) : checkinPage;
				
	}

	public CompetencyProgramPage getCompetencyProgramPage() {
		return (compPage == null) ? new CompetencyProgramPage(webDriver) : compPage;
			 
	}

	public OrganizationListPage getOrganizationListPage() {
		return (orgList == null) ? new OrganizationListPage(webDriver) : orgList;
			
	}

	public CreateTenantPage getCreateTenantPage() {
		return (tenantpage == null) ? new CreateTenantPage(webDriver) : tenantpage;
			   
	}

	public ForgotPasswordPage getForgotPasswordPage() {
		return (forgotPage == null) ? new ForgotPasswordPage(webDriver) : forgotPage;
			   
	}

	public MailTrapPage getMailTrapPage() {
		return (mailtrapPage == null) ? new MailTrapPage(webDriver,ConfigFileReader.getmailtrap_url()) : mailtrapPage;
				 
	}

	public AnnouncementsPage getAnnouncementsPage() {
		return (announcementsPage == null) ? new AnnouncementsPage(webDriver) : announcementsPage;
					  
	}

	public CreateKpiPage getCreateKpiPage() {
		return (createKpi == null) ? new CreateKpiPage(webDriver) : createKpi;
	}

	public ReviewTheirScorecardPage getReviewTheirScorecardPage() {
		return (reviewpage == null) ? new ReviewTheirScorecardPage(webDriver) : reviewpage;
			   
	}

	public VerifyTheirScorecardPage getVerifyTheirScorecardPage() {
  
		return (verifypage == null) ? new VerifyTheirScorecardPage(webDriver) : verifypage;
	}

	public ActualScorecardPage getActualScorecardPage() {
  
		return (actualpage == null) ? new ActualScorecardPage(webDriver) : actualpage;
	}

	public TriggerReviewPage getTriggerReviewPage() {
  
		return (triggerReviewPage == null) ? new TriggerReviewPage(webDriver) : triggerReviewPage;
	}

	public SwitchUserPage getSwitchUserPage() {
  
		return (this.switchuserPage == null) ? new SwitchUserPage(webDriver) : switchuserPage;
	}

	public SwitchUserPermissionPage getSwitchUserPermissionPage() {
  
		return (this.switchuserpermissionPage == null) ? new SwitchUserPermissionPage(webDriver)
				: this.switchuserpermissionPage;
	}

	public RemovingSwitchUserAccessPage getRemovingSwitchUserAccessPage() {
  
		return (this.removingswitchuseraccessPage == null) ? new RemovingSwitchUserAccessPage(webDriver)
				: this.removingswitchuseraccessPage;
	}

	public JobCategorypage getJobCategorypage() {
  
		return (jobCategorypage == null) ? new JobCategorypage(webDriver) : jobCategorypage;
	}

	public JobGradepage getJobGradepage() {
  
		return (jobGradepage == null) ? new JobGradepage(webDriver) : jobGradepage;
	}

	public UserGrouppage getUserGrouppage() {
  
		return (userGrouppage == null) ? new UserGrouppage(webDriver) : userGrouppage;
	}

	public ChangeLanguagepage getChangeLanguagepage() {
  
		return (changelanguagepage == null) ? new ChangeLanguagepage(webDriver) : changelanguagepage;
	}

	public UserAnnouncementPage getUserAnnouncementPage() {
  
		return (userannouncementpage == null) ? new UserAnnouncementPage(webDriver) : userannouncementpage;
	}

	public OrgUnitTypePage getOrgUnitTypePage() {
  
		return (orgunitypepage == null) ? new OrgUnitTypePage(webDriver) : orgunitypepage;
	}

	public OrgCategory getOrgCategory() {
  
		return (orgcategory == null) ? new OrgCategory(webDriver) : orgcategory;
	}

	public PositionPage getPositionPage() {
  
		return (positionpage == null) ? new PositionPage(webDriver) : positionpage;
	}

	public EmployeeCustomEntityPage getEmployeeCustomEntityPage() {
  
		return (employeecustomentity == null) ? new EmployeeCustomEntityPage(webDriver) : employeecustomentity;
	}

	public UOMPage getUomPage() {
  
		return (uompage == null) ? new UOMPage(webDriver) : uompage;
	}

	public CustomerOnBoardingPage getCustomerOnBoardingPage() {
  
		return (CustomeronBoarding == null) ? new CustomerOnBoardingPage(webDriver) : CustomeronBoarding;
	}

	public MobileAppManagmentPage getMobileAppManagmentPage() {
  
		return (MobileAppManagementpage == null) ? new MobileAppManagmentPage(webDriver) : MobileAppManagementpage;
	}

	public BulkImageUploadPage getBulkImageUploadPage() {
  
		return (BulkImageUploadPage == null) ? new BulkImageUploadPage(webDriver) : BulkImageUploadPage;
	}

	public StrategyPage getStrategyPage() {
		return (strategyPage == null) ? new StrategyPage(webDriver) : strategyPage;
	}

	public Designation getdesignationPage() {
		return (designationpage == null) ? new Designation(webDriver) : designationpage;
	}

	public EmployementType getEmployementTypePage() {
		return (employementypepage == null) ? new EmployementType(webDriver) : employementypepage;
	}

	public Roles_PermissionPage getRoles_permissionPage() {
		return (roles_permissionpage == null) ? new Roles_PermissionPage(webDriver) : roles_permissionpage;
																					  
	}

	public EmployeePage getemployeepage() {
  
		return (employeepage == null) ? new EmployeePage(webDriver) : employeepage;
	}
	
	public SubmitPerformancePage getSubmitPerformancePage()
	{
		return(submitperformance==null)? new  SubmitPerformancePage(webDriver):submitperformance;
	}
	public ApproveReviewPage getApproveReviewPage()
	{
		return(ApproveReviewPage==null)? new ApproveReviewPage(webDriver):ApproveReviewPage;
	}
	public AskKpiReviewPage getAskKpiReviewPage()
	{
		return(AskKpiReviewpage==null)? new AskKpiReviewPage(webDriver):AskKpiReviewpage;
	}
	public VerifyReviewPage getVerifyReviewPage()
	{
		return(VerifyReviewPage==null)? new VerifyReviewPage(webDriver):VerifyReviewPage;
	}
	public ReviewScorecardPublishedPage getReviewScorecardPublishedPage()
	{
		return(ReviewScorecardPublishedPage==null)? new ReviewScorecardPublishedPage(webDriver):ReviewScorecardPublishedPage;
	}
	public TakeKpiFromSupervisorPage getTakeKpiFromSupervisorPage()
	{
		return(TakeKpiFromSupervisorPage==null)? new TakeKpiFromSupervisorPage(webDriver):TakeKpiFromSupervisorPage;
	}
	public KpiLibraryPage getKpiLibraryPage()
	{
		return(kpiLibrary==null)? new  KpiLibraryPage(webDriver):kpiLibrary;
	}
	public BuildDetailsPage getBuildDetailsPage()
	{
		return(buildDetails==null)? new  BuildDetailsPage(webDriver):buildDetails;
	}
	public Kpi_KpiRelationshipPage getKpi_KpiRelationshipPage()
	{
		return(kpi_Kpi_RelationshipPage==null)? new Kpi_KpiRelationshipPage(webDriver):kpi_Kpi_RelationshipPage;
	}
	public AggregrateTeamScorePage getAggregrateTeamScorePage()
	{
		return(aggregrateTeamScorePage==null)? new AggregrateTeamScorePage(webDriver):aggregrateTeamScorePage;
	}
	public Like_Share_CommentPage getLike_Share_CommentPage()
	{
		return(like_Share_CommentPage==null)? new Like_Share_CommentPage(webDriver):like_Share_CommentPage;
	}
	public Email_NotificationPage getEmail_NotificationPage()
	{
		return(email_NotificationPage==null)? new Email_NotificationPage(webDriver):email_NotificationPage;
	}
	public TenantPreferencePage getTenantPreferencePage() {
		return (tenantPreferencepage == null) ? new TenantPreferencePage(webDriver) : tenantPreferencepage;
	}
	public CloneKpiPage getCloneKpiPage() {
		return (cloneKpiPage == null) ? new CloneKpiPage(webDriver) : cloneKpiPage;
	}
	//public ScorecardPublishedPage getScorecardPublishedPage() {
		
	//	return (scorecardPublishpage == null) ? new ScorecardPublishedPage(webDriver) : scorecardPublishpage;
	//}



}
