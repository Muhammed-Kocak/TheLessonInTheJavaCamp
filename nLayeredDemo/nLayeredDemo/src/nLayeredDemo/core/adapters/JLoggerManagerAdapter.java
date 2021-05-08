package nLayeredDemo.core.adapters;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	private JLoggerManager jLoggerManager;
	
	public JLoggerManagerAdapter(JLoggerManager jLoggerManager) {
		this.jLoggerManager = jLoggerManager;

	}
	
	@Override
	public void logToSystem(String message) {
		this.jLoggerManager.log(message);
	}

}
