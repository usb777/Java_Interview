package interviews.matrix;

/**
 input:
1 2 3
4 5 6
7 8 9


output:
3 2 1
6 5 4
9 8 7


a[i][j]
int temp;
int k=0;
for (int i=0; i<a.length;i++) // line
{
  for (int j=a[i].lenth-1;  j>0;  j--)  //column
  {
    temp =  a[i][j];
    a[i][k] = temp;
    k++;
  }
  k=0;
  }
*
 */


public class ReversedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
