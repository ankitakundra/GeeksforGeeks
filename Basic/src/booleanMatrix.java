import java.util.Scanner;

public class booleanMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- != 0) {
			
			int r = sc.nextInt();
			int c = sc.nextInt();
			int matrix[][]  = new int[r][c];
			for( int i =0;i<r;i++)
			{
				for( int j=0;j<c;j++)
				{
					matrix[i][j] = sc.nextInt();
				}
			}
			int row[] = new int[r];
			int col[] = new int[c];
			  for (int i = 0; i < r; i++)
			    {
			        for (int j = 0; j < c; j++)
			        {
			            if (matrix[i][j] == 1)
			            {
			                row[i] = 1;
			                col[j] = 1;
			            }
			        }
			    }
			    for (int i = 0; i < r; i++)
			    {
			        for (int j = 0; j < c; j++)
			        {
			            if ( row[i] == 1 || col[j] == 1 )
			            {
			                matrix[i][j] = 1;
			            }
			        }
			    }
			    printMatrix(matrix,r,c);
			    System.out.println();
			    
			}
			
		}
	public static void printMatrix(int mat[][],int r,int c)
    {
        int i, j;
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
        }
    }

	}

