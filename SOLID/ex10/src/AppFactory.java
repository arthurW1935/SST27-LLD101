
public class AppFactory {

    private static ReportService reportService;
    private static Logger logger;

    public static Logger getLogger(){
        if(logger==null){
            logger = new ConsoleLogger();
        }
        return logger;
    }

    public static ReportService getReportService() {
        if (reportService == null) {
            reportService = new ReportService(getLogger());
        }
        return reportService;
    }

}
