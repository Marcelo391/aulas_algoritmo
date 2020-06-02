
public class for_label {

	public static void main(String[] args) {
		
		
		externo: for(int i = 1; i<=3 ;i++){
			for(int j = 1; j<=5 ;j++){
				if((i*j) == 5) break externo;
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}

	}
}
