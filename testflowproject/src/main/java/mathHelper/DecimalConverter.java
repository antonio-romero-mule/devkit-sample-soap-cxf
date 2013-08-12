/**
 * 
 */
package mathHelper;

/**
 * @author antonio
 *
 */
public class DecimalConverter {
	static String toDMS(float in) {
		return(String.format("%dd %d' %d",(int)in, (int)((in*60) % 60), (int)((in*3600)% 3600)));
	}
	
	static String toHMS(float in) {
		return(String.format("%d:%d:%d",(int)in, (int)((in*60) % 60), (int)((in*3600)% 3600)));
	}

}
