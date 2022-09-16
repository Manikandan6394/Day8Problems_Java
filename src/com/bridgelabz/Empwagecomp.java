/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author My self
 *
 */
public class Empwagecomp {

	/**
	 * @param args
	 */
		
			public static void main(String[] args) {
				
				int Workinghours = 8;
				int WAGEPerHOUR = 20;
				int DailyWage = Workinghours*WAGEPerHOUR;
				int PartTime = 8;
				int WORKING_DAYS_PER_MONTH = 20;
				
				System.out.println("-->Welcome to Employee Wage Computation<--");
				
				
				if (isEmployeePresent()) {
					System.out.println("Employee is PRESENT");
				} else {
					System.out.println("Employee is ABSENT");
				}
			}
			public static boolean isEmployeePresent() {
				return new Random().nextBoolean();
					
								
				int getEmployeeType;
				switch (getEmployeeType) {
				case "Full-time":
					System.out.println("Employment: Full-time");
					break;
				case "Part-time":
					System.out.println("Employment: Part-time");
					break;
				default:
					break;
				}
				long getWagesForMonth() {
					long wages = 0;
				
					for (int i = 1; i <= WORKING_DAYS_PER_MONTH; i++) {
						System.out.println("Day #" + i);
						
						if (isEmployeePresent()) {
							System.out.println("Present");
							wages += DailyWage;
						} else {
							System.out.println("Absent");
						}
					}
					return wages;
				}	
					
					
			}
		}	




