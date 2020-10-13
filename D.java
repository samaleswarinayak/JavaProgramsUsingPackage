/*Use of package in java for outside of package */

package folder2;
import folder1.A;
class D
{
	public static void main(String args[])
	{
		A ob = new A();
		ob.show();
	}
}