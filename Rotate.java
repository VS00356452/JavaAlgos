import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Roate {
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(br.readLine());
		
		int[][] arr1=new int[m][m];
		int[][] arr2=new int[m][m];
		for(int i=0;i<m;i++){
			String line=br.readLine();
			String[] splitLine=line.split(" ");
			for(int p=0;p<m;p++){
				arr1[i][p]=Integer.parseInt(splitLine[p]);
			}
		}
		
		
		int l=0;
		for(int i=0;i<m;i++){
			for(int j=m-1;j>=0;j--){
				arr2[i][l]=arr1[j][i];
				l++;
			}
			l=0;
		}
		System.out.println("The rotated array is ");
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
