/**
 * 
 */
package tuto.strategy;

/**
 * @author moi
 * @param <T>
 *
 */
public interface Strategy<T> {

	public T processing(T data);
}
