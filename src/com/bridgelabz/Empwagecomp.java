/**
 * 
 */
package com.bridgelabz;

/**
 * @author My self
 *
 */
public class Empwagecomp {

	/**
	 * @param args
	 */
			private static final int FULL_DAY_WORKING_HOURS = 8;
			private static final int WAGE_PER_HOUR = 20;
			private static final int DAILY_WAGE = FULL_DAY_WORKING_HOURS * WAGE_PER_HOUR;

			public static void main(String[] args) {
				
				System.out.println("-->Welcome to Employee Wage Computation<--");
				
			}

			public static int getDailyWage() {
				return DAILY_WAGE;
			}	
			}