/* Created by Allan 4/12/2020
 * 
 * 
 * 
 */
package Prisoner;

public abstract class Cooperate {
	 Prisoner prisoner;
public Cooperate(Prisoner p) {
	prisoner=p;
}
public abstract boolean cooperate();
}