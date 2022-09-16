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
				int PartTime = 8;
			
				
				System.out.println("-->Welcome to Employee Wage Computation<--");
				
				if (isEmployeePresent()) {
					System.out.println("Employee is PRESENT");
				} else {
					System.out.println("Employee is ABSENT");
				}
			}
			public static boolean isEmployeePresent() {
				return new Random().nextBoolean();
			}
		}	




