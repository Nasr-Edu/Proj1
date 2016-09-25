/**
 * 
 */
package proj1.lib;

/**
 * @author nasro
 *
 */
public class Example1 {
	private int a;
	public Example1() {a=10;} 
//adding new copy construtor
	public Example1(Example1 e) {this.a=e.a;} 
}
