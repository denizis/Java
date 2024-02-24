
public class Main {
public static void main(String[] args) {
	//BaseLogger [] loggers= new BaseLogger[] {new FileLogger(),new EmailLogger(),new DataBaseLogger()};
	//EmailLogger logger= new EmailLogger();
   	//logger.Log("Log mesajı");
	
	//for(BaseLogger logger:loggers) {
		
	//	logger.Log("Log mesajı");
	//}
	
	CustomerManager customerManager= new CustomerManager(new DataBaseLogger());
	customerManager.Add();
	
	
	
	
}
}
