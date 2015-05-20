import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Expressions {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null){
			char[] arr=new char[line.length()];
			
			for(int i=0;i<line.length();i++){
				if(i==0||line.charAt(i)=='('||line.charAt(i)=='{'||line.charAt(i)=='[')
					arr[i]=line.charAt(i);
				else{
					if(line.charAt(i)==')'){
						for(int m=0;m<i;m++){
							if(line.charAt(m)=='('){
								arr[m]='o';
								arr[i]='o';
							}
						}
					}
					else if(line.charAt(i)=='}'){
						for(int m=0;m<i;m++){
							if(line.charAt(m)=='{'){
								arr[m]='o';
								arr[i]='o';
							}
						}
					}
					else if(line.charAt(i)==']'){
						for(int m=0;m<i;m++){
							if(line.charAt(m)=='['){
								arr[m]='o';
								arr[i]='o';
							}
						}
					}
				}
			}
			
			boolean bool=true;
			for(int n=0;n<arr.length;n++){
				System.out.println(arr[n]);
				if(arr[n]!='o'){
					bool=false;
				}
			}
			System.out.println(bool);
		}
	}
	
}
