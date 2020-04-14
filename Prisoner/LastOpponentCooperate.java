/* Created by Allan 4/12/2020
 * 
 * 
 * 
 */
package Prisoner;

public class LastOpponentCooperate extends Cooperate{
public LastOpponentCooperate(Prisoner p) {
		super(p);
	}

public boolean cooperate() {
	return prisoner.lastOpponentCooperated;
}
}
