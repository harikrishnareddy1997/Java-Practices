
package com.cts.javaTraining;

/**
 * @author 776480
 * 
 *
 */
public class ForLoop {

	public static void main(String[] args) {
		int i = 1;
		for (; i <= 10;) {
			System.out.println();
			{
				for (; i <= 20;) {
					System.out.println(i++);
					{
						for (;;) {
							System.out.println(i++);
							if (i > 30) {
								break;
							}
						}
					}
				}

			}

		}

	}

}
