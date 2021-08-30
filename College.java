package week3day2;

public class College extends university {

@Override
void ug() {
	System.out.println("UG Course");
	
}
public static void main (String[] args)
{
	College obj = new College();
	obj.ug();
	obj.pg();
	

}


}
