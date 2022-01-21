package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	
	/** 
	 * @return DefaultCountingOutRhymer
	 	zwraca obiekt klasy DefaultCountingOutRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	
	/** 
	 * @return DefaultCountingOutRhymer
	 * zwraca obiekt klasy DefaultCountingOutRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	
	/** 
	 * @return DefaultCountingOutRhymer
	 * zwraca obiekt klasy DefaultCountingOutRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	
	/** 
	 * @return DefaultCountingOutRhymer
	 */
	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
