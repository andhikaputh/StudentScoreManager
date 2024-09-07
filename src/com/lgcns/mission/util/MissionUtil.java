package com.lgcns.mission.util;

import java.util.Scanner;

public class MissionUtil {
	Scanner sc = new Scanner(System.in);
	public int getUserIntegerInput() {
		int userint = sc.nextInt();
		return userint;
	}
	
	public double getUserDoubleInput() {
		double userdouble = sc.nextInt();
		return userdouble;
	}
	
	public String getCodeInput() {
		String userstring = sc.nextLine();
		return userstring;
	}
}
