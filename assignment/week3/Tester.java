package rahul.assignment.week3;
import java.util.*;
public class Tester {
    public void testLogAnalyzer() {
   	 LogAnalyzer la = new LogAnalyzer();
   	 la.readFile("/home/zadmin/Downloads/UniqueIPData/short-test_log");
   	 la.printAll();
   }
    public void testUniqIP() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("/home/zadmin/Downloads/UniqueIPData/short-test_log");
		int uniqueIPs = la.countUniqueIPs();
		System.out.println("There are " + uniqueIPs + " IPs");
	}
    public void testprintAllHigherThanNum() {
    	int num = 200;
    	LogAnalyzer la = new LogAnalyzer();
   	 	la.readFile("/home/zadmin/Downloads/UniqueIPData/short-test_log");
   	 	la.printAllHigherThanNum(num);
	}
	public void testuniqueIPVisitsOnDay() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("/home/zadmin/Downloads/UniqueIPData/short-test_log");
		ArrayList<String> IPb = la.uniqueIPVisitsOnDay("Sep 30");
		System.out.println(IPb);
	}
	public void testcountUniqueIPsInRange() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("/home/zadmin/Downloads/UniqueIPData/short-test_log");
		int countIPs = la.countUniqueIPsInRange(200,299);
		System.out.println("There are " + countIPs + " unique IP addresses that have a status code from 200 to 299");
	}
	public void testCounts() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("/home/zadmin/Downloads/UniqueIPData/short-test_log");
		HashMap<String, Integer> counts = la.countVisitsPerIP();
		System.out.println(counts);
	}
	public void testmostNumberVisitsByIP() {
		LogAnalyzer la = new LogAnalyzer();
		la.readFile("/home/zadmin/Downloads/UniqueIPData/short-test_log");
		System.out.println(la.mostNumberVisitsByIP(la.countVisitsPerIP()));
	}
}
