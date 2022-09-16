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




