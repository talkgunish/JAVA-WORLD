import B1.B2.B3.*;
import A1.A2.A3.*;
class Test
{
public static void main(String [] arg)
{
	// this we are doing "Association" ie. calling DM. and MF. of other class without using extends..
new B1.B2.B3.multiplepackage1_at_diff_location().mul(2,3);
System.out.println();
new B1.B2.B3.multiplepackage2_at_diff_location().div(10,5);
System.out.println();
new B1.B2.B3.multiplepackage3_at_diff_location().mod(9,2);
System.out.println();
new A1.A2.A3.multiple_packages_parentof_import2().sum(4,2);
System.out.println();
new A1.A2.A3.multiple_packages2_parentof_import2().sub(5,1);
}
}